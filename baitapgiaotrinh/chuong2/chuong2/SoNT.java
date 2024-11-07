package baitapgiaotrinh.chuong2.chuong2;
import java.util.Scanner;
public class SoNT {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập một số nguyên: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " là số nguyên tố.");
            } else {
                System.out.println(number + " không phải là số nguyên tố.");
            }

            scanner.close();
        }

        public static boolean isPrime(int n) {
            // Số nguyên tố phải lớn hơn 1
            if (n <= 1) {
                return false;
            }

            // Kiểm tra từ 2 đến √n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false; // Nếu n chia hết cho i, thì n không phải là số nguyên tố
                }
            }
            return true; // Nếu không chia hết cho bất kỳ số nào, thì n là số nguyên tố
        }
    }

