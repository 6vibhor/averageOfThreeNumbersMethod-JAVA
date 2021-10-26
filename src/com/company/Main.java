package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    System.out.println("Enter three numbers:");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input2.nextDouble();
        double num3 = input3.nextDouble();
        average(num1,num2,num3);
    }
    public static void average(double num1,double num2,double num3) {
        System.out.println("The average of three number: " + (num1 + num2 + num3)/3.0);
    }
}
