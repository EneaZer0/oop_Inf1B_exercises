public class OneTimePadEncipher {

  public static int charToInt(char l) {
    // ADD CODE HERE
    // Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
    int character = 0;
    if ((int)l <= 90 && (int)l >= 65) {
      character = (int)l -65;
    } else if ((int)l >= 97 && (int)l <= 122){
      character = (int)l - 97;
    }
    return character;
  }

  public static char intToChar(int i) {
    // ADD CODE HERE
    // Should convert an integer to a character, for example 0 -> 'a', b -> '1'
    // it should always return lower case char
    char letter = ' ';
    for (int k = -1; k < i; k ++){
      letter = (char)(97 + k + 1);

    }
    return  letter;
  }

  /** FUNCTION TO CHECK IF ITS A LETTER */
  public static boolean isAlpha(char c) {
    boolean isAlpha = false;
    if ((int) c >= 65 && (int)c <= 90) {
      isAlpha = true;
    } else if ((int)c >= 97 && (int)c <=122){
      isAlpha = true;
    }
    return isAlpha;
  }

  public static String encipher(String original, String onetimepad) {
    // ADD CODE HERE
    String encipher = "";
    char a = ' ';
    char b = ' ';
    char letter = ' ';
    int value_a;
    int value_b;

    int value = 0;
    for (int i = 0; i < original.length(); i++) {
      a = original.charAt(i);
      b = onetimepad.charAt(i);

      if (isAlpha(a) && isAlpha(b)) {
        value_a = charToInt(a);
        value_b = charToInt(b);
        value = (value_a + value_b);
        if (value > 25) {
          value = value - 26;
        }
        letter = intToChar(value);
        encipher = encipher + letter;
      } else if (original.charAt(i) == ' ') {
        encipher = encipher + " ";
      }
    }


    return  encipher;
  }


  public static void main(String[] args) {
    String ciphertext = encipher("HOLA ESTE ES NZERO", "MYSECRETKETMYSECRETKEY");
    System.out.print(ciphertext);
  }

}