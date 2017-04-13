package Controle;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public class CriarGrafico {

    private JFreeChart chart;
    
    public CriarGrafico() throws ClassNotFoundException, SQLException{
        CriaDataset cds = new CriaDataset();
        cds.popularDataset();
        chart = ChartFactory.createBarChart3D("Análise de doações", "quantidade de doações por mês", "", cds.getDataset(), 
                PlotOrientation.VERTICAL, true, false, true);
    }
    
    public void salvarGrafico(File file) throws IOException{
        ChartUtilities.saveChartAsPNG(file, chart, 500, 500);
    }
    
    public JFreeChart getChart(){
        return this.chart;
    }
}
