import java.util.Scanner;

public class App30 {
    public static void main(String[] args) {
        int n, sodu, tongcacchuso = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap vao mot so nguyen duong bat ky :");
            n = scanner.nextInt();
        }

        while (n > 0) {
            sodu = n % 10;
            n = n / 10;
            tongcacchuso += sodu;
        }
        System.out.println("Tong cac chu so la :" + tongcacchuso);
    }
}