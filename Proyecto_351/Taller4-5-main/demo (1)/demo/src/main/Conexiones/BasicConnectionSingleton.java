public class BasicConnectionSingleton {
    

    private static String url ="jdbc:mysql://localhost:3306/my_app";
 private static String user = "root";
 private static String pass =
"d0Tio0jCk1365";
 private static Connection conn;
 public static Connection getInstance()
throws SQLException {
 if (conn == null) {
 conn =
DriverManager.getConnection(url, user,
pass);
 }
 return conn;
 }
} // BasicConnectionSingleton 

