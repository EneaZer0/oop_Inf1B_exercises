import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class CoordinateConverter {

  /** Conversor from Rec(x,y) to Pol(R,phi) */
  public static double convertXYtoR(double x, double y) {
    // ADD CODE HERE
    /** Old version code W2 - PolarCoordinates
     *
     * double R = Math.sqrt( x*x + y*y);
     * double phi = Math.atan(y/x);
     *
     * System.out.println(R);
     * System.out.println(phi);
     */
    double R = Math.sqrt( x*x + y*y);

    return R;

  }

  /**       COMPROBAR QUE COÑO PASA                   */
  public static double convertXYtoT(double x, double y) {
    // ADD CODE HERE
    double theta = Math.atan2(x,y);

    return theta;
  }

  public static double convertRTtoX(double r, double theta) {
    // ADD CODE HERE
    double X = r * Math.cos(theta);

    return X;
  }

  public static double convertRTtoY(double r, double theta) {
    // ADD CODE HERE
    double Y = r * Math.sin(theta);

    return Y;
  }

  public static double convertDegToRad(double deg) {
    // ADD CODE HERE
   double Rad = (deg * Math.PI)/180;

   return Rad;
  }

  public static double convertRadToDeg(double rad) {
    // ADD CODE HERE
    double Deg = (rad * 180)/Math.PI;

    return Deg;
  }

  public static void main(String[] args) {

    /** Asking for values in Rec(X,Y) form */
    Scanner stdDoubles = new Scanner(System.in);

    System.out.println("Enter value X: ");
    double x = stdDoubles.nextDouble();

    System.out.println("Enter value Y: ");
    double y = stdDoubles.nextDouble();

    /** Calculations Rec(X,Y) to Pol(R,phi) */
    double R = convertXYtoR(x, y);
    System.out.println("R = " + R);

    double theta = convertXYtoT(x, y);
    System.out.println("Theta = " + theta);

    /** Calculations Pol(R,phi) to Rec(X,Y) */
    double X = convertRTtoX(R, theta);
    System.out.println("X = " + X);

    double Y = convertRTtoY(R, theta);
    System.out.println("Y = " + Y);

    /** Calculations Deg to Rad */
    double Deg = Math.toDegrees(theta);
    double Rad = convertDegToRad(Deg);
    System.out.println(String.format("%.3f Deg is equal to %.3f Rad", Rad, Deg));

    /** Calculations Rad to Deg */
    double Rad1 = theta;
    double Deg1 = convertRadToDeg(Rad1);
    System.out.println(String.format("%f Rad is equal to %f Deg", Deg1, Rad1));

    stdDoubles.close();
  }
}

