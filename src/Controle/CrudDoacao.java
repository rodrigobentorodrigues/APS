package Controle;

import Entidades.Doacao;
import Entidades.Doador;
import interfaces.CrudDoacaoIf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String sql = "INSERT INTO doacao VALUES(?, ?, ?, ? )";
        PreparedStatement stmt;
        int vrf = 0;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, d.getCpf());
            stmt.setString(2, d.getNome());
            stmt.setString(3, d.getTipoSanguineo());
            stmt.setString(4, d.getData());
            vrf = stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vrf > 0;
    }

    @Override
    public boolean atualizar(Doacao d) {
        String sql = "UPDATE doacao SET cpf = ?, nome = ?,  fatorrh = ?, data = ? WHERE cpf = ?";
        PreparedStatement stmt;
        int vrf = 0;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, d.getCpf());
            stmt.setString(2, d.getNome());
            stmt.setString(3, d.getTipoSanguineo());
            stmt.setString(4, d.getData());
            stmt.setString(5, d.getCpf());
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
                aux.setCpf(rs.getString(1));
                aux.setNome(rs.getString(2));
                aux.setTipoSanguineo(rs.getString(3));
                aux.setData(rs.getString(4));
                lista.add(aux);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean remover(String cpf) {
        String sql = "DELETE FROM doacao WHERE cpf = '" + cpf + "'";
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
