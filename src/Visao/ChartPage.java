package Visao;

import Controle.CriarGrafico;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class ChartPage extends JFrame{
    
    private JFreeChart chart;
    private CriarGrafico cg;
    private JButton botao;
    
    public ChartPage() throws ClassNotFoundException, SQLException{
        cg = new CriarGrafico();
        this.chart = cg.getChart();
        
        ChartPanel chartP = new ChartPanel(this.chart);
        chartP.setBounds(0, 45, 505, 505);
        
        Container container = getContentPane();  
        container.setLayout(null);
        
        ImageIcon logo = new ImageIcon("src/Imagens/icone.png");
        setIconImage(logo.getImage());
        
        criarBotao(container);
        container.add(chartP);
      
        setResizable(false);
        setSize(510, 580);
        setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void criarBotao(Container container){
        ActionListener action = new criarListener();
        
        botao = new JButton("Gerar Arquivo");
        botao.setBounds(0, 0, 505, 45);
        botao.addActionListener(action);
        
        container.add(botao);
    }
    
    private class criarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton botaoAux = (JButton) e.getSource();
            
            if(botaoAux.equals(botao)){
                File file = new File("C:/users/juan/desktop/grafico.png");
                try {
                    cg.salvarGrafico(file);
                    JOptionPane.showMessageDialog(null, "a imagem foi salva na sua área de trabalho ^^");
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
        }
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ChartPage chart = new ChartPage();
        chart.pack();
        chart.setVisible(true);
    }

}
