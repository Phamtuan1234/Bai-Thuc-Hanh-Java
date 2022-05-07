import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayLisInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua arrayListInteger: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            int number = scanner.nextInt();
            arrayLisInteger.add(number);
            int max = arrayLisInteger.get(0);
            for (int j = 1; j < arrayLisInteger.size(); j++) {
                if (arrayLisInteger.get(j).compareTo(max) > 0) {
                    max = arrayLisInteger.get(j);
                }
            }
            System.out.println("Phan tu lon nhat trong arrayListInteger la: " + max);
        }
    }

}