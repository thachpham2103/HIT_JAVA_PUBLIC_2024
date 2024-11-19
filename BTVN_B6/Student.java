package BTVN_B6;

import baitapgiaotrinh.chuong2.chuong3.Faculty;

import java.util.Scanner;

public class Student {
    private String tenSinhVien;
    private String tenLop;
    private double soDiem;
    private Faculty y;

    public Student(){
        y= new Faculty();
    }
    public Student(String tenSinhVien,String tenLop,double soDiem,Faculty faculty){
        this.tenSinhVien=tenSinhVien;
        this.tenLop=tenLop;
        this.soDiem=soDiem;
        this.y=faculty;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public String getTenLop() {
        return tenLop;
    }

    public double getSoDiem() {
        return soDiem;
    }

    public Faculty getY() {
        return y;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setSoDiem(double soDiem) {
        this.soDiem = soDiem;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" nhập tên sinh viên :");
        tenSinhVien= sc.nextLine();
        System.out.println(" nhập tên lớp :");
        tenLop=sc.nextLine();
        System.out.println(" số điểm :");
        soDiem=sc.nextDouble();
        y.nhap();
    }
    public void xuat(){
        System.out.println(" tên sinh viên :" + tenSinhVien);
        System.out.println(" tên lớp :" + tenLop);
        System.out.println(" số điểm :" + soDiem);
        y.xuat();
    }
}