public class MAIN_EXPERIMENTATION {

  public static void main(String[] args) {

    String array = "[\"B1\",\"D1\",\"F1\",\"H1\",\"E8\"]";


    String coma = ",";
    String comillas = "\"";

    String[] values = new String[12];
    int i = 0;
    for (String st: array.split(coma)) {
      values[i] = st;
      System.out.println(st);
      i++;
    }

    for (int j = 0; j < values.length; j++) {
      System.out.print(values[i] + " ");
    }

  }

}
