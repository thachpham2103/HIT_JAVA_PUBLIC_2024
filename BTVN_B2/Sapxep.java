package BTVN_B2;

import java.util.Scanner;
import java .util.*;

public class Sapxep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào số phần tử :");
        int n= sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //sắp xếp tăng dần
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");

        }

    }
}
