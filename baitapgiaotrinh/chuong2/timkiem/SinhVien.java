package baitapgiaotrinh.chuong2.timkiem;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int ngaySinh;
    private double diemTT;
    private String nganhHoc;
    private String khoa;
    private int ngayNhapHoc;
    private String queQuan;

    public SinhVien() {

    }

    public SinhVien(String maSV, String hoTen, int ngaySinh, String queQuan,
                    double diemTT, String nganhHoc, String khoa, int ngayNhapHoc) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.diemTT = diemTT;
        this.nganhHoc = nganhHoc;
        this.khoa = khoa;
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTT() {
        return diemTT;
    }

    public void setDiemTT(double diemTT) {
        this.diemTT = diemTT;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public int getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(int ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào mã SV:");
        maSV = sc.nextLine();
        System.out.println(" nhập vào họ tên :");
        hoTen = sc.nextLine();
        System.out.println(" nhập vào ngày sinh:");
        ngaySinh = sc.nextInt();
        System.out.println(" nhập vào điểm TT:");
        diemTT = sc.nextDouble();
        System.out.println(" nhập vào ngành học :");
        nganhHoc = sc.nextLine();
        System.out.println(" nhập vào khoa:");
        khoa = sc.nextLine();
        System.out.println(" nhạp vào ngày nhập học:");
        ngayNhapHoc = sc.nextInt();
        System.out.println(" nhập vào quê quán :");
        queQuan = sc.nextLine();
    }

    public void xuat() {
        System.out.println(" mã sv:" + maSV + " hoTen:" + hoTen + " ngaySinh:" + ngaySinh + " điểm tt:" + diemTT + " ngành học:"
                + nganhHoc + " khoa:" + khoa + " ngày nhập học:" + ngayNhapHoc + "quê quán:" + queQuan);
    }
}
