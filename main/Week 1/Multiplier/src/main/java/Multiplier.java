public class Multiplier {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        int total = number1 * number2 * number3;

        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + total);

    }
}
