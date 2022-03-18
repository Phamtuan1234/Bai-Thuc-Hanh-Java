import java.util.Scanner;

public class App11 {
    public static void main(String[] agr) throws Exception {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu cua mang:");
            n = scanner.nextInt();
        } while (n < 0);
        int mang[] = new int[n];
        System.out.println("Nhap cac phan tu vao mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ":");
            mang[i] = scanner.nextInt();
        }
        System.out.println("Mang ban dau la:");
        for (int i = 0; i < n; i++) {
            System.out.println(mang[i] + ",");
        }
        System.out.println("Mang sap xep tang dan");
        int trunggian = mang[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] > mang[j]) {
                    trunggian = mang[i];
                    mang[i] = mang[j];
                    mang[j] = trunggian;
                }
            }
        }
        System.out.println("Sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + ",");
        }
        scanner.close();
    }

}