
package Lab2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai5 {
    public static void main(String[] args) {
        Thucdon();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn chức năng: ");
        int chon = sc.nextInt();
        switch(chon)
        {
            case 1:
                Phepcong();
                break;
            case 2:  
                Pheptru();
                break;
            case 3:
                Phepnhan();
                break;
            case 4:
                Phepchia();
                break;
            default:
                System.out.println("Ko có chức năng này! Mời chọn lại từ 1-4");
                break;
        }
    }

    private static void Thucdon(){
        System.out.println("+---------Menu---------+");
        System.out.println("|      1. Phép cộng    |");
        System.out.println("|      2. Phép trừ     |");
        System.out.println("|      3. Phép nhân    |");
        System.out.println("|      4. Phép chia    |");
        System.out.println("+----------------------+");  
    }
    private static void Phepcong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập hệ số a");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập hệ số b");
        int b = sc.nextInt();
        int tong=a+b;
        System.out.println("Tổng của 2 số là: "+tong);
    }
    private static void Pheptru(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập hệ số a");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập hệ số b");
        int b = sc.nextInt();
        int hieu=a-b;
        System.out.println("Hiệu của 2 số là: "+hieu);
    }
        private static void Phepnhan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập hệ số a");
        double a = sc.nextInt();
        System.out.println("Mời bạn nhập hệ số b");
        double b = sc.nextInt();
        double tich=a*b;
        System.out.println("Tích của 2 số là: "+tich);
    }
        private static void Phepchia(){
            double thuong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập hệ số a");
        double a = sc.nextInt();
        System.out.println("Mời bạn nhập hệ số b");
        double b = sc.nextInt();
        if(b!=0)
        {
           thuong=a/b;
        }
        System.out.println("Thương của 2 số là: "+thuong);
    }
}
