package org.skawuma;

/**
 * @author samuelkawuma
 * @package org.skawuma
 * @project StackImplementation
 * @date 6/7/24
 */

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {

        /**
         *  Creates Object of Scanner class
         */
        Scanner input = new Scanner(System.in);
        /**
         * Creates new Stack of numbers to store the list of numbers
         */
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter a list of integers, separated by spaces, and press enter when done:");

        /**
         * Creates an array inputNumbers to store the input integers as Strings
         */
        String[] inputNumbers = input.nextLine().split(" ");

        /**
         * For loop to loop through the input integers
         * while adding them to  the Stack "numbers"
         */
        for (String str : inputNumbers) {
            numbers.push(Integer.parseInt(str));
        }
        /**
         * calls the sort method from Collections to sort list "numbers"
         */
        Collections.sort(numbers);

        System.out.println("Sorted linked list: " + numbers);
        
        input.close();
    }
}