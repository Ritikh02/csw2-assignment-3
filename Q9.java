/*Given an array of integers, print the repeating integers in the array with
the help of a HashSet. */

import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 9, 2, 6, 7, 8, 9, 3, 10, 2, 11, 12, 13, 3};

        printRepeatingIntegers(array);
    }

    public static void printRepeatingIntegers(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeatingSet = new HashSet<>();

        for (int num : array) {
            if (!set.add(num)) {
                repeatingSet.add(num);
            }
        }

        if (repeatingSet.isEmpty()) {
            System.out.println("No repeating integers found in the array.");
        } else {
            System.out.println("Repeating integers in the array:");
            for (int num : repeatingSet) {
                System.out.println(num);
            }
        }
    }
}
