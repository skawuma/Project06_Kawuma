package org.skawuma.entity;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author samuelkawuma
 * @package org.skawuma.entity
 * @project Linked List and Collections Framework
 * @date 5/29/24
 */
public class LinkedListAndCollectionFramework {
    public static void main(String[] args) {

        /**
         *  Creates Object of Scanner class
         */
        Scanner input = new Scanner(System.in);
        /**
         * Creates new linked List numbers to store the list of numbers
         */
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter a list of integers, separated by spaces, and press enter when done:");

        /**
         * Creates an array inputNumbers to store the input integers as Strings
         */
        String[] inputNumbers = input.nextLine().split(" ");

        /**
         * For loop to loop through the input integers
         * while adding them to list "numbers"
         */
        for (String str : inputNumbers) {
            numbers.add(Integer.parseInt(str));
        }
        /**
         * calls the sort method from Collections to sort list "numbers"
         */
        Collections.sort(numbers);

        System.out.println("Sorted linked list: " + numbers);
    }
}
