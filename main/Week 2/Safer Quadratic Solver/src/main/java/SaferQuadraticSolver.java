public class SaferQuadraticSolver {

    public static void main(String[] args) {

        // Declaration of basic variables
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        double C = Double.parseDouble(args[2]);
        double discriminant = ((B*B) - (4*A*C));

        // Declaration of solving variables
        double div = 2*A;
        double solution1;
        double solution2;
        double sqrt;

        if (discriminant >= 0 ) {

            if (A == 0 ) {

                System.out.println("A = 0. Cannot solve equation.");

            } else {

                sqrt = Math.sqrt(discriminant);

                solution1 = ((-B) + sqrt) / div;
                System.out.println(solution1);

                solution2 = ((-B) - sqrt) / div;
                System.out.println(solution2);

            }

        } else {

            System.out.println("Equation is not solvable for real x.");

        }

    }

}
