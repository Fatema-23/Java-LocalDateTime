/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javalocaldatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoField;
import java.time.LocalTime;
import java.time.Clock;
import java.time.*;


public class JAVAlocalDateTime {

    public static void main(String[] args) {
        /////Create Local Date//////
       // LocalDate localDate = LocalDate.now();
        //LocalDate localDate1 = LocalDate.of(2022,6,3);
       // LocalDateTime dateTime= localDate.atTime(4, 30);
        
        //System.out.println(localDate);
      //  System.out.println(dateTime);
       // System.out.println(localDate1);
       
       ////With method////
      // System.out.println(localDate.atStartOfDay());
       //System.out.println(localDate.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
     //  System.out.println(localDate.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY)));
    
     /////Get Method////////
//System.out.println(localDate.get(ChronoField.MONTH_OF_YEAR));
//System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));
//System.out.println(localDate.get(ChronoField.YEAR));
//System.out.println(localDate.get(ChronoField.DAY_OF_YEAR));

//System.out.println(localDate.getYear());
//System.out.println(localDate.getDayOfMonth());
//System.out.println(localDate.getMonth());
//System.out.println(localDate.getMonthValue());

/*LocalDate newDate =localDate.plusMonths(5);
//LocalDate newDate1 =localDate.minusYears(4);
LocalDate newDate1 =localDate.minusYears(4).minusDays(5).minusWeeks(2);
System.out.println(newDate);
System.out.println(newDate1); */


////////create local time////////

//LocalTime time =LocalTime.now();
//System.out.println(time);

//LocalDateTime dateTime = time.atDate(LocalDate.now());

//System.out.println(dateTime);
    
/////get Method///////
//System.out.println(time.get(ChronoField.HOUR_OF_DAY));
//System.out.println(time.get(ChronoField.MINUTE_OF_DAY));
//System.out.println(time.get(ChronoField.MINUTE_OF_HOUR));


///////with method//////
//LocalTime localTime = time.withHour(5);
//System.out.println(localTime);


/////////////Local Date & Time//////////////

/*  LocalDate localDate = LocalDate.now();
LocalTime localTime = LocalTime.now();


LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);  ///date time obj

System.out.println(localDateTime);*/

//Clock clock = Clock.system(ZoneId.systemDefault());
//LocalDateTime localDatetime = LocalDateTime.now(clock);

//ZoneId id = ZoneId.of("Asia/Dhaka");
//LocalDateTime localDatetime = LocalDateTime.now(id);


LocalDateTime localDatetime = LocalDateTime.now();


//System.out.println(localDatetime);
//System.out.println(localDatetime.get(ChronoField.MINUTE_OF_DAY));
//System.out.println(localDatetime.get(ChronoField.DAY_OF_YEAR));

//Month month = localDatetime.getMonth();
//System.out.println(month);
//
//
//DayOfWeek = localDatetime.getDayOfWeek();
//System.out.println(week);week = localDatetime.getDayOfWeek();
//System.out.println(week);

System.out.println(localDatetime);
LocalDateTime localDatetime1=localDatetime.plusMonths(4).plusDays(12).minusHours(7);  
System.out.println(localDatetime1);
    }
}
