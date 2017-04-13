package Controle;

import java.sql.SQLException;
import org.jfree.data.category.DefaultCategoryDataset;

public class CriaDataset {

    DefaultCategoryDataset dt;
    
    public CriaDataset(){
        dt = new DefaultCategoryDataset();
    }
    
    public DefaultCategoryDataset getDataset(){
        return this.dt;
    }
    
    public void popularDataset() throws ClassNotFoundException, SQLException{
        
        GeraDados gd = new GeraDados();
        int[] quantidadeMes = gd.criaVetor();
        
        for (int i = 0; i < 12; i++) {
            dt.addValue(quantidadeMes[i], Ano.mes(i), "");
        }
        
    };
    
}
