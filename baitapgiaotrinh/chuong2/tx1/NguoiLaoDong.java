package baitapgiaotrinh.chuong2.tx1;


import java.util.Scanner;

public class NguoiLaoDong {
    private String hoTen;
    private String diaChi;

    public NguoiLaoDong(){

    }
    public NguoiLaoDong(String hoTen,String diaChi){
        this.diaChi=diaChi;
        this.hoTen=hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào địa chỉ:");
        diaChi = sc.nextLine();
        System.out.println(" nhập vào họ tên :");
        hoTen = sc.nextLine();
    }
    public double tinhLuong(){
        return 0;
    }
    public void xuat(){
        System.out.println(" địa chỉ:"+diaChi +" họTen:"+hoTen);
    }
}
