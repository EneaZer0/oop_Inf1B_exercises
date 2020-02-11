public class PersonalGreeting {

    public static void main (String[] args) {
        String first_name = args[0];
        String last_name = args[1];

        System.out.println("My Name is " + "Bob Johnson"); // Joins two string together

        System.out.println("My Name is " + args[0] + " " + args[1]);
    }
}
