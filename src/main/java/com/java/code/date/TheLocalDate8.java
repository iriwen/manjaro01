package com.java.code.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * created by yuxiaodong01 on 2020/12/01.
 */
public class TheLocalDate8 {

    public static void main(String[] args) {
        testLocalDate();
        testSplit();
    }

    public static  void testLocalDate(){
        //解析字符串时间
        LocalDate date = LocalDate.parse("2020-12-01");
        //解析字符串时间
        long timeStamp = date.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli();

        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate toLocalDate = dateTime.toLocalDate();

        //解析字符串时间
        long timeStamp2 = toLocalDate.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli();

        long epochMilli = dateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();

        System.out.println("date:" + timeStamp + " ;datatime : " + epochMilli + "toLocalDate :" + timeStamp2);

        long timeInterval = epochMilli - timeStamp;
    }

    public static void testSplit(){

        String mobile = "15669923501";
        String[] res = mobile.split(",");
    }
}
