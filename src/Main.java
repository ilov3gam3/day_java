import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int bien_toan_cuc;
    public static void main(String[] args) {
        byte a = 123;
        int b = 2000000000;
        final int hang_so = 5;
        float c = 1.1F;
        double d = 1.2;
        boolean e = true;
        String s = "day la 1 chuoi";
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("minh" + 123);


        Scanner scanner = new Scanner(System.in);
        System.out.print("mời bạn nhập điểm : ");
        float diem = scanner.nextFloat();

        if (diem >= 8) {
            System.out.println("học sinh giỏi");
            System.out.println("học sinh giỏi");
        } else {
            System.out.println("không phải học sinh giỏi");
            System.out.println("không phải học sinh giỏi");
        }
        System.out.println("for");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("while");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        int[] arr = new int[10];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = scanner.nextInt();
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}