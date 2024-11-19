package btnvbuoi5;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected Address x;

    public Person(){
        x=new Address();
    }

    public Person(String name, int age, Address x) {
        this.name = name;
        this.age = age;
        this.x = x;
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

    public Address getX() {
        return x;
    }

    public void setX(Address x) {
        this.x = x;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào name:");
        name=sc.nextLine();
        System.out.println(" nhập vào age:");
        age=sc.nextInt();
        x.nhap();
    }

    public void xuat(){
        System.out.println(" name:"+name+" age:"+age);
        x.xuat();
    }
}
