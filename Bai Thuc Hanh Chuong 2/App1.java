import java.util.Scanner;

public class App1 {
        public static void main(String[] args) throws Exception {
                int so1, so2, tong, hieu, tich, thuong, du;
                Scanner scanner = new Scanner(System.in);
                // tinh tong, hieu, tich, thuong, chia lay du
                System.out.println("Nhap vao so thu nhat:");
                so1 = scanner.nextInt();
                System.out.println("Nhap vao so thu hai:");
                so2 = scanner.nextInt();
                System.out.print("Tong hai so la:");
                tong = so1 + so2;
                System.out.println(tong);
                System.out.print("Hieu hai so la:");
                hieu = so1 - so2;
                System.out.println(hieu);
                System.out.print("Tich cua hai so la:");
                tich = so1 * so2;
                System.out.println(tich);
                System.out.print("Thuong cua hai so la:");
                thuong = so1 / so2;
                System.out.println(thuong);
                System.out.print("Chia du cua hai so la:");
                du = so1 % so2;
                System.out.println(du);
                // so sanh
                if (so1 < so2) {
                        System.out.println("So " + so2 + " lon hon so " + so1);
                } else {
                        System.out.println("So " + so1 + " lon hon so " + so2);
                }
                scanner.close();
        }
}