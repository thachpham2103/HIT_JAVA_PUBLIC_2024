package BTVN_B4;

import java.util.Scanner;

public class Student {
    private String ten, diaChi;
    private int namSinh;
    private double diemTx1;
    private double diemTx2;
    private double diemKetThucHp;
    private double diemGpa;
    private int soTietNghi;

    public Student() {

    }

    public Student(String ten, String diaChi, int namSinh, double diemTx1, double diemTx2, double diemKetThucHp,
                   double diemGpa, int soTietNghi) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.diemTx1 = diemTx1;
        this.diemTx2 = diemTx2;
        this.diemKetThucHp = diemKetThucHp;
        this.diemGpa = diemGpa;
        this.soTietNghi = soTietNghi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getnamSinh() {
        return 2024 - namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getdiemTx1() {
        return diemTx1;
    }

    public void setDiemTx1(int diemTx1) {
        this.diemTx1 = diemTx1;
    }

    public double getdiemTx2() {
        return diemTx2;
    }

    public void setDiemTx2(int diemTx2) {
        this.diemTx2 = diemTx2;
    }

    public double getdiemKetThucHp() {
        return diemKetThucHp;
    }

    public void setDiemKetThucHp(int diemKetThucHp) {
        this.diemKetThucHp = diemKetThucHp;
    }

    public double getdiemGpa() {
        return (diemTx1 * 0.2 + diemTx2 * 0.3 + diemKetThucHp * 0.5);
    }

    public void setDiemGpa(double diemGpa) {
        this.diemGpa = diemGpa;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập điểm TX1: ");
        diemTx1 = sc.nextDouble();
        System.out.println("Nhập điểm TX2: ");
        diemTx2 = sc.nextDouble();
        System.out.println("Nhập điểm KTHP: ");
        diemKetThucHp = sc.nextDouble();
        System.out.println("Nhập số tiết nghỉ: ");
        soTietNghi = sc.nextInt();
    }

    public void xuat() {
        System.out.println(ten + " " + namSinh + " " + diaChi + " " + diemTx1 + " " + diemTx2 + " " + diemKetThucHp + " " + diemGpa + " " + soTietNghi);

    }

}
