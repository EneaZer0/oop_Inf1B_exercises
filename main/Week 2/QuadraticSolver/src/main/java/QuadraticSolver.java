public class QuadraticSolver {

    public static void main(String[] args) {

        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        double C = Double.parseDouble(args[2]);
        double discriminant = ((B*B)-(4*A*C));

        double sqrt;
        double solution1;
        double solution2;
        double div;


        if (discriminant >= 0) {
            div = 2 * A;
            sqrt = Math.sqrt(discriminant);
            solution1 = (-(B) + sqrt) / div;
            solution2 = (-(B) - sqrt) / div;

            System.out.println(solution1);
            System.out.println(solution2);

        }

    }

}
