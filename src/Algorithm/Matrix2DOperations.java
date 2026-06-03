package Algorithm;

public class Matrix2DOperations {

    public static void main(String[] args) {

        int[][] array1 = {
                {1,2,3},
                {2,3,3}
        };

        int[][] array2 = {
                {1,2,3},
                {2,3,3}
        };

        PrintArray.printArray(addition(array1,array2));
        PrintArray.printArray(substract(array1,array2));
        PrintArray.printArray(createJaggedArray(5));

    }

    public static int[][] addition(int[][] matrix1, int[][] matrix2) {

        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            return new int[][]{
                    {-1},{-1}
            };
        }

        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] substract(int[][] matrix1, int[][] matrix2) {

        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            return new int[][]{
                    {-1},{-1}
            };
        }

        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] createJaggedArray(int n) {
        // Write your code here
        int[][] result = new int[n][];

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1]; // each row grows larger size of array
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (i + 1) * (j + 1); // input value
            }
        }

        return result;
    }

}
