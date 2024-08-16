package BTVN_B6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số máy trong phòng  :");
        int n = sc.nextInt();
        PhongMay[] PM = new PhongMay[n];
        for (int i = 0; i < n; i++) {
          PM[i] = new PhongMay();
            PM[i].nhap();
        }

        for (int i = 0; i < n; i++) {
            PM[i].xuat();
        }

    }
}
