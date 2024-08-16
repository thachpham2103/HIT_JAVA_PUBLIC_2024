package BTVN_B6;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public  QuanLy(){

    }
    public  QuanLy(String maQL,String hoTen){
        this.maQL=maQL;
        this.hoTen=hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" mã quản lý là:");
        maQL=sc.nextLine();
        System.out.println(" họ tên là :");
        hoTen=sc.nextLine();
    }
    public void xuat(){
        System.out.println(" mã quản lý :"+ maQL );
        System.out.println(" họ tên :" + hoTen);
    }
}