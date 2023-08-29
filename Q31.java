import java.sql.*;

public class Q31 {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            String insertQuery = "INSERT INTO students (name, roll_number) VALUES ('John Doe', 12345)";
            statement.executeUpdate(insertQuery);
            System.out.println("Record inserted successfully.");

            String selectQuery = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                int rollNumber = resultSet.getInt("roll_number");
                String name = resultSet.getString("name");
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
            }

            String updateQuery = "UPDATE students SET name = 'Jane Smith' WHERE roll_number = 12345";
            statement.executeUpdate(updateQuery);
            System.out.println("Record updated successfully.");

            String deleteQuery = "DELETE FROM students WHERE roll_number = 12345";
            statement.executeUpdate(deleteQuery);
            System.out.println("Record deleted successfully.");

            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
