package Algorithm;

public class MergingArray {
    public static void main(String[] args) {
        int[] array1 = {1,4,6,7,8,9};
        int[] array2 = {1,6,7,8,7};
        int x = array1.length;
        int y = array2.length;
        // declaring new Array
        int[] merged = new int[x+y];

        System.out.println("Array 1 :");
        PrintArray.printArray(array1);
        System.out.println("Array 2 :");
        PrintArray.printArray(array2);
        // System.out.println(merged.length); merged length = 11

        for(int i = 0; i < x; i++) {
            merged[i] = array1[i];
        }
        System.out.println("Input array1 to result: ");
        PrintArray.printArray(merged);

        for(int j = x, i = 0; j < merged.length; j++, i++) {
            merged[j] = array2[i];
        }

        System.out.println("Input array2 to result: ");
        PrintArray.printArray(merged);
    }
}
