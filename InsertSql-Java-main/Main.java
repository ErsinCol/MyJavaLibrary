import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
       Connection connection=null;
       DBHelper dbHelper=new DBHelper();
       PreparedStatement preparedStatement=null;
       try{
          connection= dbHelper.getConnection();
          System.out.println("Bağlantı sağlandı...");
          String sql="INSERT INTO city (Name,CountryCode,District,Population) values (?,?,?,?);";
          preparedStatement=connection.prepareStatement(sql);
          preparedStatement.setString(1,"Sakarya");
          preparedStatement.setString(2,"TUR");
          preparedStatement.setString(3,"Turkey");
          preparedStatement.setInt(4,70000);
          preparedStatement.executeUpdate();
          System.out.println("Kayıt eklendi...");
       }catch (SQLException e){
           dbHelper.showErrorMessage(e);
       }finally {
           preparedStatement.close();
           connection.close();
       }
    }
}