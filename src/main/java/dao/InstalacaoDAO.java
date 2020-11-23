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
            stmt.setObject(4, i.getCep_cep());
            stmt.setObject(5, i.getEnd_numero());
            stmt.executeUpdate();

        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }
    }
    
        public static List<Instalacao> readinstalacao() {

        Connection con = ConexaoBd.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Instalacao> instalacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT int_numero_instalacao,cli_nome,cli_cliente.cli_documento,for_nome,for_fornecedor.for_cnpj,int_instalacao.cep_cep,cep_cep.cep_rua,int_instalacao.end_numero FROM cli_cliente,int_instalacao,for_fornecedor,end_endereco,cep_cep WHERE cli_cliente.cli_documento = int_instalacao.cli_documento and for_fornecedor.for_cnpj = int_instalacao.for_cnpj and int_instalacao.cep_cep = end_endereco.cep_cep and int_instalacao.end_numero = end_endereco.end_numero and end_endereco.cep_cep = cep_cep.cep_cep");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Instalacao instalacao = new Instalacao();


            }

        } catch (SQLException ex) {
            Logger.getLogger(InstalacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBd.closeConnection(con, stmt, rs);
        }
        return instalacoes;

    }
}