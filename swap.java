package com.briedgelabz.basics;
import java.util.Scanner;
public class swap {

        public static void main(String[] args) {

            int num = 0;
            final Scanner swap = new Scanner(System.in);
            System.out.println("Enter First Number:");
            int x = swap.nextInt();
            System.out.println("Enter Second Number");
            int y = swap.nextInt();
            System.out.println("Original Number is " + x + "" + y);
            num = x;
            x = y;
            y = num;
            System.out.println("Number After Swaping " + x + "" + y);
        }

}
