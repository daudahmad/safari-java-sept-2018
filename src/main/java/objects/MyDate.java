package objects;

public class MyDate {
  int day;
  int month;
  int year;

  public String asString() {
    return "Day is " + this.day + " month is " + this.month
        + " year is " + this.year;
  }

  public int dayOfWeek() {
    return dayOfWeek(this.day, this.month, this.year);
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

  public static boolean isLeapYear(int year) {
    return (year / 4 == 0 && (year / 100 != 0 || year / 400 == 0));
  }

  public static int daysInMonth(int month, int year) {
    switch (month) {
      case 9: case 4: case 6: case 11: return 30;
      case 2: return isLeapYear(year) ? 29 : 28;
      default: return 31;
    }
  }
}
