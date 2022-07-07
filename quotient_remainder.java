package com.briedgelabz.basics;
import java.util.Scanner;
public class quotient_remainder {

        public static void main(String[] args) {

            Scanner num = new Scanner(System.in);
            System.out.print("Insert the Numerator ");
            int numerator =num.nextInt();
            System.out.print("Insert the  Denominator");
            int denominator = num.nextInt();
            double remainder = numerator % denominator;
            System.out.println("Remainder is :" + remainder);
            double quotient = numerator / denominator;
            System.out.println(" Quotient is :" + quotient);
        }

}
