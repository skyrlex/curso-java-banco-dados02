
package br.com.proway.estacionamento.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   
    private final String HOST = "jdbc:mysql://localhost/exemplo_01";
    private final String USER = "root";
    private final String PASSWORD = "";
            
            
    public Connection conectar() throws SQLException{
        Connection conexao = DriverManager.getConnection(HOST, USER, PASSWORD);
        return conexao;
    }
    
    
}
