package baitapgiaotrinh.chuong2.timkiem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <SinhVien> danhSachSV = new ArrayList<>();
        System.out.print("Nhap so luong sinh vien (n < 10): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSachSV.add(sv);
        }

        System.out.println("\nDanh sach sinh vien vua nhap:");
        for (SinhVien sv : danhSachSV) {
            sv.xuat();
            System.out.println("---------------------------");
        }

        boolean coQueHaNam = false;
        for (SinhVien sv : danhSachSV) {
            if (sv.getQueQuan().equalsIgnoreCase("Ha Nam")) {
                System.out.println("Thông tin sinh viên quê Hà Nam:");
                sv.xuat();
                coQueHaNam = true;
            }
        }
        if (!coQueHaNam) {
            System.out.println("Khong co sinh vien que Ha Nam");
        }
// xóa SV có điểm TT thấp nhất sau đó in lại DS
        if (!danhSachSV.isEmpty()) {
            SinhVien svMin = danhSachSV.get(0);
            for (SinhVien sv : danhSachSV) {
                if (sv.getDiemTT() < svMin.getDiemTT()) {
                    svMin = sv;
                }
            }

            danhSachSV.remove(svMin);
            System.out.println("\nSinh vien co diem truyen tuyen nho nhat da bi xoa:");
            svMin.xuat();
        }

        System.out.println("\nDanh sach sinh vien sau khi da xoa:");
        for (SinhVien sv : danhSachSV) {
            sv.xuat();
            System.out.println("---------------------------");
        }
    }
}
