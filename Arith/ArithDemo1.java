package Arith;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class ArithDemo1 {
    public static void main(String[] args) throws ParseException {
        String bir ="2000年1月1日";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日");
        Date date =sdf.parse(bir);
        long birthdayTime =date.getTime();
        long todayTime =System.currentTimeMillis();
        long time =todayTime -birthdayTime;
        System.out.println(time/1000/60/60/24);

        //JDK8
        LocalDate d1 =LocalDate.of(2000,3,1);
        LocalDate d2 =LocalDate.now();
        long days = ChronoUnit.DAYS.between(d1,d2);
        System.out.println(days);
        //闰年，true
        LocalDate d3 = d1.minusDays(1);
        int day2 = d3.getDayOfMonth();
        System.out.println(day2);
        System.out.println(d1.isLeapYear());
    }
}
