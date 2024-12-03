package ktrabai2;

import java.util.*;

public class AccountServiceImpl implements AccountService {

    private ArrayList<Account> li = new ArrayList<>();

    @Override
    public void deleteAccount(String username) {
        for (int i = 0; i < li.size(); i++) {
            li.remove(i);
            System.out.println("xoa thanh cong ! ");
            return;
        }
        System.out.println(" that bai ");
        return;
    }

    @Override
    public void changeStatus(String username, Status status) {
        for (Account a : li) {
            if (a.getUserName().equals(username) && a.getStatus().equals(status)) {
                a.setUserName(username);
                System.out.println(" cap nhat thanh cong");
                return;
            }
        }
        System.out.println(" that bai!");
        return;
    }

    @Override
    public Account getAccountByUsername(String username) {
        for (Account account : li) {
            if (account.getUserName().equals(username)) {
                return account;
            }
        }
        return null;
    }

    private boolean isDuplicateID(String id) {
        for (Account account : li) {
            if (account.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Account> getAllAccount() {
        return List.of();
    }

    @Override
    public void createNewAccount(Account account) {
        Scanner sc = new Scanner(System.in);
        account = new Account();
        String newID;
        while (true) {
            try {
                System.out.println("Enter id: ");
                newID = sc.nextLine();
                if (isDuplicateID(newID)) {
                    throw new IllegalArgumentException("ID is duplicate!!!");
                } else {
                    account.setId(newID);
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error has occurred.");
            }
        }
        account.setId(newID);
        System.out.println("Enter name: ");
        account.setFullName(sc.nextLine());

        System.out.println("Enter age: ");
        int newAge = 0;
        try {
            newAge = sc.nextInt();
        } catch (IllegalArgumentException e) {
            System.out.println("Age is invalid!!!");
        }
        account.setAge(newAge);

        System.out.println("Enter address: ");
        account.setAddress(new Address(sc.nextLine(), sc.nextLine()));

        System.out.println("Enter birthday: ");
        account.setBirthday(sc.nextLine());

        System.out.println("Enter username: ");
        account.setUserName(sc.nextLine());

        System.out.println("Enter password: ");
        account.setPassWord(sc.nextLine());

        try {
            System.out.println("Enter role(ADMIN or USER): ");
            //account.setRole(Role.valueOf(sc.nextLine().toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role!!!");
            return;
        }
    }

}
