package baitapgiaotrinh.chuong2.chuong2;

import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời nhập chuỗi :");
        String a = sc.nextLine();
        if (isPalindrome(a)) {
            String upperCaseString = a.toUpperCase();
            System.out.println("Chuỗi đối xứng. Chuỗi viết hoa là: " + upperCaseString);
        } else {
            System.out.println("Chuỗi không đối xứng.");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
