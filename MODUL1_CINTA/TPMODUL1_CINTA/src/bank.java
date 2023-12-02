import java.util.ArrayList;
import java.util.List;

public class bank {
    private List<account> accountList;

    public bank() {
        accountList = new ArrayList<>();
    }

    public void addAccount(account account) {
        accountList.add(account);
    }

    public void removeAccount(account account) {
        accountList.remove(account);
    }

    public account getAccount(String accountNumber) {
        for (account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<account> getAllAccounts() {
        return accountList;
    }
}