public class ErrorHandlingReturn {

    public static boolean birthdayGreetings(String name, int age) {
        boolean success;

        if (age > 0) {
            System.out.println("All the best to your " + age + ". birthday " + name);
            success = true;
        } else {
            System.err.println("ERROR: The given age must be larger zero but is: " + age);
            success = false;
            // throw new IllegalArgumentException("ERROR: The given age must be larger zero but is:" + age);
        }

        return success;

    }

    public static void spam (String[] names, int[] ages) {

        for (int i = 0; i < names.length; i++ ) {

            if (ages[i] > 0) {
                birthdayGreetings(names[i], ages[i]);
            } else {
                birthdayGreetings(names[i], 20);
            }

        }

    }

    public static void main(String[] args) {
        String[] names = {"Peter","Sarah","Ivan"};
        int[] ages = {23,-5,35};
        spam(names, ages);
    }

}
