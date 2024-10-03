import java.util.Random;
import java.util.Arrays;
/**
 * @author Pasechnyi Leonid 3311
 *
 */
public class Main {

    /**
     * Main method the application. Generates an array of 10 random integers,
     * sorts them.
     * @param args arguments from a command line
     *
     */
    public static void main(String[] args){
        int[] Arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            Arr[i] = rand.nextInt(100);
        }

        System.out.println("Original Array: " + Arrays.toString(Arr));

        sort(Arr, true);
        System.out.println("Sort array: " + Arrays.toString(Arr));

        sort(Arr, false);
        System.out.println("Reverse array: " + Arrays.toString(Arr));
    }

    public static void sort(int[] array, boolean ascending){
        int n = array.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++){
            swap = false;
            for (int j = 0; j < n-1 - i; j++){
                if ((array[j] > array[j+1] && ascending) || (array[j] < array[j+1] && !ascending)) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
    }
}