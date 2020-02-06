package pers.tandy.chis.main.authority.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import pers.tandy.chis.modules.systemmanagement.bean.Clinic;
import pers.tandy.chis.modules.systemmanagement.bean.Role;
import pers.tandy.chis.modules.systemmanagement.bean.User;
import pers.tandy.chis.modules.systemmanagement.service.ClinicService;
import pers.tandy.chis.modules.systemmanagement.service.RoleService;
import pers.tandy.chis.modules.systemmanagement.service.UserService;

import java.util.HashSet;
import java.util.Set;

/**
 * 自定义 realm
 * 用于对用户的登录认证和授权
 *
 * @Author: Tandy
 * @Date: 2019/5/8 15:35
 * @Version 1.0
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private ClinicService clinicService;


    /**
     * Realm 的加密方式
     */
    {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        hashedCredentialsMatcher.setHashIterations(100);
        this.setCredentialsMatcher(hashedCredentialsMatcher);
    }

    /**
     * 授权信息
     * 获取用户分组信息进行权限鉴权
     *
     *  注意：此处是将分组的 ID 放入到 shiro 的 roles 中进行匹配的
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) principalCollection.getPrimaryPrincipal();
        Set<String> roles = new HashSet<>();
        roles.add(user.getSysRoleId().toString());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
        return info;
    }

    /**
     * 认证信息
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        User user = userService.getByAccount(username);

        if(user == null) {
            throw new UnknownAccountException("账户不存在");
        }

        if(!user.getState()) {
            throw new LockedAccountException("账户被禁用");
        }

        Role role = roleService.getById(user.getSysRoleId());

        if(role == null || !role.getState()) {
            throw new LockedAccountException("账户分组被禁用");
        }

        // 将分组信息和门诊信息放入到 user 对象
        Clinic clinic = clinicService.getById(user.getSysClinicId());
        user.setRole(role);
        user.setClinic(clinic);

        // 验证用户
        Object principal = user;
        // 需要对比的密码
        Object credentials = user.getPassword();
        // 盐值
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);
        // 当前 Realm 类名
        String realmName = getName();

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
        return info;
    }
}
