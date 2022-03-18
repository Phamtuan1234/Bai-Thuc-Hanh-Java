import Main1803.Person;
import Main1803.PhuongTrinhBacHai;
import Main1803.SinhVien;

public class App1803 {
    public static void main(String[] args) {
        Person ps = new Person();
        SinhVien sv = new SinhVien<>();
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersonID();
        ps.inPersonName();
        ps.inGender();
        ps.inAddress();
        System.out.println("\n\n");
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
        System.out.println("\n\n");
        pt.nhap();
        pt.in();
    }
}