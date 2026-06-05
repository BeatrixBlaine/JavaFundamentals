package Algorithm;

import java.util.Arrays;

public class Matrix3DOperations {
    public static void main(String[] args) {

        System.out.println(create3DGameBoard(2,2,2));

        int[][][] arr = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        System.out.println(Arrays.toString(arr[0][0]));

    }

    public static String create3DGameBoard(int levels, int rows, int cols) {
        // Check for valid dimensions
        if (levels <= 0 || rows <= 0 || cols <= 0) {
            return "";
        }

        // Create and fill 3D array
        int[][][] board = new int[levels][rows][cols];

        // Fill the array with calculated values
        // Calculate base value (level + row + col + 3)
        // Multiply by 10 if cell is on any edge

        // Create output string using this exact format:
        String result = "";
        for (int l = 0; l < levels; l++) {
            result += "Level " + l + ":\n";
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    board[l][r][c] = (l + 1) + (r + 1) + (c + 1);
                    if ((l == 0 || l == levels - 1) || (r == 0 || r == rows - 1) || (c == 0 || c == cols - 1)) {
                        board[l][r][c] = board[l][r][c]  * 10;
                    }
                    result += board[l][r][c];
                    if (c < cols - 1) result += " ";
                }
                result += "\n";
            }
            if (l < levels - 1) result += "\n";
        }

        return result;
    }
}
