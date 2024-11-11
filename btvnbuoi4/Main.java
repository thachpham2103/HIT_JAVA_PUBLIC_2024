package btvnbuoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Book[] a = new Book[5];
        a[0] = new Book(123, " Tiếng Anh", " Phạm Đức Hiếu", 2023, 12, " B");
        a[1] = new Book(124, " Toán", " Phạm Văn Quang", 2022, 11, " A");
        a[2] = new Book(125, " Tiếng Nhật", "Lê Thị Thơm", 2021, 4, " D");
        a[3] = new Book(126, " Tiếng Trung", " Trần Văn Huy", 2020, 7, " F");
        a[4] = new Book(127, " Tiếng Hàn", " Ngyễn Văn Phúc", 2022, 18, " C");

        for (Book book : a) {
            book.xuat();
        }

        System.out.println("----------MENU----------");
        System.out.println("1. Thêm sách mới.");
        System.out.println("2. Sửa thông tin sách.");
        System.out.println("3.cuốn sách lâu đời nhất .");
        System.out.println("4. In ra cuốn sách phù hợp người mua nhập.");
        System.out.println("5. Sắp xếp sách theo tiền.");
        System.out.print("Nhập lựa chọn: ");

        int choose = sc.nextInt();

        switch (choose) {
            //thêm sách mới
            case 1:
                System.out.print("Số sách cần thêm: ");
                int add = sc.nextInt();
                int size = n + add;

                Book[] st1 = new Book[size];
                for (int i = 0; i < n; i++) {
                    st1[i] = a[i];
                }
                for (int i = n; i < size; i++) {
                    st1[i] = new Book();
                    st1[i].nhap();
                }
                for (Book book : st1) {
                    book.xuat();
                }
                break;

            //sửa thông tin sách
            case 2:
                System.out.print("nhập thứ tự sách muốn sửa: ");
                int stt = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (i == stt) {
                        a[i].nhap();
                    }
                }
                for (Book book : a) {
                    book.xuat();
                }
                break;

            //cuốn sách lâu đời nhất .
          /*  case 3:
                Book sachLauDoiNhat = a.getNamSanXuat(0);
                for (Book sach : a) {
                    if (sach.getNamSanXuat() < sachLauDoiNhat.getNamSanXuat()) {
                        sachLauDoiNhat = sach;
                    }
                }
                System.out.println("Cuốn sách lâu đời nhất:");
                sachLauDoiNhat.xuat();
                break;*/

            //in ra sách mà người mua nhập tiền
            case 4:
                System.out.print("Nhập giá tiền mong muốn: ");
                double giaTienMuon = sc.nextDouble();
                boolean sach1 = false;
                for (Book book : a) {
                    if (book.getGiaTien() <= giaTienMuon) {
                        System.out.println("Cuốn sách phù hợp:");
                        book.xuat();
                        sach1 = true;
                        break;
                    }
                }
                if (!sach1) {
                    System.out.println("Không tìm thấy sách phù hợp.");
                }
                break;

            //sắp xếp theo tiền tăng dần
            case 5:
                //int n = a.size();
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (a[j].getGiaTien() > a[j + 1].getGiaTien()) {
                            Book temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }
                // In danh sách sách sau khi sắp xếp
                for (Book book : a) {
                    book.xuat();
                }
        }
    }
}



