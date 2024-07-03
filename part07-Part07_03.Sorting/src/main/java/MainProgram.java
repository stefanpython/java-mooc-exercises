import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int min = table[startIndex];
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        System.out.println("Initial array: " + Arrays.toString(array));
        
        for (int i = 0; i < array.length - 1; i++) {
            // Find the index of the smallest element from index i onwards
            int indexOfMin = indexOfSmallestFrom(array, i);
            
            // Swap the current element with the smallest element found
            swap(array, i, indexOfMin);
            
            // Print the array after each swap
            System.out.println(Arrays.toString(array));
        }
    }

}
