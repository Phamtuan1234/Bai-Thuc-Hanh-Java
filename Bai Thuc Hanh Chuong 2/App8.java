import java.util.Scanner;

public class App8 {
    public static void main(String[] agr) throws Exception {
        int dayso, so, tong = 0;
        float tbc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri cho day so muon nhap:");
        dayso = scanner.nextInt();
        for (int i = 1; i <= dayso; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            so = scanner.nextInt();
            tong += so;
        }
        tbc = tong / 2;
        System.out.println("Trung binh cong cua day so =" + tbc);
        scanner.close();
    }

}