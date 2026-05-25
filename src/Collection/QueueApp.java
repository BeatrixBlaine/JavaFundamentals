package Collection;

import Algorithm.PrintArray;
import com.sun.jdi.IntegerValue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(10);

        for (int i = 0; i < 10; i++) {
            queue.add(String.valueOf(i));
        }

        for (var j : queue) {
            System.out.print(j + " ");
        }

        System.out.println();

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.print(next + " ");
        }

        // queue become empty because of queue.poll
        for (var x : queue) {
            System.out.print(x + " ");
        }
        System.out.println();
        // Deque
        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(9);
        deque.offerFirst(12);
        deque.offerFirst(5);
        deque.offerLast(1);

        PrintArray.printArray(deque);
        System.out.println();
        System.out.println(deque.pollLast());


    }
}
