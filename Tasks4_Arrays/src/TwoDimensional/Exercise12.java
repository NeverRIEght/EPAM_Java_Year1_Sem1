package TwoDimensional;

public class Exercise12 {
    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        int[][] matrix1 = new int[n][n];

        int zerosCounter = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < zerosCounter / 2; j++) {
                matrix1[i][j] = 0;
            }
            for(int j = zerosCounter / 2; j < n - zerosCounter / 2; j++) {
                matrix1[i][j] = 1;
            }
            zerosCounter+= 2;
        }

        int[][] matrix2 = matrix1.clone();

        for(int i = 0; i < n / 2; i++) {
            int[] temp = matrix2[i].clone();
            matrix2[i] = matrix2[n - i - 1].clone();
            matrix2[n - i - 1] = temp.clone();
        }


        int[][] matrix3 = new int[n][n];
        if(n % 2 == 0) {
            for(int i = 0; i < n / 2; i++) {
                matrix3[i] = matrix1[i].clone();
            }
            for(int i = n / 2; i < n; i++) {
                matrix3[i] = matrix2[i].clone();
            }
        } else {
            for(int i = 0; i < n / 2 + 1; i++) {
                matrix3[i] = matrix1[i].clone();
            }
            for(int i = n / 2 + 1; i < n; i++) {
                matrix3[i] = matrix2[i].clone();
            }
        }

        return matrix3;
    }
}
