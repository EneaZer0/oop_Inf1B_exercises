
public class PolarCoordinates {

  public static void main(String[] args) {

    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);

    double R = Math.sqrt( x*x + y*y);
    double phi = Math.atan(y/x);

    System.out.println(R);
    System.out.println(phi);


  }

}
