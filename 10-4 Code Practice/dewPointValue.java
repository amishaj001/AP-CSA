/*

Amisha Jain
AP CSA P2
10-4-19

The dew point temperature Td can be calculated(approximately) from the relative
humility RH and the actual temperature T by

Td = b * f(T, RH) / a - f(T, RH)

f(T, RH) = (a * T / b + T) + ln(RH)

where a = 17.27 and b = 237.7 degrees Celcius

Write a program that reads the relative humidity(between 0 and 1) and the temperature
(in degrees Celcius) and prints the dew point value. Use the Java function log
to compute the natural logarithm.

*/


import java.util.Scanner;

public class dewPointValue{
  public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("What is the relative humidity(0-1): ");
      double humidity = in.nextDouble();
      System.out.println("What is the temperature(degrees Celcius): ");
      double temperature = in.nextDouble();
      double a = 17.27;
      double b = 237.7;
      double logValue = Math.log(humidity);
      double func = ((a * temperature) / (b + temperature)) + (logValue);
      double Td = (b * func) / (a - func);
      System.out.println("The Dew Point Temperature is " + Td);
    }
}
