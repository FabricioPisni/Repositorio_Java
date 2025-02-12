/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Familia
 */
public class Tela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botao_cliente = new javax.swing.JButton();
        botao_funcionario = new javax.swing.JButton();
        botao_menu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        botao_filiais = new javax.swing.JButton();
        botao_pedido = new javax.swing.JButton();
        botao_entrega = new javax.swing.JButton();
        botao_reserva = new javax.swing.JButton();
        botao_estoque = new javax.swing.JButton();
        botao_fornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Acesso Restristo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Seja bem-vindo(a) ");

        botao_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_cliente.setText("Cliente");
        botao_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_clienteActionPerformed(evt);
            }
        });

        botao_funcionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_funcionario.setText("Funcionários");
        botao_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_funcionarioActionPerformed(evt);
            }
        });

        botao_menu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_menu.setText("Menu");
        botao_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_menuActionPerformed(evt);
            }
        });

        jLabel3.setText("Selecione uma das opções");

        jTextField1.setBackground(new java.awt.Color(0, 51, 153));
        jTextField1.setForeground(new java.awt.Color(0, 102, 204));

        botao_filiais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_filiais.setText("Filiais");
        botao_filiais.setEnabled(false);
        botao_filiais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_filiaisActionPerformed(evt);
            }
        });

        botao_pedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_pedido.setText("Pedido");
        botao_pedido.setEnabled(false);
        botao_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pedidoActionPerformed(evt);
            }
        });

        botao_entrega.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_entrega.setText("Entregas");
        botao_entrega.setEnabled(false);
        botao_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_entregaActionPerformed(evt);
            }
        });

        botao_reserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_reserva.setText("Reserva");
        botao_reserva.setEnabled(false);
        botao_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_reservaActionPerformed(evt);
            }
        });

        botao_estoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_estoque.setText("Estoque");
        botao_estoque.setEnabled(false);
        botao_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_estoqueActionPerformed(evt);
            }
        });

        botao_fornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_fornecedor.setText("Fornecedores");
        botao_fornecedor.setEnabled(false);
        botao_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_fornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_filiais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_reserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_estoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(botao_estoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_fornecedor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botao_pedido)
                                    .addComponent(botao_funcionario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botao_entrega)
                                    .addComponent(botao_cliente)))
                            .addComponent(botao_filiais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_reserva)
                            .addComponent(botao_menu))))
                .addGap(55, 55, 55)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_clienteActionPerformed
        //Abrir nova tela
        Tela_adm_Cliente tela_adm_Cliente = new Tela_adm_Cliente();
        tela_adm_Cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botao_clienteActionPerformed

    private void botao_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_funcionarioActionPerformed
        //Abrir nova tela
        Tela_adm_Funcionario Tela_adm_Funcionario = new Tela_adm_Funcionario();
        Tela_adm_Funcionario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botao_funcionarioActionPerformed

    private void botao_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_menuActionPerformed
        //Abrir nova tela
        Tela_adm_cardapio Tela_adm_cardapio = new Tela_adm_cardapio();
        Tela_adm_cardapio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botao_menuActionPerformed

    private void botao_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_entregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_entregaActionPerformed

    private void botao_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_reservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_reservaActionPerformed

    private void botao_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_estoqueActionPerformed

    private void botao_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_fornecedorActionPerformed

    private void botao_filiaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_filiaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_filiaisActionPerformed

    private void botao_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pedidoActionPerformed
        
    }//GEN-LAST:event_botao_pedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cliente;
    private javax.swing.JButton botao_entrega;
    private javax.swing.JButton botao_estoque;
    private javax.swing.JButton botao_filiais;
    private javax.swing.JButton botao_fornecedor;
    private javax.swing.JButton botao_funcionario;
    private javax.swing.JButton botao_menu;
    private javax.swing.JButton botao_pedido;
    private javax.swing.JButton botao_reserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
