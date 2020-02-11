public class Mode {

  public static void main(String[] args) {

    int[] numbers = {0,1,2,3,4,5,6,7,8,9};
    int[] dataset = new int[args.length];
    int[] count = new int[args.length];

    for (int i = 0; i < args.length; i++) {
      dataset[i] = Integer.parseInt(args[i]);
    }
    /*
    for (int i = 0; i < dataset.length; i++) {
      System.out.print(dataset[i] + " ");
    }
    */

    for (int i = 0; i < dataset.length; i++) {

      if (dataset[i] == 0) {
        count[0] = count[0] + 1;
      } else if (dataset[i] == 1) {
        count[1] = count[1] + 1;
      } else if (dataset[i] == 2) {
        count[2] = count[2] + 1;
      } else if (dataset[i] == 3) {
        count[3] = count[3] + 1;
      } else if (dataset[i] == 4) {
        count[4] = count[4] + 1;
      } else if (dataset[i] == 5) {
        count[5] = count[5] + 1;
      } else if (dataset[i] == 6) {
        count[6] = count[6] + 1;
      } else if (dataset[i] == 7) {
        count[7] = count[7] + 1;
      } else if (dataset[i] == 8) {
        count[8] = count[8] + 1;
      } else if (dataset[i] == 9) {
        count[9] = count[9] + 1;
      }

    }

    /*System.out.println(" ");
    for (int i = 0; i < dataset.length; i++) {
      System.out.print(count[i] + " ");
    }*/

    int max = 0;

    for (int i = 0; i < count.length; i++) {

      if (max < count[i]) {

        max = count[i];

      }

    }

    int num = 0;

    for (int i = 0; i < count.length; i++) {

      if (count[i] == max) {
        num = i;
        break;
      }

    }

    //System.out.println(" ");
    //System.out.println(max);

    System.out.println(numbers[num]);
  }

}
