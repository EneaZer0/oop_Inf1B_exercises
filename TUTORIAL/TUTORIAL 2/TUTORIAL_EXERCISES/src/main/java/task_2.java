import java.util.Scanner; // Import the Scanner class

public class task_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int option = scanner.nextInt(); // Get an integer from user input (stdin)
    scanner.close();

    if (option < 1) {
      System.out.println("You chose doom");
    } else if (option < 2) {
      System.out.println("You chose heaven");
    } else if (option < 3 ) {
      System.out.println("You chose earth");
    } else {
      System.out.println("You chose space");
    }
  }
}
