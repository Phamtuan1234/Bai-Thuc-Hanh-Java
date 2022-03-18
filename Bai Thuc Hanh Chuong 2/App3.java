import java.util.Scanner;

public class App3 {
    public static void main(String[] agr) throws Exception {
        String ten;
        int tuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        ten = scanner.nextLine();
        System.out.println("Nhap tuoi:");
        tuoi = scanner.nextInt();
        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
        }
        if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + ten + " o do tuoi truong thanh");
        } else {
            System.out.println("Ban " + ten + " da gia");
        }

        scanner.close();
    }

}