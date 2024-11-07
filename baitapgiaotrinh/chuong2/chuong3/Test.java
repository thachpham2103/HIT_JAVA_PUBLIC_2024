package baitapgiaotrinh.chuong2.chuong3;

import BTVN_B4.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n = 5;
        Student[] students = new Student[5];
        students[0] = new Student("Nguyen Van A", " Thanh Hoa", 2005, 6, 7.75,
                8, 0, 4);
        students[1] = new Student("Nguyen Thi B", " Hà Nam", 2004, 6, 7,
                8, 0, 3);
        students[2] = new Student("Le Pham Van C", " Nam Định", 2005, 7, 8.5,
                9, 0, 2);
        students[3] = new Student("Nguyen Van D", " Hải Dương", 2005, 7, 6,
                8, 0, 1);
        students[4] = new Student(" Nguyen Ngoc E", " Nghe An", 2004, 8, 9.5,
                9, 0, 0);
        System.out.printf("%5s %20s %13s %15s %15s %15s %15s %15s \n", "Ten", " diaChi", "Tuoi", " diemTx1",
                " diemTx2", " diemKetThucHp", " diemGpa", " soTietNghi");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.printf("%10s %15s %10d %15.2f %15.2f %10.2f %20.2f %15d \n", student.getTen(), student.getDiaChi(),
                    student.getnamSinh()
                    , student.getdiemTx1(), student.getdiemTx2(), student.getdiemKetThucHp(), student.getdiemGpa()
                    , student.getSoTietNghi());
        }

        for (Student hs : students) {
            hs.xuat();
        }

        System.out.println("----------MENU----------");
        System.out.println("1. Thêm sinh viên mới.");
        System.out.println("2. Sửa thông tin sinh viên.");
        System.out.println("3. Sắp xếp theo tuổi.");
        System.out.println("4. Sắp xếp theo GPA.");
        System.out.println("5. Sắp xếp theo số tiết nghỉ.");
        System.out.println("6. Xóa sinh viên.");
        System.out.print("Nhập lựa chọn: ");

        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.print("Số sinh viên cần thêm: ");
                int add = sc.nextInt();
                int size = n + add;

                Student[] st1 = new Student[size];
                for (int i = 0; i < n; i++) {
                    st1[i] = students[i];
                }
                for (int i = n; i < size; i++) {
                    st1[i] = new Student();
                    st1[i].nhap();
                }
                for (Student hs : st1) {
                    hs.xuat();
                }
                break;
            case 2:
                System.out.print("nhập thứ tự sinh viên muôn sửa: ");
                int stt = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (i == stt) {
                        students[i].nhap();
                    }
                }
                for (Student hs : students) {
                    hs.xuat();
                }
                break;
            case 3:
                Student tem = new Student();
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (students[i].getnamSinh() > students[j].getnamSinh()) {
                            tem = students[i];
                            students[i] = students[j];
                            students[j] = tem;
                        }
                    }
                }
                for (Student hs : students) {
                    hs.xuat();
                }
                break;
            case 4:
                Student temp = new Student();
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (students[i].getdiemGpa() > students[j].getdiemGpa()) {
                            temp = students[i];
                            students[i] = students[j];
                            students[j] = temp;
                        }
                    }
                }
                for (Student hs : students) {
                    hs.xuat();
                }
                break;
            case 5:
                Student tempp = new Student();
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (students[i].getSoTietNghi() > students[j].getSoTietNghi()) {
                            tempp = students[i];
                            students[i] = students[j];
                            students[j] = tempp;
                        }
                    }
                }
                for (Student hs : students) {
                    hs.xuat();
                }
                break;
            case 6:
                System.out.print("Số thứ tự sinh viên muốn xóa: ");
                int delete = sc.nextInt();
                Student[] st2 = new Student[n];
                for (int i = 0; i < delete; i++) {
                    st2[i] = students[i];
                }
                for (int i = delete; i < n - 1; i++) {
                    st2[i] = students[i + 1];
                }
                n--;
                for (Student hs : st2) {
                    hs.xuat();
                }
                break;
        }

        sc.close();
    }
}
