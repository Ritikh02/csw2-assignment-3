/*Declare an array of integers. int[] arr = {1,2,10,8,7,3,4,6,5,9};. Then
create a min heap of elements from the array using Priority Queue class.
Again Dequeue elements of Priority Queue using appropriate methods */

import java.util.PriorityQueue;

public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};

        PriorityQueue<Integer> minHeap = createMinHeap(arr);

        System.out.println("Elements dequeued from min heap:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }

    public static PriorityQueue<Integer> createMinHeap(int[] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
        }
        return minHeap;
    }
}
