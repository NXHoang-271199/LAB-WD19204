
package Lab2;
import java.util.Scanner;
/**
Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo
phương pháp lũy tiến
* Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please import the number of used electricity: ");
        int soDien = scanner.nextInt();
        if(soDien<50 && soDien>0)
        {
            System.out.println("Cước tiền điện tháng này cùa bạn là: "+soDien*1000+" VNĐ");
        }
        else
        {
            System.out.println("Cước tiền điện tháng này của bạn là: "+(50*1000+(soDien-50)*1200)+" VNĐ");
        }
    }
}
