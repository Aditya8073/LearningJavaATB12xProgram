package Generics_Codig_Assessment;

public class Challenge1_Swapping_Array_Elements {

    // Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int i, int j) {
        if (i >= 0 && j >= 0 && i < array.length && j < array.length) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        } else {
            System.out.println("Invalid index values.");
        }
    }

    public static void main(String[] args) {
        // Example 1: Swapping elements in a String array
        String[] names = {"Alice", "Bob", "Charlie"};
        swap(names, 0, 2);
        for (String name : names) {
            System.out.print(name + " "); // Output: Charlie Bob Alice
        }

        System.out.println();

        // Example 2: Swapping elements in an Integer array
        Integer[] numbers = {1, 2, 3, 4};
        swap(numbers, 1, 3);
        for (int num : numbers) {
            System.out.print(num + " "); // Output: 1 4 3 2
        }
    }
}

