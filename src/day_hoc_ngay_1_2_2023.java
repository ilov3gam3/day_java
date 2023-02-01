public class day_hoc_ngay_1_2_2023 {
    // mảng
    public static void main(String[] args) {
        //==================KHÔNG ĐỤNG=======================
        /*Scanner scanner = new Scanner(System.in);
        int number = 37468598;
        int sum = 0;
        while (number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
        System.out.print("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();
        int[] array = new int[n]; // khởi tạo 1 mảng có n phần từ*/
        //==================ĐỤNG TỪ ĐÂY :V=======================
        int[] array2 = {6, -2, 7, -3, 1};  // khởi tạo 1 mảng có sẵn dữ liệu

         /*array.length = n
         vd n = 5, 0<=i<=4
         array.length = 5
          0  1  2  3  4 => chỉ số(index)
         [6, 2, 7, 3, 1] => giá trị(value)
         array[index] => lấy phần tử trong mảng ở vị trí index
         int a = 0
         a <=> array[index] (cùng kiểu int, sử dụng như nhau)
         a + 10 cộng với 1 số
         array[index] + 10 cộng với 1 số
          a = 20 thay đổi giá trị
         array[index] = 30   thay đổi giá trị
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt(); // thêm các phần từ vào mảng
        }*/

        int array_sum = 0;
        for (int i = 0; i < array2.length; i++) {
            array_sum = array_sum + array2[i];
        }
        System.out.println("array 2 sum is : " + array_sum);

        /* i là index chạy từ 0 tới 4 (đầu tới cuối, chỉ số đầu tiên tới chỉ số cuối cùng)
                array2.length = 5
                                ↓                                   */
        for (int i = 0; i < array2.length; i++) {
            if ( array2[i] > 0){
                System.out.println(array2[i] + " là số dương.");
            } else {
                System.out.println(array2[i] + " là số âm.");
            }
        }

        /* duyệt ngược mảng (x là chỉ số cuối cùng trong mảng)
         xuôi i chạy từ 0 -> x
         ngược i chạy từ x -> 0
          0   1  2   3  4
         [6, -2, 7, -3, 1]

         [2,43,6,2,1,4,6,4,6,354,7,4,53] độ dài 13, phần tử cuối cùng 12
         tìm x = 4
         độ dài của mảng = 5
         */

        System.out.println("duyệt ngược mảng");
        for (int i = array2.length-1; i >= 0 ; i = i -1) {
            System.out.println(array2[i]);
        }
        /* * duyệt mảng nhưng bỏ qua index 1 => 6 7 -3 1
         duyệt mảng nhưng bỏ qua value 7 => 6 -2 -3 1
         duyệt mảng nhưng bỏ qua value 5 => 6, -2, 7, -3, 1 (giữ nguyên)
         a = 0*/
        System.out.println("duyệt mảng nhưng bỏ qua index 1");
        for (int a = 0; a < array2.length; a++) {
            if (a == 1){

            } else {
                System.out.println(array2[a]);
            }
        }
        System.out.println("duyệt mảng nhưng bỏ qua value 7");
        for (int z = 0; z < array2.length; z++) {
            if (array2[z] == 7){

            } else {
                System.out.println(array2[z]);
            }
        }
    }
}
