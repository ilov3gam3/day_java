import java.util.Arrays;
import java.util.Scanner;

public class day_hoc_ngay_4_2_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng array1 : ");
            array1[i] = scanner.nextInt();
        }
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng array2 : ");
            array2[i] = scanner.nextInt();
        }
        int[] array3 = new int[n];
        for (int i = 0; i < n; i++) {
            array3[i] = array2[i] + array1[i];
        }
        System.out.println("Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
        System.out.println("Array 3 : " + Arrays.toString(array3));
        /*System.out.print("Nhập số cần tìm : ");
        int x = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                found = true;
                System.out.println("Tìm thấy " + array[i] + " ở vị trí " + i);
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy " + x + " trong mảng");
        }*/
    }
}
