public class NoTriples {

    public static boolean noTriples (int[] nums) {

        boolean noTriples = true;
        int value = nums[0];
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == value){
                counter++;
            } else {
                value = nums[i];
                counter = 1;
            }
            if (counter == 3) {
                noTriples = false;
                break;
            }
        }
        return noTriples;
    }

}
