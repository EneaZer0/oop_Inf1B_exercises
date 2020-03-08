import org.graalvm.compiler.lir.amd64.AMD64Unary;

public class Has271 {

    public static boolean has271 (int[] nums) {
        boolean has271 = false;
        for (int i = 1; i < nums.length-1; i++){
            if ((nums[i] == (nums[i-1] + 5)) && (nums[i+1] == (nums[i] - 6))) {
                has271 = true;
                break;
            }
        }

        return has271;
    }

}
