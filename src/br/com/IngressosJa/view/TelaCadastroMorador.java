/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.view;

import br.com.IngressosJa.controller.MoradorController;
import br.com.IngressosJa.model.Morador;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class TelaCadastroMorador extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastroMorador() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCadastrarMoradorButton = new javax.swing.JButton();
        jSairMoradorButton = new javax.swing.JButton();
        jCadastroNomeM = new javax.swing.JTextField();
        jCadastroCPFM = new javax.swing.JTextField();
        jCadastroEnderecoM = new javax.swing.JTextField();
        jCadastroLoginM = new javax.swing.JTextField();
        jCadastroSenhaM = new javax.swing.JPasswordField();
        jCadastroCodigoM = new javax.swing.JPasswordField();
        jCadastroTeleM = new javax.swing.JTextField();
        jCadastroEmailM = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Morador");

        jLabel2.setText("Nome: ");

        jLabel3.setText("CPF:");

        jLabel4.setText("Login:");

        jLabel5.setText("Senha:");

        jLabel6.setText("Endereço:");

        jLabel7.setText("Telefone:");

        jLabel8.setText("Codigo:");

        jLabel9.setText("E-mail:");

        jCadastrarMoradorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clear Green Button.png"))); // NOI18N
        jCadastrarMoradorButton.setText("Cadastrar");
        jCadastrarMoradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarMoradorButtonActionPerformed(evt);
            }
        });

        jSairMoradorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancel Red Button.png"))); // NOI18N
        jSairMoradorButton.setText("Sair");
        jSairMoradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairMoradorButtonActionPerformed(evt);
            }
        });

        jCadastroEnderecoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroEnderecoMActionPerformed(evt);
            }
        });

        jCadastroCodigoM.setText("0000");
        jCadastroCodigoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroCodigoMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCadastrarMoradorButton)
                .addGap(60, 60, 60)
                .addComponent(jSairMoradorButton)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(313, 313, 313))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCadastroCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCadastroEmailM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCadastroNomeM, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jCadastroEnderecoM)
                            .addComponent(jCadastroCPFM)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jCadastroTeleM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCadastroSenhaM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCadastroLoginM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jCadastroNomeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCadastroCPFM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jCadastroEnderecoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCadastroLoginM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCadastroSenhaM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCadastroTeleM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jCadastroEmailM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8))
                    .addComponent(jCadastroCodigoM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCadastrarMoradorButton)
                    .addComponent(jSairMoradorButton))
                .addGap(18, 18, 18))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void jCadastroEnderecoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroEnderecoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastroEnderecoMActionPerformed

    private void jCadastrarMoradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarMoradorButtonActionPerformed
       try {
            Morador morador = new Morador();
            morador.setNome(jCadastroNomeM.getText());
            morador.setCpf(jCadastroCPFM.getText());
            morador.setEndereco(jCadastroEnderecoM.getText());
            morador.setEmail(jCadastroEmailM.getText());
            morador.setTelefone(Integer.parseInt(jCadastroTeleM.getText()));
            morador.setGerente(MoradorController.gerente(String.valueOf(jCadastroCodigoM.getPassword()), morador));
            morador.setLogin(jCadastroLoginM.getText());
            morador.setSenha(String.valueOf(jCadastroSenhaM.getPassword()));
            
            
            if (MoradorController.persistir(morador)==true) {
                JOptionPane.showMessageDialog(this,"Cliente gravado com Sucesso");
                dispose();
            }
           
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroMorador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCadastrarMoradorButtonActionPerformed

    private void jSairMoradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairMoradorButtonActionPerformed
        dispose();
    }//GEN-LAST:event_jSairMoradorButtonActionPerformed

    private void jCadastroCodigoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroCodigoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastroCodigoMActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroMorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastrarMoradorButton;
    private javax.swing.JTextField jCadastroCPFM;
    private javax.swing.JPasswordField jCadastroCodigoM;
    private javax.swing.JTextField jCadastroEmailM;
    private javax.swing.JTextField jCadastroEnderecoM;
    private javax.swing.JTextField jCadastroLoginM;
    private javax.swing.JTextField jCadastroNomeM;
    private javax.swing.JPasswordField jCadastroSenhaM;
    private javax.swing.JTextField jCadastroTeleM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSairMoradorButton;
    // End of variables declaration//GEN-END:variables
}
