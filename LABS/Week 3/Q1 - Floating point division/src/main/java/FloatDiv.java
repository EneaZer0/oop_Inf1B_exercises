public class FloatDiv {

    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]), exposure = Integer.parseInt(args[1]);
        double dose = (exposure * 250.0) / age;

        System.out.format("Patient Age: %d%n", age);
        System.out.format("Days since bitten: %d%n", exposure);
        System.out.format("Dosage of antidote: %.3fmg%n", dose);

        /* If you want to do format with INT, you would use %d
        * in the case you want to do format with a DOUBLE is %f ->
        * if the case is that you want more DECIMAL DIGITS, in a DOUBLE, use %.[NUMBER OF DIGITS]f
        *
        * %n gives you a NEW LINE*/

    }

}
