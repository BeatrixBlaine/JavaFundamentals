public class Looping {
    static void main(String[] args) {

        // for loop
        // initialize i, condition, post statement (so it doesn't loop forever)
        for (int i = 1; i <= 3; i++){
            System.out.println("Looping " + i);
        }

        // nested for loop (outer loop & inner loop, pay attention to the iteration)
        for (int x = 1; x <= 3; x++){
            for (int y = 1; y <= 3; y++){
                System.out.println(x + ", " + y);
            }
        }

        // while loop (always make a ++, so it doesn't loop for eternity)
        var counter = 1;

        while (counter <= 3) {
            System.out.println("While Loop " + counter);
            counter++;
        }

        // do while (do current statement until certain condition met)
        var j = 1;

        do {
            System.out.println("Do While Loop " + j);
            j++;
        } while (j <= 3);

        // break (it stops the iterations when certain condition is met)
        var a = 1;

        while (true) {
            System.out.println("Break & Continue " + a);
            a++;

            if (a > 3){
                break;
            }
        }

        // continue (if the iterations meet the condition, it skips that iteration and continue to the next iteration)
        for (var b = 1; b <= 10; b++) {
            if (b % 2 == 0) {
                continue;
            }

            System.out.println("Bilangan ganjil-" + b);
        }

        // for each with array (print out all the value inside the array)
        int[] array = {
                1, 2, 3, 8, 10, 11, 20, 46, 13, 99
        };

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        for (var value : array) {
            System.out.print(value + ", ");
        }

        System.out.println();

        for (var value : array) {
            if (value % 2 == 0) {
                System.out.print(value + ", ");
            }
        }

    }
}
