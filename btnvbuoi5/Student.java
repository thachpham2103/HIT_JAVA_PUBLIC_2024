package btnvbuoi5;

import java.util.Scanner;

public class Student extends Person {
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;

    public Student() {
        super();
    }

    public Student(int id, String nameClass, float gpa) {
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Student(String name, int age, Address x, int id, String nameClass, float gpa) {
        super(name, age, x);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập id:");
        id = sc.nextInt();
        System.out.println(" nhập vào nameClass:");
        nameClass = sc.nextLine();
        System.out.println(" nhập vào gpa:");
        gpa = sc.nextFloat();
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.println("id:" + id + " nameClass:" + nameClass + " gpa:" + gpa);
        super.xuat();
    }

    boolean checkFall() {
        if (gpa < criteria) {
            return true;
        }
        return false;
    }
}
