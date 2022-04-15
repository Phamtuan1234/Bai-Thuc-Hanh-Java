package shapes;

import java.util.Scanner;

public class Hinhtron {

    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    public void nhapBanKinh() {
        System.out.println("Hay nhap ban kinh: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }

    public void TinhCHuVi() {
        cv = 2 * PI * r;
    }

    public void tinhDienTich() {
        dt = PI * r;
    }

    public void inChuVi() {
        System.out.println("Chu vi hinh tron: ");
    }

    public void inDienTich() {
        System.out.println("Dien tich hinh tron: ");

    }
}