
package Lab2;
import java.util.Scanner;
//Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b
//nhập từ bàn phím
public class Lab2bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap he so a: ");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap he so b: ");
        int b = scanner.nextInt();
        // ax + b = 0
        if(a==0)
        {
            if(b==0)
            {
                System.out.println("Phương trình có vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{
            System.out.println("Phương trình có nghiệm: "+-b/a);
        }
    }
}
