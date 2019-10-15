/*

String name1 = "Bill Gates", phone1 = "111-111-1111", sal1 = "500,000";
String name2 = "Sheryl Sandberg", phone2 = "222-222-2222", sal2 = "40,000";
String name3 = "Larry Ellison", phone3 = "333-333-3333", sal3 = "250,000";
String name4 = "Marissa Mayer", phone4 = "444-444-4444", sal4 = "325,000";


Left align name and phone number.  Right align salary.

Amisha Jain
AP CSA P2
10-14-19

*/

public class Format{
  public static void main(String[] args){

    String name1 = "Bill Gates";
    String phone1 = "111-111-1111";
    String sal1 = "500,000";
    String name2 = "Sheryl Sandberg";
    String phone2 = "222-222-2222";
    String sal2 = "40,000";
    String name3 = "Larry Ellison";
    String phone3 = "333-333-3333";
    String sal3 = "250,000";
    String name4 = "Marissa Mayer";
    String phone4 = "444-444-4444";
    String sal4 = "325,000";

    System.out.printf( "%-15s %-5s %25s %n", name1, phone1, sal1);
    System.out.printf( "%-15s %-5s %25s %n", name2, phone2, sal2);
    System.out.printf( "%-15s %-5s %25s %n", name3, phone3, sal3);
    System.out.printf( "%-15s %-5s %25s %n", name4, phone4, sal4);

  }

}
