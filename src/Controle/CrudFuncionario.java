package Controle;

import interfaces.CrudFuncionarioIf;
import Entidades.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CrudFuncionario implements CrudFuncionarioIf{

    private String url;
    private String user;
    private String password;
    private static Connection con;

    public CrudFuncionario(){
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
    public boolean adicionar(Funcionario f) {
        String sql = "INSERT INTO funcionario VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt;
        
        int vrf = 0;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getSexo());
            stmt.setString(3, f.getHabilitacao());
            stmt.setInt(4, f.getIdade());
            stmt.setString(5, f.getEmail());
            stmt.setString(6, f.getSenha());
            vrf = stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return vrf > 0;
    }

    @Override
    public boolean atualizar(Funcionario f) {
        String sql = "UPDATE funcionario SET nome = ?, sexo = ?, habilitacao = ?, idade = ?, email = ?, senha = ? WHERE email = ?";
        PreparedStatement stmt;
        
        int vrf = 0;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getSexo());
            stmt.setString(3, f.getHabilitacao());
            stmt.setInt(4, f.getIdade());
            stmt.setString(5, f.getEmail());
            stmt.setString(6, f.getSenha());
            stmt.setString(7, f.getEmail());
            vrf = stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return vrf > 0;
    }

    @Override
    public List<Funcionario> listar() {
        List<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario auxiliar = new Funcionario();
                auxiliar.setNome(rs.getString(1));
                auxiliar.setSexo(rs.getString(2));
                auxiliar.setHabilitacao(rs.getString(3));
                auxiliar.setIdade(rs.getInt(4));
                auxiliar.setEmail(rs.getString(5));
                auxiliar.setSenha(rs.getString(6));
                lista.add(auxiliar);
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return lista;
    }

    @Override
    public boolean remover(String f) {
        String sql = "DELETE FROM funcionario WHERE email = '" + f + "'";
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
