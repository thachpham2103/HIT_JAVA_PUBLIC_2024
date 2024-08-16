package BTVN_B6;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private  QuanLy x;
    private May y;

     public PhongMay(){
         x=new QuanLy();
         y=new May();
     }
     public PhongMay( String maPhong, String tenPhong ,double dienTich,QuanLy quanly,May may){
         this.maPhong=maPhong;
         this.tenPhong=tenPhong;
         this.dienTich=dienTich;
         this.x=quanly;
         this.y=may;
     }

    public String getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public May getY() {
        return y;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public void setY(May y) {
        this.y = y;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" mã phòng là:");
        maPhong=sc.nextLine();
        System.out.println(" tên phòng là:");
        tenPhong=sc.nextLine();
        System.out.println(" diện tích là:");
        dienTich=sc.nextDouble();
        x.nhap();
        y.nhap();
    }
    public void xuat(){
        System.out.println(" mã phòng là :"+ maPhong);
        System.out.println(" tên phòng là:" + tenPhong);
        System.out.println(" diện tích là:" + dienTich);
        x.xuat();
        y.xuat();
    }
}