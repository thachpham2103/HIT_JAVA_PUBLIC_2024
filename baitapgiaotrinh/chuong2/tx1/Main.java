package baitapgiaotrinh.chuong2.tx1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KiSu a = new KiSu();
        KiSu b = new KiSu(" jj", "j", 8, 4, 5, 6);
        System.out.println(b);
        System.out.println(b.tinhLuong());
        LaoDongPhoThong c = new LaoDongPhoThong("t", " h", 5, 6, 7);
        System.out.println(c);
        System.out.println(c.tinhLuong());
    }
}
