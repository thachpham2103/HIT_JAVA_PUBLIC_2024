package ktrabai2;

import java.util.*;

public interface AccountService {
    List<Account> getAllAccount();

    void createNewAccount(Account account);

    Account getAccountByUsername(String username);

    void deleteAccount(String username);

    void changeStatus(String username, Status status);

}
