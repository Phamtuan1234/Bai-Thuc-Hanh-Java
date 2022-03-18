import java.util.Scanner;

public class App9 {
    public static void main(String[] agr) throws Exception {
        String chuoi;
        char kytu;
        int dem = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu:");
        chuoi = scanner.nextLine();
        System.out.println("Cac ky tu trong chuoi vua nhap la:");
        for (int i = 0; i < chuoi.length(); i++) {
            dem++;
            kytu = chuoi.charAt(i);
            System.out.print(kytu + ",");
        }
        System.out.println("\nTong so ky tu trong chuoi la: " + dem);
        scanner.close();
    }
}