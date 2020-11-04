package dao;

import conexao.ConexaoBd;
import classes.Agua;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AguaDAO {
    //Metodo para inserir dados na tabela Cliente
    public void create(Agua a) {
        
        Connection con = ConexaoBd.getConnection();
    
        PreparedStatement stmt = null;
        //Inserindo dados na tabela atraves do metodo INSERT
        try {
            stmt = con.prepareStatement("INSERT INTO agu_agua (int_numero_instalacao,cta_mes_referencia," +
            "agu_gr,agu_codigo_cliente,agu_numero_conta,agu_tipo_ligacao,agu_hidrometro,agu_data_leitura_anterior," +
            "agu_data_leitura_atual,agu_leitura_anterior,agu_leitura_atual,agu_consumo,agu_valor_agua,agu_valor_esgoto," +
            "agu_taxa_regulamentacao,agu_multa,agu_tarifa_ate10_agua,agu_tarifa_ate20_agua,agu_tarifa_ate30_agua," +
            "agu_tarifa_ate50_agua,agu_tarifa_acima50_agua,agu_tarifa_ate10_esgoto,agu_tarifa_ate20_esgoto," +
            "agu_tarifa_ate30_esgoto,agu_tarifa_ate50_esgoto,agu_tarifa_acima50_esgoto,agu_valor_agua1,agu_valor_agua2," +
            "agu_valor_esgoto1,agu_valor_esgoto2) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setObject(1, a.getInt_numero_instalacao());
            stmt.setObject(2, a.getCta_mes_referencia());
            stmt.setObject(3, a.getAgu_gr());
            stmt.setObject(4, a.getAgu_codigo_cliente());
            stmt.setObject(5, a.getAgu_numero_conta());
            stmt.setObject(6, a.getAgu_tipo_ligacao());
            stmt.setObject(7, a.getAgu_hidrometro());
            stmt.setString(8, a.getAgu_data_leitura_anterior());
            stmt.setString(9, a.getAgu_data_leitura_atual());
            stmt.setObject(10, a.getAgu_leitura_anterior());
            stmt.setObject(11, a.getAgu_leitura_atual());
            stmt.setObject(12, a.getAgu_consumo());
            stmt.setObject(13, a.getAgu_valor_agua());
            stmt.setObject(14, a.getAgu_valor_esgoto());
            stmt.setObject(15, a.getAgu_taxa_regulamentacao());
            stmt.setObject(16, a.getAgu_multa());
            stmt.setObject(17, a.getAgu_tarifa_ate10_agua());
            stmt.setObject(18, a.getAgu_tarifa_ate20_agua());
            stmt.setObject(19, a.getAgu_tarifa_ate30_agua());
            stmt.setObject(20, a.getAgu_tarifa_ate50_agua());
            stmt.setObject(21, a.getAgu_tarifa_acima50_agua());
            stmt.setObject(22, a.getAgu_tarifa_ate10_esgoto());
            stmt.setObject(23, a.getAgu_tarifa_ate20_esgoto());
            stmt.setObject(24, a.getAgu_tarifa_ate30_esgoto());
            stmt.setObject(25, a.getAgu_tarifa_ate50_esgoto());
            stmt.setObject(26, a.getAgu_tarifa_acima50_esgoto());
            stmt.setObject(27, a.getAgu_valor_agua1());
            stmt.setObject(28, a.getAgu_valor_agua2());
            stmt.setObject(29, a.getAgu_valor_esgoto1());
            stmt.setObject(30, a.getAgu_valor_esgoto2());
            stmt.executeUpdate();

        } catch (SQLException ex) {
           Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);

        // Finally usado para fechar a conexao e statement se der ou não erro
        } finally {
            ConexaoBd.closeConnection(con, stmt);
        }

    }
}