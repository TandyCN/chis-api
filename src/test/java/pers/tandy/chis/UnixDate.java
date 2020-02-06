package pers.tandy.chis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnixDate {

    @Test
    public void contextLoads() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 当前时间转 Unix时间戳
        long nowTime = new Date().getTime();
        System.out.println("现在的时间转为unix为 ====> " + nowTime);

        // 将Unix时间戳 转成日期格式
        Date unixDate = new Date(1559520619562L);
        String formatUnixDate = df.format(unixDate);
        System.out.println("unix转成时间格式为 ====> " + formatUnixDate);

        // 两个时间戳计算结果为 毫秒
        // 除以 1000 得到秒
        // 除以 1000 除以 60 得到分
        // 除以 1000 除以 60 除以 60 得到小时
        // 除以 1000 除以 60 除以 60 除以60 得到天
    }
}
