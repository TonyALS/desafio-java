package exercise5.util;

import exercise5.models.Account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAccounts {
    public static Map<Long, Account> mapAccounts(List<Account> accountsList) {
        Map<Long, Account> mapAccounts = new HashMap<>();
        accountsList.forEach(account -> mapAccounts.put(account.getNumber(), account));
        return mapAccounts;
    }
}
