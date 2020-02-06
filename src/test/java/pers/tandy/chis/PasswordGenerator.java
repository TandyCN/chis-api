package pers.tandy.chis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PasswordGenerator {

    @Test
    public void getPassword() {
        String account = "super";
        String password= "123456";
        // System.out.println(EncryptionUtils.getShiroSaltCode(password, account));
    }

}
