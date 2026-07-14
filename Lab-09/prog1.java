import java.sql.*;

public class prog1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college_db"; // Replace with your database URL
        String user = "Manas"; // Replace with your database username
        String password = "manas12345"; // Replace with your database password
        String tableName = "student";
        
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            
            // Create Statement
            Statement stmt = conn.createStatement();
            
            // Execute Query
            String query = "SELECT * FROM " + tableName;
            ResultSet rs = stmt.executeQuery(query);
            
            // Get Metadata for column names
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // Display Column Names
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println("\n--------------------------------------------------");
            
            // Display Records
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
            
            // Close Connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
