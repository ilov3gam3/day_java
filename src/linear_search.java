import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class linear_search {
    public static int inputInteger(String s) {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        int n = 0;
        do {
            try {
                System.out.print(s);
                n = Integer.parseInt(in.nextLine());
                cont = false;
            } catch (Exception e) {
                System.out.println("Required positive integer!");
            }
        } while (cont || n <= 0);
        return n;
    }
    public static void generateRandomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }
    public static ArrayList<Integer> linear_search(int[] arr, int search_value){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search_value){
                result.add(i);
            }
        }
        return result;
    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",  ");

        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int number_of_array = inputInteger("Enter the number of array(must be positive integer) : ");
        int[] arr = new int[number_of_array];
        generateRandomArray(arr);
        int search_value = inputInteger("Enter search value : ");
        System.out.print("The array : ");
        printArray(arr);
        ArrayList<Integer> result = linear_search(arr, search_value);
        if (result.size() == 0){
            System.out.println("\nNot found");
        } else {
            System.out.println("\nFound " + search_value + " at index : "  + result);
        }
    }
}
