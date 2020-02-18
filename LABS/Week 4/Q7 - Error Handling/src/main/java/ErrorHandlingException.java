import java.util.Arrays;
import java.util.SplittableRandom;

public class ErrorHandlingException {

  public static String lowerAndTrim (String sentence) {
    if (sentence == null) {
      throw new NullPointerException("ERROR, THE SENTENCE CAN'T BE NULL");
    } else {
      if (sentence == ""){
        sentence = "";
      }
      if (sentence.charAt(sentence.length() -1) == ' ') {
        sentence = sentence.substring(0, (sentence.length() -2));
      }
      if (sentence.charAt(0) == ' ') {
        sentence = sentence.substring(1);
      }
      sentence = sentence.toLowerCase();
    }

    return sentence;
  }

  public static String formatText (String[] sentence) {
    int k = 0;
    String[] result = new String[sentence.length];
    while (k < sentence.length){
      try{
        result[k] = lowerAndTrim(sentence[k]);

        k++;
      } catch (NullPointerException error) {
        //System.err.println(error.getMessage());
        result[k] = null;
        k++;
      }
    }
    String sol = "";
    int counter = 0;
    for (int i = 0; i < result.length; i++) {
      if(result[i] != null) {
         sol = sol + (result[i]);
      } else {
        sol = sol + "\n";
        counter++;
      }
    }
    sol = sol + "\n" + counter;

    System.out.println(sol);

    return sol;
  }

  public static void main(String[] args) {
    formatText(new String[]{ "Hello, World!  ", null, "", "  No Pain, No Gain  ", null});
  }
}
