import  java.util.Arrays;

public class TempMedian {

  public static void main(String[] args) {

    int initial_temp = Integer.parseInt(args[0]);

    String[] symbols = new String[args.length];
    int[] temps = new int[args.length];

    // Save the combination of symbols
    for (int i = 0; i < symbols.length; i++) {
      symbols[i] = args[i];
    }

    /*
    // Plot of the combination of symbols (with out number)
    for (int i = 0; i < symbols.length; i++) {
      System.out.print(symbols[i] + " ");
    }
    */

    // Calculation of the temperature values
    for (int i = 0; i < temps.length; i++ ) {

      if (i == 0) {

        temps[i] = initial_temp;

      } else {

        if (symbols[i].equals("+")) {
          temps[i] = temps[i-1] + 1;
        } else if (symbols[i].equals(".")) {
          temps[i] = temps[i-1];
        } else if (symbols[i].equals("-")){
          temps[i] = temps[i-1] - 1;
        }

      }

    }


    // Plot of the calculated temperatures
    //System.out.println(" ");
    for (int i = 0; i < symbols.length; i++) {
      System.out.print(temps[i] + " ");
    }


    Arrays.sort(temps);

    System.out.println(" ");
    for (int i = 0; i < symbols.length; i++) {
      System.out.print(temps[i] + " ");
    }

    double[] sum_temp = new double[temps.length];
    double total_sum_temp = 0, median;

    for (int i = 0; i < temps.length; i++) {
      sum_temp[i] = temps[i];
      total_sum_temp = total_sum_temp + sum_temp[i];
    }

    if ( temps.length % 2 == 0) {
      median = (sum_temp[sum_temp.length/2] + sum_temp[(sum_temp.length/2) - 1])/2;
    } else {
      median = sum_temp[(sum_temp.length)/2];
    }
    System.out.println(" ");
    System.out.println(median);

  }

}
