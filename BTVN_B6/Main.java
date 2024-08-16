package BTVN_B6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập sô sinh viên cần cung cấp :");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].nhap();
        }

        for (int i=0;i<n;i++) {
            students[i].xuat();
        }
    }
}
