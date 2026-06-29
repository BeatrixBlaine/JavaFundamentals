package Algorithm;

public class printZigZag {

    public static void printZigZag(String s, int numRows) {
        if (numRows == 1) {
            System.out.println(s);
            return;
        }

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int currentRow = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {
            rows[currentRow] += c;

            if (currentRow == 0) {
                goingDown = true;
            } else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            currentRow += goingDown ? 1 : -1;
        }

        // print zigzag rows
        for (String row : rows) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        printZigZag("PAYPALISHIRING", 3);
    }

}
