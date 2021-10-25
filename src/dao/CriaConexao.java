
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CriaConexao {
    
    public static Connection getConexao() throws SQLException{
    
        try {
          Class.forName("org.postgresql.Driver");
         // JOptionPane.showMessageDialog(null,"Conectando ao Banco");
          return DriverManager.getConnection("jdbc:postgresql:agendabd","postgres","i8my-4vr");
        
        
        }catch (ClassNotFoundException e){
          throw new SQLException(e.getMessage());
        
        }
        finally{
         // JOptionPane.showMessageDialog(null,"Banco Conectado"); 
        
        }
        
    }
   }
