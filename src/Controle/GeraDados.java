package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeraDados {

    private String url;
    private String user;
    private String password;
    Connection conn;

    public GeraDados() throws ClassNotFoundException, SQLException{
       url = "jdbc:postgresql://127.0.0.1:5432/APS";
       user = "postgres";
       password = "123";
       conn = ConFactory.getConnection(url, user, password);
    }
    
    public int[] criaVetor() throws SQLException {
     
        PreparedStatement pstmt = conn.prepareStatement("select count(cpf) from doacao where datadedoacao = ?");
        ResultSet rs;

        int[] quantidadeMes = new int[12];

        for (int i = 1;
                i < 13; i++) {

            pstmt.setString(1, "0" + i);
            rs = pstmt.executeQuery();
            rs.next();

            quantidadeMes[i - 1] = rs.getInt(1);
        }
        
        return quantidadeMes;
    }
}
