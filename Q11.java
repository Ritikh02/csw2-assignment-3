/*Given an unsorted array of integers from 1 to 10, find smallest positive
number missing in the array. Use a hash map HashMap<Integer,
Integer> to keep track of elements. */

import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 10, 1, 6, 9, 3, 8};
        int smallestMissingNumber = findSmallestMissingNumber(array);
        System.out.println("Smallest missing positive number: " + smallestMissingNumber);
    }
    public static int findSmallestMissingNumber(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 11;
    }
}
