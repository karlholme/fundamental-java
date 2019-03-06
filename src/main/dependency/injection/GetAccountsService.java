package dependency.injection;

import java.util.List;

public class GetAccountsService {

    private Database database;

    public GetAccountsService(Database database) {
        this.database = database;
    }

    public List<String> getAccounts(String customerId) {
        if (!customerId.matches("\\d{12}")) {
            throw new RuntimeException(customerId + " is not a legit customer id");
        }

        return this.database.getAccounts(customerId);
    }
}
