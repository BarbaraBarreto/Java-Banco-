package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Contato;

public class Banco {
    
    private Connection conexao;
    
    public Banco() throws Exception{
      this.conexao = CriaConexao.getConexao();
   }
    
   
    public void adicionaContato(Contato ctt) throws SQLException{
      
        String sql = "insert into contato (nome, sobrenome, senha, confirmar)"+
                    "values (?,?,?,?)";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,ctt.getNome());
        stmt.setString(2,ctt.getSobrenome());
        stmt.setString(3,ctt.getSenha());
        stmt.setString(4,ctt.getConfirmar());
        
        stmt.execute();
        stmt.close();
    }       
    
    
    
    }
    

