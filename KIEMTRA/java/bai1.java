package KIEMTRA.java;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String chuoi = sc.nextLine();
            int demkhoangTrang = 0;
            boolean trongKhoangTrang = false;
            for (char c : chuoi.toCharArray()) {
                if (c == ' ') {
                    if (!trongKhoangTrang) {
                        demkhoangTrang++;
                        trongKhoangTrang = true;
                    } else {
                        trongKhoangTrang = false;
                    }
                    System.out.println(demkhoangTrang);
                }
            }
        }
    }
}
