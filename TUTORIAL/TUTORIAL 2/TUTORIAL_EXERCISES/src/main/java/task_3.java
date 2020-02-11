import java.util.Scanner;

public class task_3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = 0;
    boolean incorrect_input = true;     // variable to break the while loop

    // while loop to
    while (incorrect_input) {

      try {                            // try to do something, if it can`t then do other -> display error

        number = scanner.nextInt();    // try to get the scan of number

        /** IF IN ONE LINE GETS AN ERROR -> IT SKIPS THE REST AND GO TO CATCH */
        incorrect_input = false; //this line wont run if line scanner of number gives error
        //if the incorrect input runs it breaks the while loop

      } catch (ArithmeticException e ) {
        // Can specify which kind of error -> this is an example of an arithmetical exception
        // if there is an arithmetical exception - (e is a variable)
        System.out.println("ARITHMETICAL ERROR: NOT NUMBER");

      } catch (Exception e) {
        scanner.next(); /** MUST PUT THIS TO BE ABLE TO GET SCANNER RUN AGAIN AND IGNORE THE PREVIOUS SCAN*/
        // if arithmetical exception - (e is a variable)
        // Can specify which kind of error
        System.err.println("ANY KIND OF ERROR BUT NOT ARITHMETICAL: NOT NUMBER");

        System.out.println(e.getMessage() + "\nType the number again: ");
      }

    }

    scanner.close();

    boolean choice = number == 1;

    if (choice == true) {
      System.out.println("Choose 1");
    } else {
      System.out.println("Choose other");
    }
  }
}
