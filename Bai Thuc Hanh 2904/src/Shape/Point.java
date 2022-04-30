package Shape;

import java.util.Scanner;

public class Point {
    protected String Diem;
    protected float hoanhDo;
    protected float tungDo;

    public Point(String Diem, float hoanhDo, float tungDo) {
        this.Diem = Diem;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public Point() {

    }

    public float getHoanhDo() {
        return hoanhDo;
    }

    public float getTungDo() {
        return tungDo;
    }

    public void setHoanhDo(float hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public void setTungDo(float tungDo) {
        this.tungDo = tungDo;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten diem: ");
        Diem = sc.nextLine();
        System.out.print("Nhap hoanh do: ");
        hoanhDo = sc.nextFloat();
        System.out.print("Nhap tung do: ");
        tungDo = sc.nextFloat();
    }

    public void inDiem() {
        System.out.println("Diem: " + Diem + "(" + hoanhDo + "," + tungDo + ")");
    }

}