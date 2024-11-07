package baitapgiaotrinh.chuong2.chuong2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TimKiem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        // Danh sách lưu điểm thi và tên sinh viên
        List<String> students = new ArrayList<>();
        List<Double> scores = new ArrayList<>();

        // Nhập thông tin sinh viên và điểm thi
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Nhập điểm Tiếng Anh của sinh viên " + name + ": ");
            double score = scanner.nextDouble();

            students.add(name);
            scores.add(score);
        }

        // Nhập điểm thi bất kỳ để tìm kiếm
        System.out.print("Nhập điểm thi để tìm sinh viên: ");
        double searchScore = scanner.nextDouble();

        // Tìm và in ra sinh viên có điểm thi bằng điểm đã nhập
        System.out.println("Sinh viên có điểm thi bằng " + searchScore + ":");
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (scores.get(i).equals(searchScore)) {
                System.out.println(students.get(i) + " - Điểm: " + scores.get(i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có sinh viên nào có điểm thi bằng " + searchScore);
        }

        scanner.close();
    }
}

