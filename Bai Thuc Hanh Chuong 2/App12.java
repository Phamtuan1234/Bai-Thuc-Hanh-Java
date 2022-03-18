import java.util.Scanner;

public class App12 {
    public static void main(String[] agr) throws Exception {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran:");
        n = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran:");
        m = scanner.nextInt();
        int mang[][] = new int[n][m];
        System.out.println("Nhap phan tu vao ma tran 2 chieu:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "]");
                mang[i][j] = scanner.nextInt();
            }
        }
        int max = mang[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < mang[i][j]) {
                    max = mang[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong ma tran la:" + max);
        scanner.close();
    }
}