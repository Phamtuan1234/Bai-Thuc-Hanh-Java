import Main.HinhChuNhat;
import Main.HinhTron;

public class App {
    public static void main(String[] args) {
   HinhTron hinhTron = new HinhTron();
   HinhChuNhat hinhChuNhat = new HinhChuNhat();
   hinhTron.nhapbankinh();
   hinhTron.tinhchuvi();
   hinhTron.tinhdientich();
   hinhTron.inchuvi();
   hinhTron.indientich();
   System.out.println("\n\n");
   hinhChuNhat.nhapchieudai();
   hinhChuNhat.nhapchieurong();
   hinhChuNhat.tinhchuvi();
   hinhChuNhat.tinhdientich();
   hinhChuNhat.inchuvi();
   hinhChuNhat.indientich();
   }
}