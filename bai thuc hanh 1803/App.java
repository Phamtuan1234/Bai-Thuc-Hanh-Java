import java.util.Scanner;

class DientichchuviHT {
    public static double tinhDienTich(double r) {
        return r * r * 3.14;
    }

    public static double tinhChuVi(double r) {
        return r * 2 * 3.14;
    }

    public static void main(String[] args) {

    }

    class HinhTron {
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;

        void nhapBanKinh() {
            System.out.println("Hay nhap vao ban kinh hinh tron: ");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextFloat();
        }

        void tinhChuVi() {
            cv = 2 + PI * r;
        }

        void tinhDienTich() {
            dt = PI * r;
        }

        void inChuVi() {
            System.out.println("Chu vi hinh tron: " + cv);
        }

        void inDienTich() {
            System.out.println("Dien tich hinh tron: " + dt);
            ;
        }
    }
}