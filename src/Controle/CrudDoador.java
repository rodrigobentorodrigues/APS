
package Controle;

import interfaces.CrudDoadorIf;
import Entidades.Doador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CrudDoador implements CrudDoadorIf{
    
    private String url;
    private String user;
    private String password;
    private Connection con;
    
    public CrudDoador(){
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
    public void adicionar (Doador d){
        String sql = "INSERT INTO doador VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getCpf());
            stmt.setString(3, d.getDataNascimento());
            stmt.setString(4, d.getSexo());
            stmt.setString(5, d.getTipoSanguineo());
            stmt.setDouble(6, d.getPeso());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void atualizar (Doador d){
        String sql = "UPDATE doador SET nome = ?, cpf = ?, dataNascimento = ?, sexo = ?, tipoSanguineo = ?, peso = ? where cpf = ?";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getCpf());
            stmt.setString(3, d.getDataNascimento());
            stmt.setString(4, d.getSexo());
            stmt.setString(5, d.getTipoSanguineo());
            stmt.setDouble(6, d.getPeso());
            stmt.setString(7, d.getCpf());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public List<Doador> listar() {
        List<Doador> lista = new ArrayList<>();
        PreparedStatement stmt;
        String sql = "SELECT * FROM doador";
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Doador auxiliar = new Doador();
                auxiliar.setNome(rs.getString(2));
                auxiliar.setCpf(rs.getString(3));
                auxiliar.setDataNascimento(rs.getString(4));
                auxiliar.setSexo(rs.getString(5));
                auxiliar.setTipoSanguineo(rs.getString(6));
                auxiliar.setPeso(rs.getDouble(7));
                lista.add(auxiliar);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    @Override
    public void remover(String cpf){
        String sql = "DELETE FROM doador WHERE cpf = '"+cpf+"'";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
