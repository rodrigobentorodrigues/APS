package Controle;

import Entidades.Doacao;
import interfaces.CrudDoacaoIf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CrudDoacao implements CrudDoacaoIf {

    private String url;
    private String user;
    private String password;
    private Connection con;

    public CrudDoacao() {
        try {
            this.url = "jdbc:postgresql://localhost:5432/APS";
            this.user = "postgres";
            this.password = "123";
            this.con = ConFactory.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean adicionar(Doacao d) {
        String sql = "INSERT INTO doacao(cpf, nome, fatorrh, datadedoacao, hora) VALUES(?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        int vrf = 0;
        try {
            String[] values = d.getData().split("/");
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, d.getCpf());
            stmt.setString(2, d.getNome());
            stmt.setString(3, d.getTipoSanguineo());
            stmt.setString(4, values[1]);
            stmt.setString(5, d.getHora());
            vrf = stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vrf > 0;
    }

    @Override
    public List<Doacao> listar() {
        String sql = "SELECT * FROM doacao";
        PreparedStatement stmt;
        List<Doacao> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Doacao aux = new Doacao();
                aux.setId(rs.getString(1));
                aux.setCpf(rs.getString(2));
                aux.setNome(rs.getString(3));
                aux.setTipoSanguineo(rs.getString(4));
                aux.setData(rs.getString(5));
                aux.setHora(rs.getString(6));
                lista.add(aux);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean remover(String id) {
        String sql = "DELETE FROM doacao WHERE id = '" + id + "'";
        PreparedStatement stmt;
        int vrf = 0;
        try {
            stmt = con.prepareStatement(sql);
            vrf = stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vrf > 0;
    }

}
