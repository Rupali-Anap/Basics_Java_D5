package com.briedgelabz.basics;
import java.util.Scanner;
public class leap_year {

        public static void main(String[] args) {

            Scanner Year = new Scanner(System.in);
            System.out.println("Enter the year");
            int year = Year.nextInt();
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
                System.out.println( year+ " year is leap year");
            } else {
                System.out.println(year + " year is not a leap year");
            }
        }

}
