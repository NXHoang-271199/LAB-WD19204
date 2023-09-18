
package Lab2;
import java.util.Scanner;
/**
Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức
năng để thoát khỏi ứng dụng
 */
public class bai4 {
    public static void main(String[] args) {
        int answer;
      do
      {
        thucDon();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn chọn chức năng: ");
        answer = scanner.nextInt();
        switch(answer)
        {
            case 1:
                PTB1();
                break;
            case 2:
                PTB2();
                break;
            case 3:
                tinhTienDien();
            case 4:
                System.out.println("Bạn đã thoát");
                break;
            default:
                System.out.println("Chức năng bạn chọn không có! Mời bạn chọn lại từ 1-3 hoặc 4 để thoát");
                break;
        } 
      }while(answer!= 4);  
    }

    private static void thucDon() {
        System.out.println("*****************MENU*****************");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Exit");
        System.out.println("**************************************");
    }
    private static void PTB1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập hệ số a: ");
        int a = scanner.nextInt();
        System.out.println("Mời bạn nhập hệ số b: ");
        int b = scanner.nextInt();
        if(a==0)
        {
            if(b==0)
            {
                System.out.println("Phương trình có vô số nghiệm");
            }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else
        {
            System.out.println("Phương trình có nghiệm: "+-b/a);
        }
    }
    private static void PTB2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap he so a: ");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap he so b: ");
        int b = scanner.nextInt();
        System.out.println("Moi ban nhap he so c: ");
        int c = scanner.nextInt();
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
            double delta = b*b+4*a*c;
            if(delta>0)
            {
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("Phương trình có nghiệm X1: "+(-b-Math.sqrt(delta)/(2*a)));
                System.out.println("Phương trình có nghiệm X2: "+(-b+Math.sqrt(delta)/(2*a)));
            }
            else if(delta==0)
            {
                System.out.println("Phương trình có nghiệm kép X1=X2= "+-b/(2*a));
            }
            else
            {
                System.out.println("Phương tình vô nghiệm");
            }
        }
    }    

    private static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số điện: ");
        int soDien = scanner.nextInt();
        if(soDien<=50 && soDien>0)
        {
            System.out.println("Cước điện cua bạn là: "+soDien*1000);
        }
        else
        {
            System.out.println("Cước điện của bạn tháng này là: "+(50*1000+(soDien-50)*1200));
        }
    }
}
