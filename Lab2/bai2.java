
package Lab2;
import java.util.Scanner;
/**
 *Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c
   nhập từ bàn phím
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap he so a: ");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap he so b: ");
        int b = scanner.nextInt();
        System.out.println("Moi ban nhap he so c: ");
        int c = scanner.nextInt();
        //ax^2 + bx + c = 0
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("Phương trình có vô số nghiệm");
                }
                else
                {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        }
        else
        {
            double delta = b*b-4*a*c;
            if(delta>0)
            {
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("Nghiệm X1: "+(-b+Math.sqrt(delta)/(2*a)));
                System.out.println("Nghiệm X2: "+(-b-Math.sqrt(delta)/(2*a)));
            }
            else if(delta==0)
            {
                System.out.println("Phương trình có nghiệm kép là: "+-b/(2*a));
            }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
