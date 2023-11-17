package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        logger.info("A fundamental calculator for exponential, nCr and Greatest Common Divisor");
        System.out.println("Welcome to the calculator app");
        int choice = 0;
        while(choice != 99){
            System.out.println("Please choose the operation you want to perform");
            System.out.println("1. Power");
            System.out.println("2. Natural Logarith");
            System.out.println("3: GCD");
            System.out.println("99: Exit");
            choice = reader.nextInt();
            if(choice == 1) {
                System.out.println("You have chosen power functions");
                System.out.println("Please enter base and exponent");
                int base = reader.nextInt();
                int exp = reader.nextInt();
                logger.info("Now executing power function");
                int answer = power(base, exp);
                System.out.println(base + " raise to the power " + exp + " is: ");
                System.out.println(answer);
            }
            else if(choice == 2){
                System.out.println("Lets go ahead with log");
                System.out.println("Please enter the arguement");
                int n = reader.nextInt();
                if(n <= 0) System.out.println("Invalid"); 
                
                System.out.println(elog(n));
            }
            else if(choice == 3){
                System.out.println("You have chosen GCD function");
                System.out.println("Please enter the two number");
                int a = reader.nextInt();
                int b = reader.nextInt();
                logger.info("Now calculating gcd");
                System.out.println("GCD of " + a + " and " + b);
                System.out.println(gcd(a, b));
            }
            
        }
    }

    public static int power(int base, int exp){
        int initialBase = base;
        int initalExp = exp;
        int answer = 1;
        while(exp > 0) {
            if ((exp & 1) == 1) {
                answer *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return answer;
    }

    public static double elog(int n){
        return Math.log(n);
    }

    public static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}