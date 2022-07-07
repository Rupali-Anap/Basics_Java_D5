package com.briedgelabz.basics;
import java.util.Scanner;

public class vowel_consonant {

        public static void main(String[] args) {

            Scanner vc = new Scanner(System.in);
            System.out.println("Enter a Alphabet");
            char ch = vc.next().charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println((ch) + " is a Vowels");
            }
            else {
                System.out.println((ch) + " is a Consonents");
            }
        }

}
