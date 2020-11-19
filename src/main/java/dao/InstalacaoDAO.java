package dao;

import conexao.ConexaoBd;
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

public class InstalacaoDAO {
    //Metodo para inserir dados na tabela Cliente
    public void create(Instalacao i) {
        
        Connection con = ConexaoBd.getConnection();
    
        PreparedStatement stmt = null;
        //Inserindo dados na tabela atraves do metodo INSERT
        try {
            stmt = con.prepareStatement("INSERT INTO int_instalacao (int_numero_instalacao,cli_documento,for_cnpj,cep_cep,end_numero) VALUES(?,?,?,?,?)");
            stmt.setObject(1, i.getInt_numero_instalacao());
            stmt.setObject(2, i.getCli_documento());
            stmt.setObject(3, i.getFor_cnpj());
            stmt.setObject(4, i.getEnd_cep());
            stmt.setObject(5, i.getEnd_numero());
            stmt.executeUpdate();

        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }
    }
    
        public static List<Instalacao> read() {

        Connection con = ConexaoBd.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Instalacao> instalacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM int_instalacao");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Instalacao instalacao = new Instalacao();

                instalacao.setInt_numero_instalacao(BigInteger.valueOf(rs.getLong("int_numero_instalacao")));
                instalacao.setCli_documento(BigInteger.valueOf(rs.getLong("cli_documento")));
                instalacao.setFor_cnpj(BigInteger.valueOf(rs.getLong("for_cnpj")));
                instalacao.setEnd_cep(BigInteger.valueOf(rs.getLong("end_cep")));
                instalacao.setEnd_numero(BigInteger.valueOf(rs.getLong("end_numero")));

                instalacoes.add(instalacao);
            }

        } catch (SQLException ex) {
            Logger.getLogger(InstalacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBd.closeConnection(con, stmt, rs);
        }
        return instalacoes;

    }
}