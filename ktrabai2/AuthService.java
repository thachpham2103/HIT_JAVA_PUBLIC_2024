package ktrabai2;

import java.util.*;

public interface AuthService {
    public void login(Scanner scanner);

    public void logout();

    public void changePassword(String username, String oldPassword, String newPassword);

}
