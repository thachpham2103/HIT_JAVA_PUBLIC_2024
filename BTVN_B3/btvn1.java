package BTVN_B3;

import java.util.Scanner;
import java. math.BigInteger;
public class btvn1 {
    public static final String SQUARE = " Square";
    public static final String TRIANGLE = " Triangle";
    public static final String CIRCLE = " Circle";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhập type:");
        String type = sc.nextLine();
        if (type.equals(SQUARE))
        {
            System.out.print(" nhap a=");
            int a = sc.nextInt();
            System.out.println(" dientich=" + (a * a));
        }
        else if (type.equals(TRIANGLE))
        {
            System.out.println(" nhap a=");
            int a = sc.nextInt();
            System.out.println(" nhap b=");
            int b = sc.nextInt();
            System.out.println(" nhap c= ");
            int c = sc.nextInt();
            if (a + b > c && b + c > a && c + a > b) {
                double p = (a + b + c) / 2;
                double S=Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.printf(" dientich="+"%.2f\n" +(S));
            } else {
                System.out.println(" khong hop le!");
            }
        }
        else if ( type.equals( CIRCLE))
        {
            System.out.println(" nhap r=");
            int r= sc.nextInt();
            double S= Math.PI*Math.pow(r,2);
            System.out.println(" dientich="+" %.2f\n"+S);
        }
        else{
            System.out.println(" hình dạng không hợp lệ!");
        }
    }
}


