public class ArrayData {
    static void main(String[] args) {

        String[] x;
        x = new String[2];
        x[0] = "Irsyad";
        x[1] = "Ibrahim";

        System.out.println(x[0]);

        int[] b = {
                1, 2, 3, 4, 5
        };

        String[][] murid = {
                {"Icad", "25"},
                {"Iam", "24"}
        };

        System.out.println(b[1]);
        System.out.println(b.length);
        System.out.println(murid[0][1]);

    }
}
