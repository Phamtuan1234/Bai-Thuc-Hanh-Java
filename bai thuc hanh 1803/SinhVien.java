import java.util.Scanner;

public class SinhVien<DateTime>{
    String MaSv;
    String Hoten;
    Boolean Gioitinh;
    String DiaChi;
    DateTime NgaySinh;
   
    public void nhapMaSv(){
        System.out.print("Nhap ma sinh vien: ");
        Scanner sc = new Scanner(System.in);
        MaSv = sc.nextLine();
    }
    public void nhapHoten(){
        System.out.print("Nhap ho ten sinh vien: ");
        Scanner sc = new Scanner(System.in);
        Hoten = sc.nextLine();
    }
    public void nhapGioiTinh(){
        System.out.print("Nhap gioi tinh: ");
        Scanner sc = new Scanner(System.in);
        Gioitinh = sc.hasNext();
    }
    public void nhapDiaChi(){
        System.out.println("Nhap dia chi: ");
        Scanner sc = new Scanner(System.in);
        DiaChi = sc.nextLine();
    }
    public void nhapNgaySinh(){
        System.out.println("Nhap ngay sinh: ");
        Scanner sc = new Scanner(System.in);
        NgaySinh = (DateTime) sc.nextLine();
    }
    public void inMaSv(){
        System.out.println("Ma sinh vien: " + MaSv);
    }
    public void inHoten(){
        System.out.println("Ho ten sinh vien: " + Hoten);
    }
    public void inGioitinh(){
        System.out.println("Gioi tinh: " + Gioitinh);
    }
    public void inDiaChi(){
        System.out.println("Dia chi: " + DiaChi);
    }
    public void inNgaySinh(){
        System.out.println("Ngay sinh: " + NgaySinh);
    }
    public static void main(String[] args){
        SinhVien sv = new SinhVien();
        sv.nhapMaSv();
        sv.nhapHoten();
        sv.nhapGioiTinh();
        sv.nhapDiaChi();
        sv.nhapNgaySinh();
        sv.inMaSv();
        sv.inHoten();
        sv.inGioitinh();
        sv.inDiaChi();
        sv.inNgaySinh();
    }
}