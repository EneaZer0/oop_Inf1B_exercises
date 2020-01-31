import java.util.Scanner;

public class NMax {

  public static int max(int a, int b, int c) {

    int[] maximum_array = new int[]{a, b, c};
    int maximum = a;

    for (int i = 0; i < 3; i++) {

      if (maximum <= maximum_array[i]) {

        maximum = maximum_array[i];

      }

    }

    return maximum;
  }

  public static double max(double a, double b, double c){
    double[] maximum_array = new double[]{a, b, c};
    double maximum = a;

    for (int i = 0; i < 3; i++) {

      if (maximum <= maximum_array[i]) {

        maximum = maximum_array[i];

      }

    }

    return maximum;
  }

  public static void main(String[] args) {

    Scanner stdIn = new Scanner(System.in);

    double a = stdIn.nextInt();
    double b = stdIn.nextInt();
    double c = stdIn.nextInt();

    double maximum = max(a, b, c);
    System.out.println(maximum);

    stdIn.close();
  }

}
