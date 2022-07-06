package com.briedgelabz.basics;
import java.util.Scanner;
public class flipcoins {
    public static void main(String[] args) {



                Scanner coin = new Scanner(System.in);
                int head = 0;
                int tail = 0;
                System.out.println("Enter the no of coin filps");
                int number_Of_Flips = coin.nextInt();
                for (int i = 0; i <= number_Of_Flips; ++i) {
                    double random = Math.random();
                    if (random < 0.5) {
                        ++head;
                    }
                    else {
                        ++tail;
                    }
                }
                System.out.println("Head_Count :" +head);
                System.out.println("Tail_Count :" +tail);
                double H_Percnt = head / (double)number_Of_Flips;
                double Head_count = H_Percnt * 100.0;
                System.out.println(" Head Probability is :" + Head_count);
                double T_Percnt = head / (double)number_Of_Flips;
                double Tail_count = T_Percnt * 100.0;
                System.out.println("Tails Probability is: " + Tail_count);
            }



}
