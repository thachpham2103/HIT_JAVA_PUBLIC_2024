package baitapgiaotrinh.chuong2.truutuonghinhhoc;

import java.util.Scanner;

public class HinhChuNhat extends Hinh {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        super();
    }

    public double getChieuRong() {
        if (chieuRong < 0) {
            System.out.println(" nhập lại chiều rộng !");
            return 0;
        } else
            return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat(String tenHinh, double chieuRong, double chieuDai) {
        super(tenHinh);
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public double getChieuDai() {
        if (chieuDai < 0) {
            System.out.println(" nhập lại chiều dài!");
            return 0;
        }
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào chiều dài và chiều rộng của HCN là :");
        chieuDai = sc.nextDouble();
        chieuRong = sc.nextDouble();
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
@Override
    public String toString() {
    return super.toString() + " tenHinh:" + getTenHinh() + " chieuDai:" + chieuDai + " chieuRong:" + chieuRong+" dientich:"+tinhDienTich()
            +" chuVi:"+tinhChuVi();
      }
}
