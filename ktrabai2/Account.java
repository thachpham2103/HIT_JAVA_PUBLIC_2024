package ktrabai2;

import javax.management.relation.Role;
import java.util.Scanner;

public class Account extends Person {
    private String userName;
    private String passWord;
    private Status status;
    private Role role;

    public Account() {
        super();
    }

    public Account(String userName, String passWord, Status status, Role role) {
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
        this.role = role;
    }

    public Account(String id, String fullName, int age, Address address, String birthday, String userName, String passWord, Status status, Role role) {
        super(id, fullName, age, address, birthday);
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
        this.role = role;
    }

    public Account(String id, String fullName, int age, Address thanhHoa,
                   String birthday, String userName, String passWord, Status status, ktrabai2.Role role) {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao userName:");
        userName = sc.nextLine();
        System.out.println(" nhap vao passWord:");
        passWord = sc.nextLine();
        super.nhap();
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", status=" + status +
                ", role=" + role +
                '}';
    }
}
