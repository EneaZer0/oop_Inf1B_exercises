public class LargestDouble {

    public static void main(String[] args) {

        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);

        double max = Math.max(number1,number2);
        System.out.println(max);


    }

}
