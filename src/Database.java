import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static void main(String[] args){
        try{
//            Class.forName("com.mysql .jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Gogopal@123");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from book");

            while(resultSet.next()){
                System.out.println(resultSet.getString("Book_Name"));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//
//public class Database{
//
//    public static void main(String args[]) {
//        String dbURL = "jdbc:mysql://localhost:3306/library";
//        String username ="root";
//        String password = "Gogopal@123";
//
//        Connection dbCon = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//
//        String query ="select count(*) from book";
//
//        try {
//            //getting database connection to MySQL server
//            dbCon = DriverManager.getConnection(dbURL, username, password);
//
//            //getting PreparedStatment to execute query
//            stmt = dbCon.prepareStatement(query);
//
//            //Resultset returned by query
//            rs = stmt.executeQuery(query);
//
//            while(rs.next()){
//                int count = rs.getInt(1);
//                System.out.println("count of stock : " + count);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
