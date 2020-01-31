public class ArithmeticSeries {

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        int start = 0, sum_k = 0;

        while (start < (N+1) ) {
            sum_k = sum_k + start;
            start++;

        }
        System.out.print(sum_k);
    }

}
