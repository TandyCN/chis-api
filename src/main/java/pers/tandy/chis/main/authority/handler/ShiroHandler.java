package pers.tandy.chis.main.authority.handler;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ConcurrentAccessException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.authority.component.ShiroSessionManager;
import pers.tandy.chis.main.common.PageResult;
import pers.tandy.chis.main.component.JWTUtils;
import pers.tandy.chis.modules.systemmanagement.bean.User;

/**
 * Shiro 的鉴权管理
 *
 * 该类中的方法不要涉及到业务操作
 * 所有方法的访问路径应在 AccessTokenInterceptor 拦截器排除
 * 并在 ShiroFilterChainDefinitionMap 中添加对应的匿名访问权限
 *
 * 该类主要为 登录操作、登出操作、强制登出操作
 *
 * @Author: Tandy
 * @Date: 2019/5/8 16:03
 * @Version 1.0
 */
@RestController
public class ShiroHandler {

    @Autowired
    private ShiroSessionManager shiroSessionManager;

    /**
     * 登录操作
     * 登录成功后返回一个 JSON 格式的 PageResult 对象
     */
    @PostMapping("/login")
    public PageResult login(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {

        // 认证用户
        Subject currentUser = SecurityUtils.getSubject();
        if(!currentUser.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(false);// 记住我功能 true开启 , false关闭
            currentUser.login(token);
        }

        // 开启单点登录
        shiroSessionManager.singleLogin(currentUser);

        // 生成 Token 并返回
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        String accessToken = JWTUtils.getInstance().produceToken(user);
        PageResult pageResult = PageResult.success().code(226).resultSet("Authorization", accessToken);

        return pageResult;
    }

    /**
     * 无权限处理
     * 抛出异常交由异常全局处理器
     */
    @RequestMapping("/unauthorized")
    public void unauthorized() {
        throw new UnauthorizedException();
    }

    /**
     * 正常登出 或 session 失效登出
     */
    @RequestMapping("/logout")
    public void logout() {
        Subject subject = SecurityUtils.getSubject();
        if (shiroSessionManager.isRepeatLogin(subject)) {
            shiroSessionManager.removeRepeatLogin(subject);
        }
        subject.logout();
        throw new ExpiredCredentialsException();
    }

    /**
     * 强制下线
     * 交由异常进行返回
     */
    @RequestMapping("/forcedLogout")
    public void forcedLogout() {
        SecurityUtils.getSubject().logout();
        throw new ConcurrentAccessException();
    }

}
