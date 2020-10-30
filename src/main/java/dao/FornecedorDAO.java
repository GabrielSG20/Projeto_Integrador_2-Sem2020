package dao;

import conexao.ConexaoBd;
import classes.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FornecedorDAO {
    //Metodo para inserir dados na tabela Cliente
    public void create(Fornecedor f) {
        
        Connection con = ConexaoBd.getConnection();
    
        PreparedStatement stmt = null;
        //Inserindo dados na tabela atraves do metodo INSERT
        try {
            stmt = con.prepareStatement("INSERT INTO for_fornecedor (for_cnpj,for_nome,for_tipo) VALUES(?,?,?)");
            stmt.setObject(1, f.getFor_cnpj());
            stmt.setString(2, f.getFor_nome());
            stmt.setString(3, f.getFor_tipo());
            stmt.executeUpdate();

        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }

    }
}