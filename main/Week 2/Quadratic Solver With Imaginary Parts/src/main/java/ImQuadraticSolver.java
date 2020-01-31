public class ImQuadraticSolver {

    public static void main(String[] args) {

        Double A = Double.parseDouble(args[0]), B = Double.parseDouble(args[1]), C = Double.parseDouble(args[2]), discriminant, div, sqrt;
        discriminant = ((B*B) - 4 * A * C);
        div = 2 * A;

        double solution1, solution2;

        double real, imaginary;

        if (A == 0) {

            real = (-C)/ B;
            System.out.println(real);

        } else if (discriminant >= 0) {

            sqrt = Math.sqrt(discriminant);

            solution1 = ((-B)+sqrt) / div;
            System.out.println(solution1);

            solution2 = ((-B)-sqrt) / div;
            System.out.println(solution2);

        } else {

            sqrt = Math.sqrt(Math.abs(discriminant));

            real = ((-B)/div);
            imaginary = ((sqrt)/div);
            System.out.println( real + " + " + imaginary + "i");
            System.out.println( real + " - " + imaginary + "i");


        }

    }

}
