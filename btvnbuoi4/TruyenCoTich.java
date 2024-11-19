package btvnbuoi4;

import java.util.Scanner;

public class TruyenCoTich extends Book {
    private String noiBan;
    private int soLuongMua;

    public TruyenCoTich(String noiBan, int soLuongMua) {
        this.noiBan = noiBan;
        this.soLuongMua = soLuongMua;
    }

    public TruyenCoTich(int maSach, String tenSach, TacGia x, int namSanXuat, String tomTatNoiDung, double giaTien, String noiBan, int soLuongMua) {
        super(maSach, tenSach, x, namSanXuat, tomTatNoiDung, giaTien);
        this.noiBan = noiBan;
        this.soLuongMua = soLuongMua;
    }

    public String getNoiBan() {
        return noiBan;
    }

    public void setNoiBan(String noiBan) {
        this.noiBan = noiBan;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập nơi bán:");
        noiBan = sc.nextLine();
        System.out.println(" nhập số lượng mua:");
        soLuongMua = sc.nextInt();
        super.nhap();
    }

    @Override
    public String toString() {
        return "TruyenCoTich{" + super.toString() +
                "noiBan='" + noiBan + '\'' +
                ", soLuongMua=" + soLuongMua +
                '}';
    }
}
