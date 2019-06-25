package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexao {
    public static Connection Conecta() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String usuario = "root";
            String senha = "user";
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Sucesso na conexao!");
            JOptionPane.showMessageDialog(null,"Sucesso na Conexão!");
            return con;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro na conexao!");
            JOptionPane.showMessageDialog(null,"Erro na Conexão!");
            return null;
        }
    } 
}