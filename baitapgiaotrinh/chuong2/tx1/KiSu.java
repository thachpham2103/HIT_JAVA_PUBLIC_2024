package baitapgiaotrinh.chuong2.tx1;

import java.util.Scanner;

public class KiSu  extends NguoiLaoDong{
    private double luongCoBan;
    private int heSoLuong;
    private int soNgayCong;
    private double thuong;

    public KiSu(){
        super();
    }

    public KiSu(String hoTen,String diaChi,double luongCoBan,int heSoLuong,double thuong,int soNgayCong){
        super(hoTen, diaChi);
        this.luongCoBan=luongCoBan;
        this.heSoLuong=heSoLuong;
        this.soNgayCong=soNgayCong;
        this.thuong=thuong;

    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int soNgayCong() {
        return soNgayCong;
    }

    public void setsoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public double getthuong() {
        if(soNgayCong>=25){
            return thuong=200000000;
        }
        else if(soNgayCong>15 && soNgayCong<25){
            return thuong=100000000;
        }
        else
            return thuong=5000000;
    }

    public void setthuong(double thuong) {
        this.thuong = thuong;
    }

    public double tinhLuong(){
        return luongCoBan*heSoLuong +thuong;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao luong co ban:");
        luongCoBan=sc.nextDouble();
        System.out.println(" nhap vao he so luong:");
        heSoLuong=sc.nextInt();
        System.out.println(" nhap vao so ngay cong :");
        soNgayCong=sc.nextInt();
        System.out.println(" nhap vao thuong:");
        thuong=sc.nextDouble();
    }
    public void xuat(){
        System.out.println(" luong co ban:"+luongCoBan+" he so luong:"+heSoLuong+ " ngay cong:"+soNgayCong+" thuong:"+thuong);
    }

}
