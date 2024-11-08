package testbuoi3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        String b = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                a += s.charAt(i);
            }
            else {
                b += s.charAt(i);
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}