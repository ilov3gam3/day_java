import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int number = 37468598;
        int sum = 0;
        while (number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);*/
        System.out.print("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();
        int[] array = new int[n]; // khởi tạo 1 mảng có n phần từ
        int[] array2 = {6, 2, 7, 3, 1}; // khởi tạo 1 mảng có sẵn dữ liệu
        // array.length = n
        // vd n = 5, 0<=i<=4
        //  0  1  2  3  4 => chỉ số(index)
        // [6, 2, 7, 3, 1] => giá trị
        /*for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt(); // thêm các phần từ vào mảng
        }*/
        int array_sum = 0;
        for (int i = 0; i < array2.length; i++) {
            array_sum = array_sum + array2[i];
        }
        System.out.println("array 2 sum is : " + array_sum);
        // i là index chạy từ 0 tới 4
        // array2.length = 5
        for (int i = 0; i < array2.length; i++) {
            array2[i]
            if ( x > 0){

            }
        }
    }
}
