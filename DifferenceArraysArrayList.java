import java.util.ArrayList; // Importing the ArrayList class

public class DifferenceArraysArrayList {

    public static void main(String[] args) {
        // Example using an Array
        int[] intArray = new int[5]; // Declaring and initializing an array with a fixed size of 5
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2; // Assigning values to array elements
        }

        System.out.println("Array Elements:");
        for (int i : intArray) {
            System.out.println(i); // Iterating over array elements
        }
        // Note Attempting to add more elements than its declared size will result in an error.

        // Example using an ArrayList
        ArrayList<Integer> intArrayList = new ArrayList<>(); // Declaring and initializing an ArrayList
        for (int i = 0; i < 5; i++) {
            intArrayList.add(i * 2); // Adding elements to the ArrayList
        }

        // Demonstrating dynamic resizing by adding more elements
        intArrayList.add(10);
        intArrayList.add(12);

        System.out.println("\nArrayList Elements:");
        for (Integer i : intArrayList) {
            System.out.println(i); // Iterating over ArrayList elements
        }
        // Note: ArrayLists can dynamically resize. You can add or remove elements without worrying about the size.
    }
}
