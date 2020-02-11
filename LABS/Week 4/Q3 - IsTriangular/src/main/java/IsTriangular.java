import java.util.Scanner;

public class IsTriangular {

  public static boolean isTri(double a, double b, double c) {

    boolean result = false;

    double sum_sides_a = b + c;
    double sum_sides_b = a + c;
    double sum_sides_c = a + b;

    if ((a >= 0) && (b >= 0) && (c >= 0)) {

      if (a < sum_sides_a && b < sum_sides_b && c < sum_sides_c) {

        result = true;

      }
    } else {

      result = false;

    }
    
    return result;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    double a = stdIn.nextDouble();
    double b = stdIn.nextDouble();
    double c = stdIn.nextDouble();

    if (isTri(a, b, c)) {
      System.out.printf("%s, %s and %s could be the lengths of a triangle\n", a, b, c);
    }
    else {
      System.out.println("Not a triangle.");
    }

    stdIn.close();

  }

}
