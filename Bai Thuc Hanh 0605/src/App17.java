import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) {
        // Khai bao 1 ArrayList co ten la arrListString
        // co kieu la String
        ArrayList<Integer> arrListInteger = new ArrayList<>();

        // them cac phan tu su dung phuong thuc add()
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);

        // duyet theo kich thuoc cua arrListInteger
        // su dung vong lap for duyet theo doi tuong
        // trong do kieu du lieu co bien number
        // phai trung voi kieu du lieu cua arrListinteger
        System.out.println("Cac phan tu co trong arrListInteger la: ");
        for (int number : arrListInteger) {
            System.out.print(number + "\t");
        }
    }
}
