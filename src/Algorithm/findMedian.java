package Algorithm;

import java.util.Arrays;

public class findMedian {

    public static void main(String[] args) {

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (i + 1) * 2;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (i + 1) + 2;
        }

        PrintArray.printArray(arr1);
        PrintArray.printArray(arr2);

        System.out.println(findMedianSortedArrays(arr1, arr2));


    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }

        for (int j = m, i = 0; j < merged.length; j++, i++) {
            merged[j] = nums2[i];
        }

        Arrays.sort(merged);

        double median = 0;
        if (merged.length % 2 == 0) {
            median = ((double) merged[(merged.length / 2) - 1] + (double) merged[merged.length / 2]) / 2;
        } else {
            median = merged[merged.length / 2];
        }

        return median;
    }
}
