public class ErrorHandlingException {

  public static void birthdayGreetings(String name, int age) {
    if (age <= 0) {
      throw new IllegalArgumentException("The given age must be larger zero but is: " + age);
    }

    System.out.println("All the best to your " + age + ". birthday " + name);
  }

  public static String lowerAndTrim (String phrase) {


    for (int i = 0; i < phrase.length(); i++) {
      char c = phrase.charAt(i);

    }


    return phrase;
  }

  public static void main(String[] args) {
    try {
      // all code within the try block is protected
      // by the corresponding catch
      birthdayGreetings("Peter", -5);

    } catch (IllegalArgumentException error) {
      // the catch block is able to catch IllegalArgumentExceptions and
      // handles them by printing the provided error message.
      System.err.println(error);
    }
  }

}
