/*

Amisha Jain
AP CSA P2
10-3-19

The original US income tax of 1913 was quite simple. The tax was
  - 1 percent on the first $50,000
  - 2 percent on the amount over $50,000 up to $75,000
  - 3 percent on the amount over $75,000 up to $100,000
  - 4 percent on the amount over $100,000 up to $250,000
  - 5 percent on the amount over $250,000 up to $500,000
  - 6 percent on the amount over $500,000

There was no separate schedule for single or married taxpayers. Write a program
that computes the income tax according to this schedule.
  */

import java.util.Scanner;

public class incomeTax{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your income?" );
        double income = in.nextInt();

        if (income > 0 && income <= 50000){
            double incomeTax50 = income * 0.01;
            System.out.println("Your income tax is " + incomeTax50);
        }
        else if (income > 50000 && income <= 75000){
            double incomeTax50 = 50000 * 0.01;
            income = income - 50000;
            double incomeTax575 = income * 0.02;
            double incomeTaxFinal = incomeTax50 + incomeTax575;
            System.out.println("Your income tax is " + incomeTaxFinal);
        }
        else if (income > 75000 && income <= 100000){
            double incomeTax50 = 50000 * 0.01;
            double incomeTax75 = 75000 * 0.02;
            income = income - 75000;
            double incomeTax75100 = income * 0.03;
            double incomeTaxFinal = incomeTax50 + incomeTax75 + incomeTax75100;
            System.out.println("Your income tax is " + incomeTaxFinal);
        }
        else if (income > 100000 && income <= 250000){
          double incomeTax50 = 50000 * 0.01;
          double incomeTax75 = 75000 * 0.02;
          double incomeTax100 = 100000 * 0.03;
          income = income - 100000;
          double incomeTax100250 = income * 0.04;
          double incomeTaxFinal = incomeTax50 + incomeTax75 + incomeTax100 + incomeTax100250;
          System.out.println("Your income tax is " + incomeTaxFinal);
        }
        else if (income > 250000 && income <= 500000){
          double incomeTax50 = 50000 * 0.01;
          double incomeTax75 = 75000 * 0.02;
          double incomeTax100 = 100000 * 0.03;
          double incomeTax250 = 250000 * 0.04;
          income = income - 250000;
          double incomeTax250500 = income * 0.05;
          double incomeTaxFinal = incomeTax50 + incomeTax75 + incomeTax100 + incomeTax250 + incomeTax250500;
          System.out.println("Your income tax is " + incomeTaxFinal);
        }
        else{
          double incomeTax50 = 50000 * 0.01;
          double incomeTax75 = 75000 * 0.02;
          double incomeTax100 = 100000 * 0.03;
          double incomeTax250 = 250000 * 0.04;
          double incomeTax500 = 500000 * 0.05;
          income = income - 500000;
          double incomeTax500plus = income * 0.06;
          double incomeTaxFinal = incomeTax50 + incomeTax75 + incomeTax100 + incomeTax250 + incomeTax500 + incomeTax500plus;
          System.out.println("Your income tax is " + incomeTaxFinal);
        }
    }
}
