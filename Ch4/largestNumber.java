/*

Amisha Jain
AP CSA P2
10-8-19

Write a program that reads in three floating-point numbers and prints the
largest of the three inputs. For example:
  Please enter three numbers: 4 9 2.5
  The largest number is 9.

*/

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: " );
        int a = input.nextInt();
        System.out.print("Please enter a second number: " );
        int b = input.nextInt();
        System.out.print("Please enter a third number: " );
        int c = input.nextInt();
        input.close();

        if(a>b && a>c)
        {
          System.out.println("The largest number of the three you entered is " + a);
        }
        else if(b>a && b>c)
        {
          System.out.println("The largest number of the three you entered is " + b);
        }
        else
        {
          System.out.println("The largest number of the three you entered is " + c);
        }
}}
