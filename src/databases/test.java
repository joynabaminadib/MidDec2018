package databases;

import java.io.IOException;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        ConnectToSqlDB.connectToSqlDatabase();
    }
}
