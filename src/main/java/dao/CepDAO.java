package dao;

import conexao.ConexaoBd;
import classes.Cep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CepDAO {
     //Metodo para inserir dados na tabela Cliente
    public void create(Cep c) {
        
        Connection con = ConexaoBd.getConnection();
    
        PreparedStatement stmt = null;
        //Inserindo dados na tabela atraves do metodo INSERT
        try {
            stmt = con.prepareStatement("INSERT INTO cep_cep (cep_cep,cep_rua,cep_estado,cep_cidade) VALUES(?,?,?,?)");
            stmt.setObject(1, c.getCep_cep());
            stmt.setString(2, c.getCep_rua());;
            stmt.setString(3, c.getCep_estado());
            stmt.setString(4, c.getCep_cidade());

            stmt.executeUpdate();

        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }
    
    }
}