import java.util.Scanner;

public class PhuongTrinhBacHai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, del;
        System.out.print("Nhập vào hệ số a = ");
        a = sc.nextDouble();
        System.out.print("Nhập vào hệ số b = ");
        b = sc.nextDouble();
        System.out.print("Nhập vào hệ số c = ");
        c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm!");
                } else {
                    System.out.println("Phương trình vô nghiệm!");
                }
            } else {
                System.out.println("Phương trình có nghiệm là: " + (-c / b));
            }
        } else {
            del = b * b - 4 * a * c;
            if (del < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (del == 0) {
                x1 = x2 = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: " + x1);
            } else {
                x1 = (-b + Math.sqrt(del)) / (2 * a);
                x2 = (-b - Math.sqrt(del)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt là:\nx1 = " + x1 + "\nx2 = " + x2);
            }
        }

        sc.close();
    }

}