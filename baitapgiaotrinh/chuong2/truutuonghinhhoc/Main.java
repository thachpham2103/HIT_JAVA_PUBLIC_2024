package baitapgiaotrinh.chuong2.truutuonghinhhoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hinh HCN = new HinhChuNhat(" HCN", 4, 5);
        System.out.println(HCN);
        Hinh b = new HinhTron(" tron", 5);
        HinhChuNhat a = new HinhChuNhat();
        System.out.println(b);
        a.nhap();
        System.out.println(a);
    }
}
