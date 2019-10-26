/*

Write a unit conversion program that asks the users from which unit they want
to convert(fl. oz, gal, oz, lb, ft, in, mi) and to which unit they want to
convert(ml, l, g, kg, mm, cm, m, km). Reject incompatible conversions(such as
gal -> km). Ask for the value to be converted, then display the result.

    Convert from? gal
    Convert to? ml
    Value? 2.5
    2.5 gal = 9462.5ml

Amisha Jain
AP CSA P2
10-21-19
*/

import java.util.Scanner;

public class UnitConversions{

  /*
  ml -> l
  g -> kg
  mm -> cm -> m -> km
  */

    public static void main(String[] args){
      boolean continuing = true;


      while(continuing == true){
        Scanner in = new Scanner(System.in);
        System.out.println("Convert from?" );
        String from = in.next().toLowerCase();
        System.out.println("Convert to?" );
        String to = in.next().toLowerCase();
        System.out.println("Value?" );
        double value = in.nextDouble();
              if (
                from.contains("cm") && to.contains("m")){
                System.out.println(value/100);
              }
                  else if(from.contains("cm") && to.contains("mm")){
                    System.out.println(value/10);

                    break;
                  }
                  else if(from.contains("cm") && to.contains("km")){
                    System.out.println(value*100000);
                    break;
                  }
                  else if(from.contains("mm") && to.contains("km")){
                    System.out.println(value*1000000);
                    break;
                  }
                  else if(from.contains("mm") && to.contains("m")){
                    System.out.println(value*1000);
                    break;
                  }
                  else if(from.contains("mm") && to.contains("cm")){
                    System.out.println(value*10);
                    break;
                  }
                  else if(from.contains("m") && to.contains("cm")){
                    System.out.println(value/100);
                    break;
                  }
                  else if(from.contains("m") && to.contains("km")){
                    System.out.println(value*1000);
                    break;
                  }
                  else if(from.contains("m") && to.contains("mm")){
                    System.out.println(value/1000);
                    break;
                  }
                  else if(from.contains("ml") && to.contains("l")){
                    System.out.println(value*1000);
                    break;
                  }
                  else if(from.contains("l") && to.contains("ml")){
                    System.out.println(value/1000);
                    break;
                  }
                  else if(from.contains("g") && to.contains("kg")){
                    System.out.println(value*1000);
                    break;
                  }
                  else if(from.contains("kg") && to.contains("g")){
                    System.out.println(value/1000);
                    break;
                  }
                  else{
                    System.out.print("Try again");
                    break;
              }

              System.out.println("Do you want to try again? (Yes/No)");
              String choice = in.next().toLowerCase();
              if (choice.contains("yes")){
                continuing = true;
              }
              else{
                continuing = false;
              }

      }}


}
