package day_hoc_ngay_8_2_2023;

import java.util.Scanner;

public class ham {

    public static int[] input_array(int n){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void print_array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] tinh_tong_2_mang(int[] a, int[] b){
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
    public static void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = scanner.nextInt();
        int[] arr_1 = new int[n];
        int[] arr_2 = new int[n];
        int[] arr_3 = new int[n];
        System.out.println("Nhập mảng 1");
        arr_1 = input_array(n);

        System.out.println("Nhập mảng 2");
        arr_2 = input_array(n);

        System.out.print("Mảng 1 : ");
        print_array(arr_1);

        System.out.print("\nMảng 2 : ");
        print_array(arr_2);

        arr_3 = tinh_tong_2_mang(arr_1, arr_2);
        System.out.print("\nMảng 3 : ");
        print_array(arr_3);
    }
}
