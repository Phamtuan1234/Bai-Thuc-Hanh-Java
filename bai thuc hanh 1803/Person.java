import java.util.Scanner;

public class Person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;

    public void nhapPersonID() {
        System.out.print("Nhap PersonID: ");
        Scanner sc = new Scanner(System.in);
        PersonID = sc.nextLine();
    }

    public void nhapPersonName() {
        System.out.print("Nhap PersonName: ");
        Scanner sc = new Scanner(System.in);
        PersonName = sc.nextLine();
    }

    public void nhapGender() {
        System.out.print("Nhap Gender: ");
        Scanner sc = new Scanner(System.in);
        Gender = sc.hasNext();
    }

    public void nhapAddress() {
        System.out.print("Nhap Address: ");
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
    }

    public void inPersonID() {
        System.out.println("PersonID : " + PersonID);
    }

    public void inPersonName() {
        System.out.println("PersonName : " + PersonName);
    }

    public void inGender() {
        System.out.println("Gender : " + Gender);
    }

    public void inAddress() {
        System.out.println("Address: " + Address);
    }

    public static void main(String[] args) {
        Person ps = new Person();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersonID();
        ps.inPersonName();
        ps.inGender();
        ps.inAddress();
    }
}