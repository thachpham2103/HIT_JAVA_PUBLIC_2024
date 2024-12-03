package ktrabai2;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {

    private ArrayList<Account> accountsList = new ArrayList<>();
    private Account currentAccount;

    public AuthServiceImpl() {
        accountsList.add(new Account(" K01", " LeVanA", 19, new Address(" TrieuSon", "ThanhHoa"),
                " 21/09/2005", " sonLV", " 01928", Status.ACTIVE, Role.USER));
        accountsList.add(new Account(" K02"," TranDucNgoc",20,new Address(" PhuLy","HaNam")," 24/03/2005",
                "NgocTD"," 09877",Status.BAN,Role.ADMIN));
        currentAccount = null;
    }

    @Override
    public void login(Scanner scanner) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao passWord:");
        String passWord = sc.nextLine();
        System.out.println(" nhap vao userName:");
        String userName = sc.nextLine();
        for (Account account : accountsList) {
            if (account.getPassWord().equals(passWord) && account.getUserName().equals(userName)) {
                currentAccount = account;
                System.out.println(" dang nhap thanh cong!");
                return;
            }
        }
        System.out.println(" moi nhap lai !");
    }

    @Override
    public void logout() {
        if (accountsList != null) {
            System.out.println(" thanh cong!");
            accountsList = null;
        } else {
            System.out.println(" that bai");
        }
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        for (Account account : accountsList) {
            if (account.getPassWord().equals(oldPassword) && account.getUserName().equals(username)) {
                account.setPassWord(newPassword);
                System.out.println(" doi thanh cong");
                return;
            }
        }
        System.out.println(" doi that bai!");
        return;

    }
}
