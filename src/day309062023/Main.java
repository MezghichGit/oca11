package day309062023;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//Date date =  new Date();
		//System.out.println(date);
		// 1)Creating dates and times
		
		/*ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);*/
		
		//LocalDate ld = LocalDate.now();
		//LocalDate ld = LocalDate.of(2020,10,31);
		/*
		LocalDate ld = LocalDate.of(2020,Month.OCTOBER,31);
		System.out.println(ld);
		
		//LocalTime lt = LocalTime.now();
		LocalTime lt = LocalTime.of(14,30);
		System.out.println(lt);
		
		//LocalDateTime ldt = LocalDateTime.of(ld, lt);
		LocalDateTime ldt = LocalDateTime.of(2010,06,10,19,30);
		System.out.println(ldt);*/
		// 2)Manipulating dates and times
		/*
		LocalDate ld = LocalDate.of(2010, 06, 01);*/
		/*ld = ld.plusDays(10);
		ld = ld.plusYears(2);
		ld = ld.minusMonths(2);
		System.out.println(ld);*/
		/*
		Period period = Period.of(2, 0, 4);
		ld = ld.plus(period);
		System.out.println(ld);
		
		Period p = Period.ofDays(2);
		//Duration duration = Duration.ofMinutes(45);
		Duration duration = Duration.ofDays(2);
		LocalTime lt = LocalTime.of(14,30);
		System.out.println(lt);
		lt = lt.plus(duration);
		System.out.println(lt);
		System.out.println(period);
		System.out.println(duration);*/
		
		
		// 3)Formatting dates and times
		
		LocalDate ld = LocalDate.of(2020, 10, 10);
		/*System.out.println(ld);
		DateTimeFormatter monFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ld.format(monFormat));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.format(monFormat));*/
		/*DateTimeFormatter monFormat = DateTimeFormatter.ofPattern("yyyy**MMM/dd");
		System.out.println(ld.format(monFormat));*/
		
		String anniv = "10-03-2020";
		DateTimeFormatter monFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate myBd = LocalDate.parse(anniv, monFormat);
		System.out.println(myBd);
		
		//String res = LocalDate.parse("2014-10-02").format(DateTimeFormatter.ISO_DATE_TIME);
		String res = LocalDate.parse("lundi-2014-10").format(DateTimeFormatter.ISO_DATE);
		System.out.println(res);
	}

}
