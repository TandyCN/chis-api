package pers.tandy.chis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.tandy.chis.main.component.DateUtils;
import pers.tandy.chis.main.component.EncryptionUtils;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.main.component.PyUtils;
import pers.tandy.chis.modules.chargesitemmanagement.bean.ItemAdjustPrice;
import pers.tandy.chis.modules.chargesitemmanagement.service.ItemAdjustPriceService;
import pers.tandy.chis.modules.purchasemanagement.service.PurchaseOrderService;
import pers.tandy.chis.modules.purchasemanagement.service.PurchasePlanService;
import pers.tandy.chis.modules.systemmanagement.bean.Role;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ChisApiApplicationTests {

    @Test
    public void contextLoads() {

        String account = "super";
        String password = "123456";

        System.out.println(EncryptionUtils.getShiroSaltCode(account, password));
    }

    @Test
    public void testDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        Date date1 = null;
        Date date2 = null;

        try {
            date2 = dateFormat.parse("2012-08-02 12:01:32");
            date1 = dateFormat.parse("2018-08-07 13:01:32");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(date1);
        calendar2.setTime(date2);
        int day1 = calendar1.get(Calendar.DAY_OF_YEAR);
        int day2 = calendar2.get(Calendar.DAY_OF_YEAR);
        int year1 = calendar1.get(Calendar.YEAR);
        int year2 = calendar2.get(Calendar.YEAR);
        if(year1 > year2) {
            int tempyear = year1;
            int tempday = day1;
            day1 = day2;
            day2 = tempday;
            year1 = year2;
            year2 = tempyear;
        }
        if (year1 == year2) {
            System.out.printf("相隔的天数为:%s天", (day2 - day1));
        } else {
            int DayCount = 0;
            for (int i = year1; i < year2; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    DayCount += 366;
                }else {
                    DayCount += 365;
                }
            }
            System.out.printf("相隔的天数为:%s天", DayCount+(day2-day1));

        }
    }


    @Test
    public void testDate2 () {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 1);
        Date date = calendar.getTime();
    }

    @Test
    public void test3() {
        // System.out.println(Math.ceil(10.123412 * 10000) / 10000);
        int i = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        System.out.println(i);

        // 时间戳
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmSSS");
        String dateStr = formatter.format(new Date());
        System.out.println(dateStr);
    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = formatter.parse("2019-09-25");
        Date date2 = formatter.parse("2019-09-26");

        // data1与 date2 大于关系返回 正整数  相等关系返回 0 小于关系返回负整数
        System.out.println(date1.compareTo(date2));

        System.out.println(date1.after(date2));

    }


    @Test
    public void test5() {
    }

    @Test
    public void test6() {

        String timeRegex = "^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29))\\s+([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";

        boolean flag = Pattern.matches(timeRegex, "2012-22-31 12:07:59");

        System.out.println("**************************************");
        System.out.println(flag);
        System.out.println("**************************************");

    }














}
