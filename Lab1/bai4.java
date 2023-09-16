
package Lab1;

import java.util.Scanner;
//Viết chương trình nhập các hệ số của phương trình bậc 2. 
//Tính delta và xuất căn delta ra màn hình.
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap he so a: ");
        int a = scanner.nextInt();
        System.out.print("Moi ban nhap he so b: ");
        int b = scanner.nextInt();
        System.out.print("Moi ban nhap he so c: ");
        int c = scanner.nextInt();
        double delta = Math.pow(b,2)-4*a*c;
        System.out.println("Gia tri tra ve cua delta la: "+delta);
        System.out.printf("Căn của delta là: %.2f\n",Math.sqrt(delta));
}
}   
