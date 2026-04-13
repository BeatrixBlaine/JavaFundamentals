public class IfStatement {
    static void main(String[] args) {

        int x, y;

        x = 10;
        y = 5;

        if(x < y){
            System.out.println("so asu");
        } else {
            System.out.println("bedug");
        }

        var nilai = 60;

        if (nilai > 100) {
            System.out.println("Masukan nilai 0 - 100!");
        } else if (nilai >= 90) {
            System.out.println("A");
        } else if (nilai >= 80) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else if (nilai >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Masukan nilai 0 - 100!");
        }

        // there's "else if" if more statement needed

    }
}
