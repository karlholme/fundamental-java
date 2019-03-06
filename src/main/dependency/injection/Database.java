package dependency.injection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private Connection connection;

    public Database(Connection connection) {
        this.connection = connection;
    }

    public List<String> getAccounts(String customerId) {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ACCOUNTS WHERE customerId = " + customerId;
            ResultSet resultSet = statement.executeQuery(query);

            List<String> results = new ArrayList<>();

            while (resultSet.next()) {
                results.add(resultSet.getString("accountNumber"));
            }

            return results;

        } catch (SQLException e) {
            throw new RuntimeException("Database failed");
        }
    }
}
