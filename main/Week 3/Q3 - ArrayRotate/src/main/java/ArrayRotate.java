public class ArrayRotate {

    public static void main(String[] args) {

        int[] nums = new int[args.length];
        int[] copy = new int[args.length];



        for (int i = 0; i < args.length; i++) {

            nums[i] = Integer.parseInt(args[i]);

        }

        int temporary = nums[0];

        for (int i = 0; i < args.length; i++) {

            if (i == (args.length)-1) {

                copy[i] = temporary;

            } else {

                copy[i] = nums[i+1];

            }

        }

        for (int i = 0; i < args.length; i++) {

            System.out.print(copy[i] + " ");
        }

    }

}
