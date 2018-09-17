package objects;

public class Holiday extends MyDate {
  private String name;

  public Holiday(int day, int month, int year, String name) {
    super(day, month, year);
    this.name = name;
  }

  @Override
  public String toString() {
    return "Holiday called " + this.name + " on " + super.toString();
  }
}
