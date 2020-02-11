public class Distance2 {

    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int max = Math.max(number1,number2);
        int min = Math.min(number1,number2);

        int result = max - min;

        int distance = number1 - number2;

        if (distance > 0) {
            System.out.println(distance);
        } else {

            System.out.println(Math.abs(distance));

        }

    }
}
