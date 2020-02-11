import java.util.Scanner; // Import the Scanner class

public class exercise_3 {

    public static void main(String[] args) {

      System.out.println("You have full access to everything!");
      Scanner input = new Scanner(System.in); // Create a Scanner object
      System.out.println("Enter username");

      String userName = input.nextLine(); // Read user input
      input.close();
      System.out.println("Username is: " + userName); // Output user input

      if (userName == "admin") {
        System.out.println("You have full access to everything!");
      } else if (userName.equals("HRadmin")) {
        System.out.println("You have access to all employee records");
      } else {
        System.out.println("You don’t have access to anything");
      }
  }
}
