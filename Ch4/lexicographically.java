/*

Amisha Jain
AP CSA P2
10-10-19

Write a program that reads in three strings and sorts them lexicographically.
  Enter three strings: Charlie  Able  Baker
  Able
  Baker
  Charlie

*/

import java.util.Scanner;

public class lexicographically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string " );
        String a = input.nextLine();
        System.out.print("Enter a second string " );
        String b = input.nextLine();
        System.out.print("Enter a third string " );
        String c = input.nextLine();
        input.close();

        if(a.compareTo(b) > b.compareTo(c)){
          System.out.println(a);
        } else if(b.compareTo(c) > a.compareTo(b)){
          System.out.println();
        }


}
