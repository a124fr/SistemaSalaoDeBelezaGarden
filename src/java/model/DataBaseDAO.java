package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseDAO {
    protected Connection conn;
    
    public void conectar() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String user = "teste";
        String pass = "123";
        String url = "jdbc:mysql://localhost:3306/salaodebelezagarden?useSSL=false";
        conn = DriverManager.getConnection(url, user, pass);
    }
    
    public void desconectar() throws Exception {
        if(!conn.isClosed()) {
            conn.close();
        }
    }
}
