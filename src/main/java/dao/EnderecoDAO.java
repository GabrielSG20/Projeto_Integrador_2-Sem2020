package dao;

import conexao.ConexaoBd;
import classes.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoDAO {
    //Metodo para inserir dados na tabela Cliente
    public void create(Endereco e) {
        
        Connection con = ConexaoBd.getConnection();
    
        PreparedStatement stmt = null;
        //Inserindo dados na tabela atraves do metodo INSERT
        try {
            stmt = con.prepareStatement("INSERT INTO end_endereco (end_cep,end_numero,end_rua,end_estado,end_cidade,end_complemento) VALUES(?,?,?,?,?,?)");
            stmt.setObject(1, e.getEnd_cep());
            stmt.setObject(2, e.getEnd_numero());
            stmt.setString(3, e.getEnd_rua());
            stmt.setObject(4, e.getEnd_estado());
            stmt.setString(5, e.getEnd_cidade());
            stmt.setString(6, e.getEnd_complemento());
            stmt.executeUpdate();

        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }

    }
    
}