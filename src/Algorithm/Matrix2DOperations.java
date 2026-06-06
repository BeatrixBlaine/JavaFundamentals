package Algorithm;

import java.util.Arrays;

public class Matrix2DOperations {

    public static void main(String[] args) {

        int[][] array1 = {
                {1,2,3},
                {1,4,1},
                {2,3,3}
        };

        int[][] array2 = {
                {1,2,3},
                {4,4,4},
                {2,3,3}
        };

        PrintArray.printArray(addition(array1,array2));
        PrintArray.printArray(subtract(array1,array2));
        PrintArray.printArray(createJaggedArray(5));

        int numStudent = 3;
        int[] subjects = {3,4,1};

        PrintArray.printArray(processGrades(numStudent, subjects));
        System.out.println(Arrays.toString(array1[0]));
        System.out.println(array1[0][1]);
        System.out.println();

        // main loop for 2D Array
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println(array1[i][j]);
            }
        }

        System.out.println("-------------------");
        // traversal main diagonal
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i][i]);
        }
        System.out.println("-------------------");
        // traverse anti-diagonal
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i][array1.length - 1 - i]);
        }
        System.out.println("-------------------");
        printPatterns(array1);
        System.out.println();
        System.out.println("-------------------");
        printAdvancedPatterns(array1);

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

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {

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

    public static int[][] processGrades(int numStudents, int[] subjectsPerStudent) {
        // Check if input is valid
        // Create jagged array based on number of students
        // For each student:
        //   - Create row with length matching their subject count
        //   - Fill with grades using formula: (studentNum + 1) * 10 + subjectNum
        if (numStudents < 0 || subjectsPerStudent == null || subjectsPerStudent.length != numStudents) {
            return new int[0][0];
        }

        int[][] result = new int[numStudents][];

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[subjectsPerStudent[i]];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        return result;
    }

    public static void printPatterns(int[][] matrix) {
        // Write your code here
        System.out.printf("Main Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.printf("\nAnti-Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }

        System.out.printf("\nTop Border: ");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[0][i] + " ");
        }

        System.out.printf("\nBottom Border: ");
        for (int i = 0; i < matrix[matrix.length - 1].length; i++) {
            System.out.print(matrix[matrix.length - 1][i] + " ");
        }

        System.out.printf("\nLeft Border: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][0] + " ");
        }

        System.out.printf("\nRight Border: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix[i].length - 1] + " ");
        }

    }

    public static void printAdvancedPatterns(int[][] matrix) {
        // Write your code here
//        int index = matrix.length;
//        int down = 1;
//        System.out.printf("Both Diagonals: ");
//        for (int i = 0; i < (matrix.length * 2); i++) {
//            if (i < matrix.length) {
//                System.out.print(matrix[i][i] + " ");
//            } else {
//                if (matrix[matrix.length / 2][matrix[0].length / 2] == matrix[i - index][matrix[i - index].length - down]) {
//                    down++;
//                    continue;
//                }
//                System.out.print(matrix[i - index][matrix[i - index].length - down] + " ");
//                down++;
//            }
//        }
        int n = matrix.length;

        System.out.print("Both Diagonals: ");

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " "); // main diagonal
        }

        for (int i = 0; i < n; i++) {
            if (i != n - 1 - i) { // skip center if overlapping
                System.out.print(matrix[i][n - 1 - i] + " ");
            }
        }

        System.out.printf("\nSpiral Order: ");
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
    }


}
