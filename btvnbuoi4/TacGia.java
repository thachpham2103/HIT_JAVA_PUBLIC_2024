package btvnbuoi4;

import java.util.Scanner;

public class TacGia {
    protected String name;
    protected int age;
    protected String queQuan;

    public TacGia(){

    }

    public TacGia(String name, int age, String queQuan) {
        this.name = name;
        this.age = age;
        this.queQuan = queQuan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;

    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào name:");
        name=sc.nextLine();
        System.out.println(" nhập vào age:");
        age=sc.nextInt();
        System.out.println(" nhập vào quaQuan:");
        queQuan=sc.nextLine();
    }

    @Override
    public String toString() {
        return "TacGia{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
