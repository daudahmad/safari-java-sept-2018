package objects;

import java.util.Scanner;

public class UseMyDate {
  public static void showADate(MyDate md, String message) {
    System.out.println(message + md);
  }

  public static void main(String[] args) {
    System.out.println("Day of Jan 1 2000 is " + MyDate.dayOfWeek(1, 1, 2000));
    System.out.println("Day of Mar 1 1999 is " + MyDate.dayOfWeek(1, 3, 1999));
//    int day = 1;
//    int month = 2;
//    int year = 2018;
//    int otherDay = 12;
//    int otherMonth = 11;
//    int otherYear = 2016;

    MyDate d1 = new MyDate(1, 2, 2018);
//    d1.day = 1; d1.month = 2; d1.year = 2018;
    MyDate d2 = new MyDate(12, 11, 2016);
//    d2.day = 12; d2.month = 11; d2.year = 2016;

//    System.out.println("Date " + MyDate.asString(d1)
//        + " is on day number " + MyDate.dayOfWeek(d1));
    System.out.println("Date " + d1
        + " is on day number " + d1.dayOfWeek());

//    d1.day = 483; // !!! what???

    Scanner sc = new Scanner(System.in);

    boolean success = false;
    while (!success) {
      System.out.print("enter day: ");
      int day = sc.nextInt();

      try {
        MyDate newDate = new MyDate(day, 1, 2018);
        success = true;
        System.out.println(newDate);
      } catch (IllegalArgumentException iae) {
        System.out.println("That's a bad day, try again!");
      }
    }

    MyDate md1 = new MyDate(1, 2, 2003);
    showADate(md1, "this is md1 ");

    md1 = new Holiday(3, 4, 2005, "third of april");
    showADate(md1, "this is the holiday...");
  }
}
