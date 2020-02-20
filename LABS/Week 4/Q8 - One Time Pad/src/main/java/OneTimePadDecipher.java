public class OneTimePadDecipher {

  public static String decipher (String encrypted, String key) {
    String secret_message = "";
    char a = ' ';
    char b = ' ';

    int value_a = 0;
    int value_b = 0;
    int value = 0;

    for (int i = 0; i < encrypted.length(); i++) {
      if (encrypted.charAt(i) != ' ') {
        a = encrypted.charAt(i);
        b = key.charAt(i);

        value_a = OneTimePadEncipher.charToInt(a);
        value_b = OneTimePadEncipher.charToInt(b);

        value = value_a - value_b;
        if (value < 0) {
          value = value + 26;
        }

        a = OneTimePadEncipher.intToChar(value);
        secret_message = secret_message + a;
      } else {
        secret_message = secret_message + " ";
      }
    }
    secret_message = secret_message.toUpperCase();
    return secret_message;
  }

  public static void main(String[] args) {
    System.out.println(decipher("tmde vwmo xe fdgis", "MYSECRETKETMYSECRETKEY"));
  }

}
