package computations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Compute {
  // java arguments do NOT have default values,
  // we cannot pass "named arguments"
  public static void showList(List<String> ls, String message) {
    for (String n : ls) {
      System.out.println(message + n);
    }
    System.out.println("-------------------------");
  }

  public static void showList(List<String> ls) {
    showList(ls, ">> ");
  }

/*  Method overloading
  public static Cake makeCake(Flour f, Water w, Eggs e) {}
  public static Cake makeCake(PacketMix p) {}
*/
  public static void main(String[] args) {
    int x = 3;
    int y = 4;
    // java 10 and onwards
    //var name = "Hello";
//    x = "Hello";
    System.out.println(x + y);
    // operators for use in expressions
    // + - * / %
    // == > < >= <= !=
    // ? : -- "if else" as expression

    // control structures
    // conditional

    // expression (x > y) MUST be boolean
    if (x > y) {
      System.out.println("x is greater than y!");
    } else if (x == y) {
      System.out.println("They're the same");
    } else {
      System.out.println("x is smaller!");
    }

    while (x > 0) {
      System.out.println("x is " + x);
//      x = x - 1;
//      x -= 1;
      int x1 = x--; // ++x x++ --x x--
      System.out.println("after change x1 is " + x1 + " and x is " + x);
    }

    do {
      System.out.println("in do loop x is " + x);
    } while (x > 0);

    for (int idx = 0; idx < 4; idx++) {
      System.out.println("idx is " + idx);
    }

    String[] names = { "Fred", "Jim", "Sheila" };
    System.out.println("Element zero of names is " + names[0]);
//    names[3] = "Andy"; // NO cannot add beyond end of allocated array
    for (String n : names) {
      System.out.println("Name is " + n);
    }

    List<String> ls = new LinkedList<>();//new ArrayList<>();
    ls.add("Fred");
    ls.add("Jim");
    ls.add("Sheila");
//    for (String n : ls) {
//      System.out.println("name from List is " + n);
//    }
    showList(ls, "name from list is ");
    ls.add("Andy");
//    for (String n : ls) {
//      System.out.println("name from longer List is " + n);
//    }
    showList(ls, "name from longer list is ");

    /*Array*/List<String> l2 = new ArrayList<>();
    l2.add("William");
    l2.add("Bert");
    showList(l2, "from an arrayList: ");
  }
}
