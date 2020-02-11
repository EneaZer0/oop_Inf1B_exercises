import java.util.Arrays;

public class ArrayOps {

    /** ~~~~~~~~~~~~~~~~ SOLVED ~~~~~~~~~~~~~~~~~~~~*/
    public static double findMax(double[] data) {
        // ADD CODE HERE
        double max = data[0];

        for (int i = 0; i < data.length; i++) {

            if (max <= data[i]) {
                max = data[i];
            }
        }

        return max;
    }
    public static double[] normalise(double data[]) {
        // ADD CODE HERE

        double[] newA = new double[data.length];

        for (int i = 0; i < newA.length; i++) {
            newA[i] = data[i];
        }

        double sum = 0;

        for (int i = 0; i < newA.length; i++) {

            sum = sum + newA[i];

        }

        for (int i = 0; i < newA.length; i++) {

            newA[i] = newA[i] / sum;

        }

        return newA;
    }
    public static void normaliseInPlace(double data[]) {
        // ADD CODE HERE
        double sum = 0;

        for (int i = 0; i < data.length; i++) {

            sum = sum + data[i];

        }

        for (int i = 0; i < data.length; i++) {

            data[i] = data[i] / sum;

        }



    }
    public static double[] reverse(double[] data) {
        // ADD CODE HERE
        double[] newA = new double[data.length];
        if (data.length > 0) {
            for (int i = 0; i < newA.length; i++) {
                newA[i] = data[i];
            }

            int k = 0;
            for (int i = newA.length - 1; i > -1; i--) {

                newA[k]  = data[i];
                k++;
            }
        }

        return newA;
    }
    public static void swap(double[] data1, double[] data2) {
        // ADD CODE HERE

        double[] copy = new double[data1.length];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = data1[i];
        }

        for (int i = 0; i < copy.length; i++) {
            data1[i] = data2[i];
        }
        for (int i = 0; i < copy.length; i++) {
            data2[i] = copy[i];
        }

    }
    public static void reverseInPlace(double[] data) {
        // ADD CODE HERE

        int k = 0;

        if (data.length > 0) {

            double[] copy_array = new double[data.length];
            // copy of data
            for( int i = 0; i < data.length; i++) {
                copy_array[i] = data[i];
            }

            // replace data with reverse of copy
            for (int i = data.length - 1; i > -1; i--) {

                data[k] = copy_array[i];
                k++;

            }

        }


    }
    public static void main(String[] args) {
        double[] data = new double[args.length];

        for (int i = 0; i < args.length; i++) {

            data[i] = Double.parseDouble(args[i]);

        }

        findMax(data);
        System.out.println(findMax(data));

        normalise(data);
        System.out.println(Arrays.toString(normalise(data)));

        ;

    }

    /** ################ TO DO #####################*/

}