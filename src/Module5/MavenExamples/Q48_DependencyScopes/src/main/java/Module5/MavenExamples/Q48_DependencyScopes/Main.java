package Module5.MavenExamples.Q48_DependencyScopes;

import org.apache.commons.lang3.StringUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // COMPILE scope: use Commons Lang directly
        String message = StringUtils.capitalize("maven dependency scopes");
        System.out.println("Compile scope: " + message);

        // RUNTIME scope: use the H2 database driver
        try (Connection connection =
                     DriverManager.getConnection("jdbc:h2:mem:testdb");
             Statement statement = connection.createStatement()) {

            statement.execute(
                "CREATE TABLE students (id INT, name VARCHAR(50))"
            );

            statement.execute(
                "INSERT INTO students VALUES (1, 'Alex')"
            );

            ResultSet result = statement.executeQuery(
                "SELECT name FROM students"
            );

            while (result.next()) {
                System.out.println(
                    "Runtime scope: Student = " + result.getString("name")
                );
            }

            result.close();

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        System.out.println("Dependency scopes demonstration completed.");
    }
}
