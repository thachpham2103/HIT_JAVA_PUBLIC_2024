package ktrabai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthServiceImpl a = new AuthServiceImpl();
        AccountServiceImpl b=new AccountServiceImpl();
        Account c = new Account(" K01", " LeVanA", 19, new Address(" TrieuSon", "ThanhHoa"),
                " 21/09/2005", " sonLV", " 01928", Status.ACTIVE, Role.USER);
        Account d = new Account(" K02", " TranDucNgoc", 20, new Address(" PhuLy", "HaNam"), " 24/03/2005",
                "NgocTD", " 09877", Status.BAN, Role.ADMIN);
        int n=sc.nextInt();
        System.out.println("chon quan li cua: ");
        System.out.println(" 1.User");
        System.out.println(" 2.Admin");
        if (n==1) {
            while (true) {
                System.out.println("----------he thong nguoi dung----------");
                System.out.println(" 1.doi mk");
                System.out.println(" 2.xem thong tin");
                System.out.println(" 3. dang xuat");
                System.out.println(" moi chon:");
                int choise = sc.nextInt();
                switch (choise) {
                    case 1:
                        a.login(sc);
                        break;

                    case 2:
                        a.toString();
                        break;

                    case 3:
                        a.logout();
                        break;
                    default:
                        System.out.println(" khong co lua chon thoa man!");
                }
            }

        }
        if (n==2){
            while (true){
                System.out.println("---------he thong admin-------------");
                System.out.println("1.xem DS");
                System.out.println("2.tao tai khoan moi");
                System.out.println(" 3.tim kiem tai khoan");
                System.out.println(" 4.xoa tai khoan");
                System.out.println(" 5.dang xuat");
                System.out.println(" moi chon");
                int e=sc.nextInt();
                switch (e){
                    case 1:
                        b.getAllAccount();
                        break;
                    case 2:
                      //  b.createNewAccount();
                }
            }
        }
    }
}
