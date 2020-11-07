package dao;

import conexao.ConexaoBd;
import classes.Energia;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnergiaDAO {
    // Metodo para inserir dados na tabela Cliente
    public void create(Energia n) {
        
        Connection con = ConexaoBd.getConnection();
    
        PreparedStatement stmt = null;
        //Inserindo dados na tabela atraves do metodo INSERT
        try {
            stmt = con.prepareStatement("INSERT INTO ene_energia (int_numero_instalacao,cta_mes_referencia," +
            "ene_consumo_conta_mes,ene_codigo_fiscal,ene_grupo_subgrupo,ene_tipo_fornecimento,ene_classe_subclasse,ene_roteiro_leitura," +
            "ene_modalidade_tarifaria,ene_tensao_nominal,ene_numero_medidor,ene_const_multi,ene_leitura_anterior_cod,ene_leitura_atual_cod," +
            "ene_data_leitura_anterior,ene_data_leitura_atual,ene_tipo_bandeira,ene_valor_total) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setObject(1, n.getInt_numero_instalacao());
            stmt.setObject(2, n.getCta_mes_referencia());
            stmt.setObject(3, n.getEne_consumo_conta_mes());
            stmt.setObject(4, n.getEne_codigo_fiscal());
            stmt.setString(5, n.getEne_grupo_subgrupo());
            stmt.setString(6, n.getEne_tipo_fornecimento());
            stmt.setString(7, n.getEne_classe_subclasse());
            stmt.setString(8, n.getEne_roteiro_leitura());
            stmt.setString(9, n.getEne_modalidade_tarifaria());
            stmt.setString(10, n.getEne_tensao_nominal());
            stmt.setObject(11, n.getEne_numero_medidor());
            stmt.setObject(12, n.getEne_const_multi());
            stmt.setObject(13, n.getEne_leitura_anterior_cod());
            stmt.setObject(14, n.getEne_leitura_atual_cod());
            stmt.setString(15, n.getEne_data_leitura_anterior());
            stmt.setString(16, n.getEne_data_leitura_atual());
            stmt.setString(17, n.getEne_tipo_bandeira());
            stmt.setObject(18, n.getEne_valor_total());
            stmt.executeUpdate();

        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }
    }

    public static List<Energia> read() {

        Connection con = ConexaoBd.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Energia> contas_energia = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT int_numero_instalacao,cta_mes_referencia,ene_consumo_conta_mes,ene_numero_medidor,ene_codigo_fiscal,ene_tipo_bandeira,ene_tensao_nominal,ene_valor_total FROM ene_energia");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Energia energia = new Energia();

                energia.setInt_numero_instalacao(BigInteger.valueOf(rs.getLong("int_numero_instalacao")));
                energia.setCta_mes_referencia(rs.getString("cta_mes_referencia"));
                energia.setEne_consumo_conta_mes(BigInteger.valueOf(rs.getLong("ene_consumo_conta_mes")));
                energia.setEne_numero_medidor(BigInteger.valueOf(rs.getLong("ene_numero_medidor")));
                energia.setEne_codigo_fiscal(BigInteger.valueOf(rs.getLong("ene_codigo_fiscal")));
                energia.setEne_tipo_bandeira(rs.getString("ene_tipo_bandeira"));
                energia.setEne_tensao_nominal(rs.getString("ene_tensao_nominal"));    
                energia.setEne_tipo_bandeira(rs.getString("ene_tipo_bandeira"));
                energia.setEne_valor_total(BigDecimal.valueOf(rs.getDouble("ene_valor_total")));

                contas_energia.add(energia);
            }

        } catch (SQLException ex) {
            Logger.getLogger(InstalacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBd.closeConnection(con, stmt, rs);
        }
    
        return contas_energia;

    }
}