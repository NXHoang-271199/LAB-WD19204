
package Lab1;

//Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,
//diện tích và cạnh nhỏ của hình chữ nhật.
import java.util.Scanner;
//Chu vi = (dai+rong)*2
//dien tich = dai*rong
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap chieu dai: ");
        double dai = scanner.nextDouble();
        System.out.print("Moi ban nhap chieu rong: ");
        double rong = scanner.nextDouble();
        double chuVi = (dai+rong)*2;
        System.out.printf("Chu vi hình chữ nhật là: %.2f\n",chuVi);
        double dienTich = dai*rong;
        System.out.println("Diện tích hình chữ nhật là: "+dienTich);
        double canh = Math.min(dai, rong);
        if(dai > rong)
        {
            System.out.printf("HCN có cạnh nhỏ nhất là: %.2f\n",canh);
        }
        else if(dai==rong)
        {
            System.out.println("Các cạnh của hình chữ nhật bằng nhau");
        }
        else
        {
            System.out.printf("HCN có cạnh nhỏ nhât là: %.2f",canh);
        }
    }
}
