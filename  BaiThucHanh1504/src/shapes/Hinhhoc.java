package shapes;

import java.util.Scanner;

public class Hinhhoc {
    public final float PI = 3.14f;
    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;

    public void xuatTen() {
        System.out.println("\n\n============" + ten + "============");
    }

    public void inChuVi() {
        System.out.println("Chu Vi: " + chuvi);
    }

    public void inDienTich() {
        System.out.println("Dien Tich: " + dientich);
    }

    public void inTheTich() {
        System.out.println("Thể Tích: " + thetich);
    }

    public static void main(String[] args) {
    }

    public class HinhTron extends Hinhhoc {
        public float bankinh;

        public void HinhTron() {
            ten = "HinhTron";
        }

        public void NhapBanKinh() {
            System.out.println("Nhập bán kính hình tron: ");
            Scanner Scanner = new Scanner(System.in);
            bankinh = Scanner.nextFloat();
        }

        public void TinhChuVi() {

        }
    }

}