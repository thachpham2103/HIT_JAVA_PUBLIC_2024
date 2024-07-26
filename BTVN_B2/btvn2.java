package BTVN_B2;

import java.util.Scanner;

public class btvn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" nhập vào số lượng phần tử của mảng :");
        int n= sc.nextInt();
        if(n<=0 || n>Math.pow(10,4)){
            System.out.println(" n không hợp lệ !");
            return;
        }
        int [] arr=new int [n];
        System.out.println(" nhập vào số các phần tử trong mảng :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(Math.pow(10,8)<Math.abs(arr[i])){
                System.out.println(" giá trị phần tử mảng không hợp lệ !");
            }
            System.out.println(" nhập vào phần tử thứ"+(i)+ " :");
        }
        System.out.println(" các phần tử trong mảng là:");
        for( int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
        for (int i = 0; i < n; i++) {

            if (i % 2 != 0) {
                int left = (i > 0) ? arr[i - 1] : 0;
                int right = (i < n - 1) ? arr[i + 1] : 0;

                int b2= arr[i] + Math.abs(right - left);
                arr[i] = b2;
            }
        }
        System.out.print("Mảng sau khi thay thế: ");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");        }

    }

}


