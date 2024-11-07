package baitapgiaotrinh.chuong2.chuong2;

import java.util.Scanner;

public class GiaiThua {
    public static double giaithua(int n) {
        if (n == 0) {
            return 1;
        }
        else
            return n * giaithua(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập n=");
        int n = sc.nextInt();
        double b = giaithua(n);
        System.out.println(" giai thừa của:" + n + " là :" + b);

    }
}
