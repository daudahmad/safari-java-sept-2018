package objects;

public class MyDate {
  private int day;
  private int month;
  private int year;

  // Constructor
  public MyDate(int day, int month, int year) {
    if (month >= 1 && month <= 12 && day >= 1 && day <= daysInMonth(month, year)) {
      this.day = day;
      this.month = month;
      this.year = year;
    } else {
      throw new IllegalArgumentException("Bad date values!");
    }
  }
  public int getDay() {
    return this.day;
  }
  public int getMonth() {
    return this.month;
  }
  public int getYear() {
    return this.year;
  }

  public void tomorrow() {
    this.day++;
    if (this.day > daysInMonth(this.month, this.year)) {
      this.day = 1;
      this.month++;
      if (this.month == 13) {
        this.month = 1;
        this.year++;
      }
    }
  }

  @Override
  public String toString() {
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
