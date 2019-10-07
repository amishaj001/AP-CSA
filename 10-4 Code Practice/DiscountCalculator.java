/*

Amisha Jain
AP CSA P2
10-4-19

A video club wants to reward its best members with a discount based on the member's
number of movie rentals and the number of new members referred by the member. The
discount is in percent and is equal to the sum of the rentals and the referrals,
but it cannot exceed 75 percent. Write a program DiscountCalculator to calculate
the value of the discount.

*/

import java.util.Scanner;

public class DiscountCalculator{
  public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of movie rentals: " );
      double movies = in.nextInt();
      System.out.println("Enter the number of members referred to the video club: " );
      double members = in.nextInt();
      double discount = movies + members;
      if (discount <= 75.00) {
        System.out.println("The discount is equal to: " + discount + " percent.");
      } else{
        System.out.println("The discount is equal to: 75.00 percent.");
      }
    }
  }
