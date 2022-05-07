import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) {
        // Khai bao 1 ArrayList co ten la arrListString
        // co kieu la String
        ArrayList<String> arrListString = new ArrayList<>();

        // them cac phan tu su dung phuong thuc add()
        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");

        // duyet theo kich thuoc cua arrListString
        // su dung vong lap for thong thuong
        // phuong thuc arrListString.size() se tra ve so phan tu cua arrListString
        // va sau do lay phan tu tai vi tri i thong qua ham get()
        // sau do hien thi gia tri phan tu do ra
        System.out.println("Cac phan tu co trong arrListString la: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }
    }
}
