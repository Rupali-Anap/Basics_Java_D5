package com.briedgelabz.basics;
import java.util.Scanner;
public class prime_factor {

        public static void main(String[] args) {
            Scanner factor = new Scanner(System.in);
            System.out.println("Enter Number");
            int a = factor.nextInt();
            for (int i = 2; i * i <= a; ++i) {
                while (a % i == 0) {
                    a /= i;
                    System.out.print(String.valueOf(i) + " ");
                }
            }
            if (a != 1) {
                System.out.print(a);
            }
        }

}
