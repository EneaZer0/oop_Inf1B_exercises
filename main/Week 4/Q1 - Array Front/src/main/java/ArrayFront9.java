public class ArrayFront9 {

  public  static boolean arrayFront9(int[] nums) {
    boolean bool = false;
    int[] trabajo = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {

      trabajo[i] = nums[i];

    }

    for (int i = 0; i < trabajo.length; i++) {
      if (i < 4 && trabajo[i] == 9) {

        bool = true;
        break;

      }
    }

    return bool;

  }

  public static void main(String[] args) {

    int[]  nums = new int[args.length];

    for (int i = 0; i < args.length; i++) {

      nums[i] = Integer.parseInt(args[i]);

    }

    boolean result = arrayFront9(nums);

    System.out.println(result);
  }

}
