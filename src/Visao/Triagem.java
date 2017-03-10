/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author Juan
 */
public class Triagem extends javax.swing.JFrame {

    /**
     * Creates new form Triagem
     */
    public Triagem() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        jLabel1 = new javax.swing.JLabel();
        gripeSim = new javax.swing.JCheckBox();
        gripeNao = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        bebidaSim = new javax.swing.JCheckBox();
        bebidaNao = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        tatuagemSim = new javax.swing.JCheckBox();
        tatuagemNao = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        vacinaSim = new javax.swing.JCheckBox();
        vacinaNao = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        herpesSim = new javax.swing.JCheckBox();
        herpesNao = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        faSim = new javax.swing.JCheckBox();
        faNao = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        concluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Teve resfriado na semana anterior a doação : ");

        gripeSim.setBackground(new java.awt.Color(255, 255, 255));
        gripeSim.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        gripeSim.setText("Sim");
        gripeSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gripeSimActionPerformed(evt);
            }
        });

        gripeNao.setBackground(new java.awt.Color(255, 255, 255));
        gripeNao.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        gripeNao.setText("Não");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Ingeriu bebida alcóolica nas últimas 12 horas :");

        bebidaSim.setBackground(new java.awt.Color(255, 255, 255));
        bebidaSim.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        bebidaSim.setText("Sim");
        bebidaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidaSimActionPerformed(evt);
            }
        });

        bebidaNao.setBackground(new java.awt.Color(255, 255, 255));
        bebidaNao.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        bebidaNao.setText("Não");
        bebidaNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidaNaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Fez tatuagem permanente no último ano :");

        tatuagemSim.setBackground(new java.awt.Color(255, 255, 255));
        tatuagemSim.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tatuagemSim.setText("Sim");
        tatuagemSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tatuagemSimActionPerformed(evt);
            }
        });

        tatuagemNao.setBackground(new java.awt.Color(255, 255, 255));
        tatuagemNao.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tatuagemNao.setText("Não");

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("Tomou vacina para gripe nas últimas 48 horas :");

        vacinaSim.setBackground(new java.awt.Color(255, 255, 255));
        vacinaSim.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        vacinaSim.setText("Sim");
        vacinaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacinaSimActionPerformed(evt);
            }
        });

        vacinaNao.setBackground(new java.awt.Color(255, 255, 255));
        vacinaNao.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        vacinaNao.setText("Não");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setText("Possui herpes labial ou genital :");

        herpesSim.setBackground(new java.awt.Color(255, 255, 255));
        herpesSim.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        herpesSim.setText("Sim");
        herpesSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herpesSimActionPerformed(evt);
            }
        });

        herpesNao.setBackground(new java.awt.Color(255, 255, 255));
        herpesNao.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        herpesNao.setText("Não");

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("Esteve atualmente em (AC AM AP RO RR MA MG PA TO) :");

        faSim.setBackground(new java.awt.Color(255, 255, 255));
        faSim.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        faSim.setText("Sim");
        faSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faSimActionPerformed(evt);
            }
        });

        faNao.setBackground(new java.awt.Color(255, 255, 255));
        faNao.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        faNao.setText("Não");

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel7.setText("Triagem");

        concluir.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        concluir.setText("Concluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(206, 206, 206))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                            .addComponent(faSim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(faNao))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(herpesSim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(herpesNao))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(gripeSim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(gripeNao))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(vacinaSim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(vacinaNao))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(tatuagemSim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(tatuagemNao))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(bebidaSim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bebidaNao))))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gripeSim)
                    .addComponent(gripeNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebidaSim)
                    .addComponent(bebidaNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tatuagemSim)
                    .addComponent(tatuagemNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vacinaSim)
                    .addComponent(vacinaNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(herpesSim)
                    .addComponent(herpesNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faSim)
                    .addComponent(faNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gripeSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gripeSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gripeSimActionPerformed

    private void bebidaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidaSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebidaSimActionPerformed

    private void tatuagemSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tatuagemSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tatuagemSimActionPerformed

    private void vacinaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacinaSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacinaSimActionPerformed

    private void herpesSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herpesSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_herpesSimActionPerformed

    private void faSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faSimActionPerformed

    private void bebidaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidaNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebidaNaoActionPerformed

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
            java.util.logging.Logger.getLogger(Triagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bebidaNao;
    private javax.swing.JCheckBox bebidaSim;
    private javax.swing.JButton concluir;
    private javax.swing.JCheckBox faNao;
    private javax.swing.JCheckBox faSim;
    private javax.swing.JCheckBox gripeNao;
    private javax.swing.JCheckBox gripeSim;
    private javax.swing.JCheckBox herpesNao;
    private javax.swing.JCheckBox herpesSim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox tatuagemNao;
    private javax.swing.JCheckBox tatuagemSim;
    private javax.swing.JCheckBox vacinaNao;
    private javax.swing.JCheckBox vacinaSim;
    // End of variables declaration//GEN-END:variables
}