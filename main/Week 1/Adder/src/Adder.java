public class Adder {

    public static void main(String[] args) {
        int myNumber1 = Integer.parseInt(args[0]);
        int myNumber2 = Integer.parseInt(args[1]);

        System.out.println("The first number is: " + myNumber1);
        System.out.println("The second number is: " + myNumber2);

        int total = myNumber1 + myNumber2;

        System.out.println("The result is: " + total);

    }
}
