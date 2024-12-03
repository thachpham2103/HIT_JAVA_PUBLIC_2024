package btnvbuoi5;

import java.util.ArrayList;
import java.util.*;
import java.util.Stack;

public class ClassRoom {
    static ArrayList<Student> li = new ArrayList<>();

    public static void sortByGPA() {
        for (int i = 0; i < li.size() - 1; i++) {
            for (int j = 0; j < li.size() - i - 1; j++) {
                if (li.get(j).getGpa() > li.get(j + 1).getGpa()) {
                    Student tmp = li.get(j);
                    li.set(j, li.get(j + 1));
                    li.set(j + 1, tmp);
                }
            }
        }
    }

    public static void inputList() {
        while (true) {
            Student a = new Student();
            a.nhap();
            li.add(a);
            if (a.getId() == 555) {
                System.out.println(" dừng nhập!");
                break;
            }
        }
    }

    public static void outputList() {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-10s\n", "name", " age", " commune", " dictrict",
                " city", "Id", "Classroom", "Gpa");
        for (Student a : li) {
            a.xuat();
        }
    }

    public static boolean removeByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào ID:");
        int id = sc.nextInt();
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i).getId() == id) {
                li.remove(i);
                System.out.println(" xóa thành công ");
                return true;
            }
        }
        return false;
    }

    public static void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" 1.sắp xếp sinh viên theo điểm GPA");
            System.out.println(" 2.nhập id đến 555 thì dừng ");
            System.out.println(" 3.in danh sách theo dạng bảng");
            System.out.println(" 4.xóa sinh viên có mã id bạn nhâp");
            System.out.println(" 5.thoát chương trình");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    ClassRoom.sortByGPA();
                    break;
                case 2:
                    ClassRoom.inputList();
                    break;
                case 3:
                    ClassRoom.outputList();
                    break;
                case 4:
                    ClassRoom.removeByID();
                    break;
                case 5:
                    System.out.println(" thoát chương trình");
                    break;
            }
        }
    }

    public static void inPutDaTa() {
        li.add(new Student("PhamTheAnh ", 19, new Address(" Tho Son", " Trieu Son", " ThanhHoa")
                , 112, " KTPM03", 3));
        li.add(new Student("TranThiNhung ", 18, new Address(" Xuan Tho", " Ha Trung", " NamDinh")
                , 113, " KTPM02", 3.2f));
        li.add(new Student("NguyenGiaKhanh ", 20, new Address(" Tho Dan", " Tho Xuan", " HaNam")
                , 114, " KTPM03", 3.6f));
        li.add(new Student("LeAnhHuy", 21, new Address(" Tho The", " Yen Dinh", " NgheAn")
                , 115, " KTPM01", 2.9f));
        li.add(new Student("LeThiNhung ", 19, new Address(" Xuan Thinh", " Hoang Hoa", " ThaiBinh")
                , 116, " KTPM04", 3.4f));
    }

    public static void main(String[] args) {
        ClassRoom b = new ClassRoom();
        b.menu();
        ClassRoom.inPutDaTa();
    }
}
