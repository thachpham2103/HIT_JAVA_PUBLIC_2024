package ktrabai2;

import java.util.Scanner;

public class Person {
    private String id;
    private String fullName;
    private int age;
    private Address address;
    private String birthday;

    public Person() {
        address = new Address();
    }

    public Person(String id, String fullName, int age, Address address, String birthday) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào id:");
        id = sc.nextLine();
        System.out.println(" nhap vao fullNmae:");
        fullName = sc.nextLine();
        System.out.println(" nhap vao age:");
        age = sc.nextInt();
        System.out.println(" nhap vao birthday:");
        birthday = sc.nextLine();
        address.nhap();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

