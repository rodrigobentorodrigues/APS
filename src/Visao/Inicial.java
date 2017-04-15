/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.GerenciadorDoacao;
import Entidades.Doacao;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        ImageIcon logo = new ImageIcon("src/Imagens/icone.png");
        setIconImage(logo.getImage());
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cadastraDoador = new javax.swing.JButton();
        cadastraFunc = new javax.swing.JButton();
        estoque = new javax.swing.JButton();
        triagem = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        removerFunc = new javax.swing.JButton();
        atualizaFunc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        consultaFunc = new javax.swing.JButton();
        ConsultaDoador = new javax.swing.JButton();
        ConsultaDoacoes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cadastraDoador.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cadastraDoador.setText("Cadastrar Doador");
        cadastraDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraDoadorActionPerformed(evt);
            }
        });

        cadastraFunc.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cadastraFunc.setText("Cadastrar Funcionario");
        cadastraFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraFuncActionPerformed(evt);
            }
        });

        estoque.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        estoque.setText("Controle de Estoque");
        estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueActionPerformed(evt);
            }
        });

        triagem.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        triagem.setText("Triagem");
        triagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triagemActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton7.setText("Grafico de Doacoes");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Funcionário");

        removerFunc.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        removerFunc.setText("Remover Funcionario");
        removerFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFuncActionPerformed(evt);
            }
        });

        atualizaFunc.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        atualizaFunc.setText("Atualizar Funcionario");
        atualizaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaFuncActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Doador");

        consultaFunc.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        consultaFunc.setText("Consultar Funcionario");
        consultaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaFuncActionPerformed(evt);
            }
        });

        ConsultaDoador.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ConsultaDoador.setText("Consulta Doador");
        ConsultaDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaDoadorActionPerformed(evt);
            }
        });

        ConsultaDoacoes.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ConsultaDoacoes.setText("Consultar Doacoes");
        ConsultaDoacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaDoacoesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Estoque");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removerFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(atualizaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cadastraDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(triagem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ConsultaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ConsultaDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(consultaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cadastraDoador, cadastraFunc, estoque, jButton7, triagem});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consultaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastraDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(triagem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConsultaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultaDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastraFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraFuncActionPerformed
        CadastroFuncionario tela = new CadastroFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_cadastraFuncActionPerformed

    private void cadastraDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraDoadorActionPerformed
        CadastroDoador tela = new CadastroDoador();
        tela.setVisible(true);
    }//GEN-LAST:event_cadastraDoadorActionPerformed

    private void removerFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFuncActionPerformed
        RemoveFunc tela = new RemoveFunc();
        tela.setVisible(true);
    }//GEN-LAST:event_removerFuncActionPerformed

    private void atualizaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaFuncActionPerformed
        AtualizaFunc tela = new AtualizaFunc();
        tela.setVisible(true);
    }//GEN-LAST:event_atualizaFuncActionPerformed

    private void consultaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaFuncActionPerformed
        ConsultarFunc tela = new ConsultarFunc();
        tela.setVisible(true);
    }//GEN-LAST:event_consultaFuncActionPerformed

    private void ConsultaDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaDoadorActionPerformed
        ConsultarDoador tela = new ConsultarDoador();
        tela.setVisible(true);
    }//GEN-LAST:event_ConsultaDoadorActionPerformed

    private void triagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triagemActionPerformed
        Triagem tela = new Triagem();
        tela.setVisible(true);
    }//GEN-LAST:event_triagemActionPerformed

    private void ConsultaDoacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaDoacoesActionPerformed
        File log = new File("C:/logs/log.txt");
        
        if(log.exists()){
            //infelizmente a preguiça me fez fazer isso, nao queria criar outra tela so pra pegar o nome do cara
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do doador");
            GerenciadorDoacao gd = new GerenciadorDoacao();
            if(!(nome == null)){
                if(!nome.equals("")){
                    List<Doacao> lista = gd.listar();

                    StringBuilder stb = new StringBuilder("");

                    for (Doacao doc : lista) {
                        if(nome.equals(doc.getNome()))
                            stb.append(doc.getCpf() + ": " + doc.getHora() + " - " + doc.getData() + "\n");
                    }

                    if(stb.toString().equals("")){
                        JOptionPane.showMessageDialog(null, "nenhuma doação foi realizada por este doador");
                    }else{
                        JOptionPane.showMessageDialog(null, stb);
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Digite o nome do doador!!!");
                }
            }    
        }else{
            JOptionPane.showMessageDialog(null, "não foram feitas doações ainda", "Ops!", JOptionPane.ERROR_MESSAGE);
            log.delete();
        }
    }//GEN-LAST:event_ConsultaDoacoesActionPerformed

    private void estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueActionPerformed
        List<Doacao> lista = new ArrayList<>();
        GerenciadorDoacao gd = new GerenciadorDoacao();
        lista = gd.listar();
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não possui nenhuma doação cadastrada",
                    "Mensagem de Erro !", JOptionPane.ERROR_MESSAGE);
        } else {
            String [] titulos  = {"Id", "Nome", "Tipo Sanguineo", "Data"};
            int size = lista.size();
            System.out.println(size);
            String [][] matriz = new String [size][4];
            for(int i = 0; i < size; i++){
                matriz[i][0] = lista.get(i).getId();
                matriz[i][1] = lista.get(i).getNome();
                matriz[i][2] = lista.get(i).getTipoSanguineo();
                matriz[i][3] = lista.get(i).getData();
            }
            DefaultTableModel modelo = new DefaultTableModel(matriz, titulos);
            ControleEstoque tela = new ControleEstoque();
            tela.setVisible(true);
            tela.tabela(modelo);
        }
    }//GEN-LAST:event_estoqueActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        ChartPage chart;
        try {
            chart = new ChartPage();
            chart.setVisible(true);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        

    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaDoacoes;
    private javax.swing.JButton ConsultaDoador;
    private javax.swing.JButton atualizaFunc;
    private javax.swing.JButton cadastraDoador;
    private javax.swing.JButton cadastraFunc;
    private javax.swing.JButton consultaFunc;
    public javax.swing.JButton estoque;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton removerFunc;
    private javax.swing.JButton triagem;
    // End of variables declaration//GEN-END:variables
}
