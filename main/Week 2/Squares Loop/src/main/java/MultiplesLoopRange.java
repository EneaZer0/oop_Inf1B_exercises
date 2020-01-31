public class MultiplesLoopRange {

    public static void main(String[] args) {

        int start = Integer.parseInt(args[0]), stop = Integer.parseInt(args[1]), multiples = Integer.parseInt(args[2]);

        if (start < stop) {

            while (start % multiples != 0) {
                start++;
            }

            for (int count = start; count <= stop; count++ ) {

                if (start <= stop) {
                    System.out.print(start + " ");
                    start = start + multiples;
                } else {
                    break;
                }

            }

        } else {

            while (start % multiples != 0 ) {
                start--;
            }

            for (int count = start; count >= stop; count--) {

                if (start >= stop) {
                    System.out.print(start + " ");
                    start = start - multiples;
                } else {
                    break;
                }

            }

        }

    }

}
