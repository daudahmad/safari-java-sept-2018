package objects;

public class UseMyDate {
  public static void main(String[] args) {
    System.out.println("Day of Jan 1 2000 is " + MyDate.dayOfWeek(1, 1, 2000));
    System.out.println("Day of Mar 1 1999 is " + MyDate.dayOfWeek(1, 3, 1999));
//    int day = 1;
//    int month = 2;
//    int year = 2018;
//    int otherDay = 12;
//    int otherMonth = 11;
//    int otherYear = 2016;

    MyDate d1 = new MyDate();
    d1.day = 1; d1.month = 2; d1.year = 2018;
    MyDate d2 = new MyDate();
    d2.day = 12; d2.month = 11; d2.year = 2016;

//    System.out.println("Date " + MyDate.asString(d1)
//        + " is on day number " + MyDate.dayOfWeek(d1));
    System.out.println("Date " + d1.asString()
        + " is on day number " + d1.dayOfWeek());
  }
}
