import java.util.Scanner;

public class PolarCoordinates {

    public static void main(String[] args) {

        Scanner stdDouble = new Scanner(System.in);

        double x = stdDouble.nextDouble();
        double y = stdDouble.nextDouble();

        double R = Math.sqrt( x*x + y*y);
        double phi = Math.atan(y/x);

        System.out.println(R);
        System.out.println(phi);


    }

}
