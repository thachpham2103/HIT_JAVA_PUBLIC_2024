package testbuoi3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao x=");
        float x = sc.nextFloat();
        if (x < -100 && x > 100) {
            System.out.println(" nhap lai n!");
            return;
        }
        System.out.println(" nhap y =");
        int y = sc.nextInt();
        if (y < Math.pow(-2, 31 - 1) && y > Math.pow(2, 31 - 1)) {
            System.out.println(" nhap lai y!");
            return;
        }
        double a = Math.pow(x,y);
        System.out.println(" giá trị ="+a);
    }
}
