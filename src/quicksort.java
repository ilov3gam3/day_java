import java.util.Random;
import java.util.Scanner;

public class quicksort {
    public static int inputInteger() {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        int n = 0;
        do {
            try {
                System.out.print("Enter the number of array(must be positive integer) : ");
                n = Integer.parseInt(in.nextLine());
                cont = false;
            } catch (Exception e) {
                System.out.println("Required positive integer!");
            }
        } while (cont || n <= 0);
        return n;
    }
    public static int partition(int arr[], int l, int h) {
        int p = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] < p) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = tmp;
        return i + 1;
    }

    public static void quicksort(int arr[], int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            quicksort(arr, l, pi - 1);
            quicksort(arr, pi + 1, h);
        }
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
    public static void generateRandomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }
    public static void main(String[] args) {
        int n = inputInteger();
        int[] arr = new int[n];
        generateRandomArray(arr);
        System.out.print("Unsorted list : ");
        printArray(arr);
        quicksort(arr, 0, n - 1);
        System.out.print("\nSorted list : ");
        printArray(arr);
    }
}
