import java.lang.reflect.Array;
import java.util.Arrays;

public class NbyN {
    public static int[][] nbyn(int N){
        int[][] matrix = new int[N][N];

        for (int row = 0; row < N; row++) {

            for (int column = 0; column < N; column++) {

                if (row == column) {
                    if (N == 0) {
                        matrix[row][column] = (N);
                    } else {
                        matrix[row][column] = (row);
                    }
                } else {
                    matrix[row][column] = 0;
                }

            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        if (args != null) {
            int N = Integer.parseInt(args[0]);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(("" + nbyn(N)[i][j]) + " ");
                }
                System.out.print("\n");
            }
        } else {
            int N = 10;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(("" + nbyn(N)[i][j]) + " ");
                }
                System.out.print("\n");
            }

        }
    }
}
