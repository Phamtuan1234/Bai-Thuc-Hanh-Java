import java.util.Scanner;

public class App10 {
    public static void main(String[] agr) throws Exception {
        String chuoi;
        char kytu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky: ");
        chuoi = scanner.nextLine();
        System.out.println("Nhap vao ky tu muon kien tra so lan xuat hien:");
        kytu = scanner.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kytu) {
                count++;
            }
        }
        System.out.println("So lan xuat hien ky tu " + kytu + " trong chuoi " + chuoi + " la:" + count);
        scanner.close();
    }

}