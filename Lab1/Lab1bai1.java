
package Lab1;

import java.util.Scanner;

//Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn
//phím sau đó xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.
public class Lab1bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Họ và Tên: ");
        String hoTen = scanner.nextLine();
        System.out.printf("Điểm Trung Bình: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %.2f điểm\n",hoTen,diemTB);
        
    }
}
