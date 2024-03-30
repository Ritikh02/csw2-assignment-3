/*Write a program to create a TreeSet of Integer type and perform the
below
operation on it.
(a.) Display the TreeSet
(b.) Ask the user to enter a number and search that number is it present in the list or not.
(c.) Remove an element from tree. */

import java.util.Scanner;
import java.util.TreeSet;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        System.out.println("TreeSet: " + numbers);
        System.out.println("Enter a number to search:");
        int numberToSearch = scanner.nextInt();
        if (numbers.contains(numberToSearch)) {
            System.out.println(numberToSearch + " is present in the TreeSet.");
        } else {
            System.out.println(numberToSearch + " is not present in the TreeSet.");
        }
        System.out.println("Enter a number to remove:");
        int numberToRemove = scanner.nextInt();
        numbers.remove(numberToRemove);
        System.out.println("Number " + numberToRemove + " removed from the TreeSet.");
        scanner.close();
    }
}
