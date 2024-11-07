package baitapgiaotrinh.chuong2.chuong2;

import java.util.Scanner;

public class TinhChuViDienTich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" nhập vào bán kính r=");
        double r= sc.nextDouble();
        if(r<=0 || r>1000 ){
            System.out.println(" không thõa mãn giá trị của r ! Yêu cầu chạy lại chương trình <3 ");
            return;
        }
        double cv= 2*Math.PI*r;
        double dientich= Math.PI*Math.pow(r,2);
        System.out.println(" chu vi hình tròn là:"+cv);
        System.out.println(" diện tích hình tròn là :"+dientich);

    }
}
