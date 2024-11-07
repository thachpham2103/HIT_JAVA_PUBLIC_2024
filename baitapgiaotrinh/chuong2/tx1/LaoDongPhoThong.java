package baitapgiaotrinh.chuong2.tx1;

import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
      private int soNgayCong;
      private int  donGiaNgayCong;
      private double thuong;


      public LaoDongPhoThong(){
          super();
      }
      public LaoDongPhoThong( String hoTen,String diaChi,int soNgayCong,int  donGiaNgayCong,double thuong){
          super(hoTen,diaChi);
          this.soNgayCong=soNgayCong;
          this.donGiaNgayCong=donGiaNgayCong;
          this.thuong=thuong;

      }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public int  getDonGiaNgayCong() {
        return donGiaNgayCong;
    }

    public void setDonGiaNgayCong(int  donGiaNgayCong) {
        this.donGiaNgayCong = donGiaNgayCong;
    }

    public double getThuong() {
          if(soNgayCong>=25){
              return thuong=10000000;
          }
          else if(soNgayCong>15 && soNgayCong <25){
              return thuong=7000000;
          }
          else
            return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }


    public double tinhLuong(){
          return soNgayCong *donGiaNgayCong+ thuong;
    }

    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println(" nhập vào số ngày  công :");
        soNgayCong=sc.nextInt();
        System.out.println(" nhập vào đơn giá ngày công :" );
        donGiaNgayCong=sc.nextInt();
        System.out.println(" nhập vào thưởng:");
        thuong=sc.nextDouble();
    }
    public void xuat(){
        System.out.println(" ngaycong:"+soNgayCong+" đơn giá ngày công :"+donGiaNgayCong+" thưởng :"+thuong);
    }
}
