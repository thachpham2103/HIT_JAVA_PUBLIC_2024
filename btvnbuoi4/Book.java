package btvnbuoi4;

import java.util.Scanner;

public class Book {
    private int maSach;
    private String tenSach;
    private TacGia x;
    private int namSanXuat;
    private String tomTatNoiDung;
    private double giaTien;

    public Book() {
        x=new TacGia();
    }

    public Book(int maSach, String tenSach, TacGia x, int namSanXuat, String tomTatNoiDung, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.x = x;
        this.namSanXuat = namSanXuat;
        this.tomTatNoiDung = tomTatNoiDung;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public TacGia getTenTacGia() {
        return x;
    }

    public void setTenTacGia(TacGia tenTacGia) {
        this.x = tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }

    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        if (giaTien > 0) {
            this.giaTien = giaTien;
        }
    }


    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập mã sách :");
        maSach = sc.nextInt();
        System.out.println(" nhập váo tên sách:");
        tenSach = sc.nextLine();
        System.out.println(" nhập vào tên tác giả:");

        System.out.println(" nhập vào năm SX:");
        namSanXuat = sc.nextInt();
        System.out.println(" tóm tắt ND:");
        tomTatNoiDung = sc.nextLine();
        System.out.println(" nhập vào giá tiền:");
        giaTien = sc.nextDouble();
    }


    public void xuat() {
        System.out.println( " mã sách:" + maSach + "tên sách: " + tenSach + " tên tác giả:" +x+
                " năm sản xuất :" + namSanXuat + " tóm tắt ND:" + tomTatNoiDung + " Giá tiền :" + giaTien);
    }
}
