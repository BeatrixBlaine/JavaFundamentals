package Algorithm;

import java.util.HashSet;
import java.util.List;

public class SetFunction {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(4);
        set2.add(5);
        set2.add(6);

        symmetricDifference(set1,set2);
    }

    public static void symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Write your code here
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        union.removeAll(intersection);

        System.out.println("Symmetric Difference: " + union);
    }

    public static void checkProperSubsetSuperset(HashSet<String> setA, HashSet<String> setB) {
        // Write your code here
        boolean isSubset = setB.containsAll(setA);
        System.out.println("setA is a subset of setB: " + isSubset);

        // Check if setA is a superset of setB
        boolean isSuperset = setA.containsAll(setB);
        System.out.println("setA is a superset of setB: " + isSuperset);

        // Check if setA is a proper subset of setB
        boolean isProperSubset = isSubset && setA.size() < setB.size();
        System.out.println("setA is a proper subset of setB: " + isProperSubset);

        // Check if setA is a proper superset of setB
        boolean isProperSuperset = isSuperset && setA.size() > setB.size();
        System.out.println("setA is a proper superset of setB: " + isProperSuperset);
    }
}
