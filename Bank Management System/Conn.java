import java.sql.*;

public class Conn {
        Connection c;
        Statement s;

        public Conn() {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver"); // Register the driver

                        // create connection
                        c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "aryan007@mysql");

                        s = c.createStatement(); // create statement
                } catch (Exception e) {
                }
        }

        // execute query
        // close connection
}
