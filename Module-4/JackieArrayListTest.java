//Jackie Scott Module 4 ArrayList Traversing to find Maximum value
//ArrayList created by user input 

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; // Importing Collections package

public class JackieArrayListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // to take user input
        ArrayList<Integer> numbers = new ArrayList<>(); // create ArrayList using wrapper class of int, integer
        
        System.out.println("Enter numbers (enter 0 to stop):"); // prompt user for input of integers
        
        int input; // variable to store user input
        
        // while loop to prompt user until number entered is 0
        while ((input = scanner.nextInt()) != 0) {
            // this will add the input into the arraylist
            numbers.add(input);
        }
        
        // print out the biggest number user entered using the max method
        System.out.println("The biggest number entered was: " + max(numbers));
        
        // Just another way to get the maximum number from our ArrayList using the Collections method
        // Imported Collections package at the top of the script
        System.out.println("You sure the biggest number was: " + Collections.max(numbers));
        
        scanner.close(); // close the scanner
    }

    // Method to find the max value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        // If statement to return 0 if the list is empty
        if (list.isEmpty()) {
            return 0;
        }
        
        // Traversing and initializing max variable 
        Integer max = list.get(0);
        //for loop to iterate over arraylist and check which number is bigger
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (num > max) {
                max = num;
            }
        }
        
        // return statement to return the maximum value found
        return max;
    }
}
