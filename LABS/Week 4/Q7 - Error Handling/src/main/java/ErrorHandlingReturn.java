public class ErrorHandlingReturn {

  public static boolean birthdayGreetings(String name, int age) {
    boolean success;

    if (age > 0) {
      System.out.println("All the best to your " + age + ". birthday " + name);
      success = true;
    } else {
      System.err.println("ERROR: The given age must be larger zero but is: " + age);
      success = false;
    }

    return success;
  }

  public static void spam (String[] names, int[] ages) {
    String[] result = new String[names.length];

    int k = 0;

    while (k < names.length) {
      boolean valid = birthdayGreetings(names[k], ages[k]);
      if (valid == false) {
        valid = birthdayGreetings(names[k], 20);

      }
      k++;
    }
  }
}
