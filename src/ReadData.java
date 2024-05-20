import java.sql.*;

public class ReadData {
    public static void main(String[] args) {
        String query="SELECT * FROM students";
        try {
            Connection con=ConDri.getConnection();
            Statement statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);

                String fname=resultSet.getString(2);
                String lname=resultSet.getString(3);
                String address=resultSet.getString(4);
                String phone=resultSet.getString(5);
                System.out.println(id+fname+lname+address+phone);
                
            }
            con.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }   
}
