package kata.pkg5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

    public SelectApp() {}
    
    public Connection connect() {
        
        
        Connection con = null;
        try {
            // parámetros de la BD
            String URL = "jdbc:sqlite:C:\\Users\\LionBlue98\\Documents\\NetBeansProjects\\DB_SQLite\\Practica5.db";
            // creamos una conexión a la BD
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
            // Bucle sobre el conjunto de registros.
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
