package structureddatatype;

public class MyDate {
  int day;
  int month;
  int year;

  public static String asString(MyDate md) {
    return "Day is " + md.day + " month is " + md.month + " year is " + md.year;
  }

  public static int dayOfWeek(MyDate md) {
    return dayOfWeek(md.day, md.month, md.year);
  }

  public static int dayOfWeek(int day, int month, int year) {
    int m = (month < 3) ? month + 12 : month;
    int y = (month < 3) ? year - 1 : year;
//    if (month < 3) {
//      m = month + 12;
//    } else {
//      m = month;
//    }
//    if (month < 3) {
//      y = year - 1;
//    } else {
//      y = year;
//    }
    int dow = (day + (13 * (m + 1) / 5) + y + y/4 - y/100 + y/400) % 7;
    return dow;
  }
}
