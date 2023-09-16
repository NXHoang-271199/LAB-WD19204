
package Lab1;
import java.util.Scanner;
//Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất
//thể tích của khối chữ nhật

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap chieu dai: ");
        double canh1 = scanner.nextDouble();
        System.out.print("Moi ban nhap chieu rong: ");
        double canh2 = scanner.nextDouble();
        System.out.print("Moi ban nhap chieu cao: ");
        double canh3 = scanner.nextDouble();
        double theTichKhoi = canh1*canh2*canh3;
        //the tich khoi HCN = chiều dài của mặt đáy*chiều rộng của mặt đáy*chiều cao của hình hộp chữ nhật
        System.out.println("Thể tích của khối chữ nhật là: "+theTichKhoi);        
}
}
