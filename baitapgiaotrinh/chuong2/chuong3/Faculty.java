package baitapgiaotrinh.chuong2.chuong3;

import BTVN_B6.School;

import java.util.Scanner;

public class Faculty {
    private String tenKhoa;
    private  String ngayVaoKhoa;
    private School x;

 public Faculty (){
     x= new School();
 }
 public Faculty(String tenKhoa,String ngayVaoKhoa,School school){
     this.tenKhoa=tenKhoa;
     this.ngayVaoKhoa=ngayVaoKhoa;
     this.x=school;
 }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public String getNgayVaoKhoa() {
        return ngayVaoKhoa;
    }

    public School getX() {
        return x;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public void setNgayVaoKhoa(String ngayVaoKhoa) {
        this.ngayVaoKhoa = ngayVaoKhoa;
    }

    public void setX(School x) {
        this.x = x;
    }
   public void nhap(){
     Scanner sc= new Scanner(System.in );
       System.out.println(" tên khoa:");
       tenKhoa=sc.nextLine();
       System.out.println(" ngày vào khoa:");
       ngayVaoKhoa =sc.nextLine();
       x.nhap();
   }
   public void xuat(){
       System.out.println(" tên khoa:" + tenKhoa);
       System.out.println(" ngày vào khoa " + ngayVaoKhoa);
       x.xuat();

   }
}