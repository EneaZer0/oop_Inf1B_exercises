public class MeanVariance {

    public static void main(String[] args) {

        double[] nums = new double[args.length];
        double[] pairs = new double[(args.length)/2];

        double mean, variance, total_sum = 0;

        for (int i = 0 ; i < args.length; i++) {    // copy args into nums

            nums[i] = Double.parseDouble(args[i]);

        }

        for (int i = 0; i < nums.length; i++) {     // sums all the numbers to do the mean

            total_sum = total_sum + nums[i];

        }

        mean = total_sum / nums.length;             // calculation of mean

        System.out.println(mean);                   // display of mean

        total_sum = 0;

        /* _______________________________________________________________________________

        for (int i = 0; i < (pairs.length); i++) {     // make an array of pairs from nums

            int a = nums[2*i], b = nums[2*i+1];
            pairs[i] = (a - b) * (a - b);
            total_sum = total_sum + pairs[i];

        }

        for (int i = 0; i < pairs.length; i++) {

            System.out.print(pairs[i] + " ");

        }

        variance = total_sum / nums.length;

        System.out.print(total_sum); */


        for (int i = 0; i < nums.length; i++) {

            nums[i] = (nums[i] - mean) * (nums[i] - mean);
            total_sum = total_sum + nums[i];
        }

        variance = total_sum / nums.length;
        System.out.print(variance);

    }

}
