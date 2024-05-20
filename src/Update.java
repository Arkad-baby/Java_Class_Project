import java.sql.Connection;

import java.sql.Statement;

public class Update {
        public static void main(String[] args) {
        String query="UPDATE students('fname','lname','address','phone') VALUES('')";
        try {
            Connection con=ConDri.getConnection();
            Statement statement=con.createStatement();
            int rowsAff=statement.executeUpdate(query);
          
            con.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }   
}
