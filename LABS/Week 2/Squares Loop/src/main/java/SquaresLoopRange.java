public class SquaresLoopRange {

    public static void main(String[] args) {

        int number = (Integer.parseInt(args[0]));
        int square = number * number;
        int value = (Integer.parseInt(args[1])) + 1;

        if (number < value) {

            for (int count = number; count < value; count++) {
                System.out.print(square + " ");
                number++;
                square = number * number;
            }
            System.out.println("\n");

        } else {

            System.out.println("Start-limit greater than stop-limit!");

        }
    }

}
