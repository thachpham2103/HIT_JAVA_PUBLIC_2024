package BTVN_B3;

import java.util.Random;
import java.util.Scanner;

public class btvn3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt(11);
        int b = rd.nextInt(11);
        int c = rd.nextInt(21);
        System.out.println(a + " + " + b + " = " + c);
        System.out.println("Phep tinh tren dung hay sai (Y/N): ");
        char check = new Scanner(System.in).next().charAt(0);
        boolean kiemTra = ((a + b) == c);
        if (check == 'Y' && kiemTra)
            System.out.println("Chinh xac!");
        else if (check == 'N' && kiemTra)
            System.out.println("Sai!");
        else if (check == 'Y' && kiemTra == false)
            System.out.println("Sai!");
        else
            System.out.println("Chinh xac!");

    }
}
