public class SquaresLoop {

    public static void main(String[] args) {

        int numbers = 1;

        int square = numbers*numbers;

        for (int count = 0; count < 10; count++) {
            System.out.print(square + " ");
            numbers++;
            square = numbers*numbers;
        }
        System.out.println("\n");


    }

}
