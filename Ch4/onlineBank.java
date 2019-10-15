/*
Amisha Jain
AP CSA P2

Needs work

*/


import java.util.Scanner;

public class onlineBank{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the initial balance in your acccount?" );
        int initialbalance = in.nextInt();
        System.out.println("What is the interest rate for your acccount?" );
        int interest = in.nextInt();

        calculate(initialbalance, interest);
        printResults(initialbalance, interest, afterMonth);
        /*int firstMonth = initialbalance + ((initialbalance * interest) / 100);
        int secondMonth = firstMonth + ((firstMonth * interest) / 100);
        int thirdMonth = secondMonth + ((secondMonth * interest) / 100);
        System.out.println("Initial balance: " + initialbalance);
        System.out.println("Annual interest rate in percent: " + interest);
        System.out.println("After first month: " + firstMonth);
        System.out.println("After second month: " + secondMonth);
        System.out.println("After third month: " + thirdMonth); */
    }

  /*  public static String data(double initialbalance, int interest){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the initial balance in your acccount?" );
        initialbalance = in.nextInt();
        System.out.println("What is the interest rate for your acccount?" );
        interest = in.nextInt();
    }
*/
    public static void calculate(int initialbalance, int interest){
        int afterMonth = initialbalance + ((initialbalance * interest) / 100);
    }

    public static void printResults(int initialbalance, int interest, int afterMonth){
        //calculate(afterMonth);
        System.out.println("Initial balance: " + initialbalance);
        System.out.println("Annual interest rate in percent: " + interest);
        System.out.println("After a month: " + afterMonth);
    }
}
