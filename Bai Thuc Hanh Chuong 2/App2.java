import java.util.Scanner;

public class App2 {
    public static void main(String[] agr) throws Exception {
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen:");
        so = scanner.nextInt();
        if (so % 2 == 0) {
            System.out.println("So " + so + "la so chan");
        } else {
            System.out.println("So " + so + " la so le");
        }
        scanner.close();
    }
}