package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

    public SelectApp() {}
    
    public Connection connect() {
        
        
        String URL = "jdbc:sqlite:Kata5.db";
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL);
            System.out.println("Connexióna SQLiteestablecida");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    public void SelectAll(){
        String sql= "SELECT * FROM PEOPLE";
        try (Connection con = this.connect();
            Statement stmt= con.createStatement();
            ResultSet rs= stmt.executeQuery(sql)){
            
            while(rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                                   rs.getString("Nombre") + "\t" +
                                   rs.getString("Apellidos") + "\t" +
                                   rs.getString("Departamento") + "\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
