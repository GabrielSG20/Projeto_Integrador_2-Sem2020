package dao;

import conexao.ConexaoBd;
import classes.Conta;
import classes.Instalacao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaDAO {
    //Metodo para inserir dados na tabela Cliente
    public void create(Conta cta) {
        
        Connection con = ConexaoBd.getConnection();
    
        PreparedStatement stmt = null;
        //Inserindo dados na tabela atraves do metodo INSERT
        try {
            stmt = con.prepareStatement("INSERT INTO cta_conta (int_numero_instalacao, cta_mes_referencia, cta_vencimento) VALUES(?,?,?)");
            stmt.setObject(1, cta.getInt_numero_instalacao());
            stmt.setString(2, cta.getCta_mes_referencia());
            stmt.setString(3, cta.getCta_vencimento());
            stmt.executeUpdate();

        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }

    }

    public static boolean buscarInstalacao(BigInteger i) {
        
        Connection con = ConexaoBd.getConnection();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean check = false;
        //Inserindo dados na tabela atraves do metodo INSERT
        try {
            stmt = con.prepareStatement("SELECT * FROM int_instalacao where int_numero_instalacao = ?");
            stmt.setObject(1, i);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;

            }
        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }

        return check;
    }
}