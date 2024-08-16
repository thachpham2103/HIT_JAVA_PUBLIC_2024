package BTVN_B6;

import java.util.Scanner;

public class School {
    private String tenTruong;
    private String ngayVaoTruong;

    public School() {

    }

    public School(String tenTruong, String ngayVaoTruong) {
        this.tenTruong = tenTruong;
        this.ngayVaoTruong = ngayVaoTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public String getNgayVaoTruong() {
        return ngayVaoTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public void setNgayVaoTruong(String ngayVaoTruong) {
        this.ngayVaoTruong = ngayVaoTruong;
    }
        public void nhap (){
            Scanner sc=new Scanner(System.in);
            System.out.println(" nhập tên trường:");
            tenTruong=sc.nextLine();
            System.out.println(" nhập ngày vào trường: ");
            ngayVaoTruong=sc.nextLine();
        }
        public void xuat(){
            System.out.println(" tên trường:" + tenTruong);
            System.out.println(" ngày vào trường :" + ngayVaoTruong);
        }
    }