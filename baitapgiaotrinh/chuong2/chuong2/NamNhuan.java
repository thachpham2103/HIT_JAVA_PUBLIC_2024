package baitapgiaotrinh.chuong2.chuong2;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập năm :");
        int a=sc.nextInt();
        // kiểm tra xem năm đó có phải là năm nhuận
        if(a%4==0 && a%100 !=0 || a%400==0){
            System.out.println(" năm đó là năm nhuận !");
        }
        else
            System.out.println(" khong là năm nhuận! ");

    }
}
