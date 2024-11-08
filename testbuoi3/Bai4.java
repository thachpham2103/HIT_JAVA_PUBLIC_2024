package testbuoi3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so phan tu n= ");
        int n = sc.nextInt();
        if (n < 1 && n > 1000000){
            System.out.println(" nhap lai n!");
            return;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" nhập vào các phần tử của mảng :");
            a[i] = sc.nextInt();
        }
        System.out.println(" nhập chỉ số l :");
        int l = sc.nextInt();
        System.out.println(" nhập chỉ số r:");
        int r = sc.nextInt();
        int sum = 0;
        for (int i = l; i < n; i++) {
            sum += a[i];
        }
        System.out.println(" tổng là :" + sum);
    }
}
