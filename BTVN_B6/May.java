package BTVN_B6;

import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May(){

    }

    public May ( String maMay, String tenMay,String tinhTrang){
        this.maMay=maMay;
        this.tenMay=tenMay;
        this.tinhTrang=tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" mã máy :");
        maMay=sc.nextLine();
        System.out.println(" tên máy :");
        maMay=sc.nextLine();
        System.out.println(" tình trạng:");
        tinhTrang=sc.nextLine();
    }
    public void xuat(){
        System.out.println(" mã máy là:" + maMay);
        System.out.println(" tên máy :" + tenMay);
        System.out.println(" tình trạng :"+ tinhTrang);
    }
}