import java.util.Scanner;

public class App6 {
    public static void main(String[] agr) throws Exception {
        int so, tang = 1;
        long giaithua = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao 1 so:");
            so = scanner.nextInt();
        } while (so < 0);
        while (tang <= so) {
            giaithua *= tang;
            tang++;
        }
        System.out.println(so + "!=" + giaithua);
        scanner.close();
    }

}