
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ButtonModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Familia
 */
public class Cadastro_Funcionario extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_Cliente
     */
    public Cadastro_Funcionario() {
        initComponents();
    }
    
    public class valores {
        public static String sexo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botao_cancelar = new javax.swing.JButton();
        botao_enviar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        campo_cpf = new javax.swing.JTextField();
        campo_nome = new javax.swing.JTextField();
        campo_idade = new javax.swing.JTextField();
        campo_endereco = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        campo_telefone = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botao_voltar = new javax.swing.JButton();
        masculino_radio = new javax.swing.JRadioButton();
        feminino_radio = new javax.swing.JRadioButton();
        resultado = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campo_cargo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Funcionario");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Funcionario ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CPF: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sexo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Idade:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Endereço:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Email:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Telefone:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        botao_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_cancelar.setText("Cancelar");
        botao_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        botao_enviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_enviar.setText("Enviar");
        botao_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_enviarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 51, 153));
        jTextField1.setForeground(new java.awt.Color(0, 102, 204));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 356, 392, -1));

        campo_cpf.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        campo_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cpfActionPerformed(evt);
            }
        });
        getContentPane().add(campo_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 126, -1));

        campo_nome.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        getContentPane().add(campo_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 126, -1));

        campo_idade.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        campo_idade.setToolTipText("");
        campo_idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_idadeActionPerformed(evt);
            }
        });
        getContentPane().add(campo_idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 126, -1));

        campo_endereco.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        getContentPane().add(campo_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 126, -1));

        campo_email.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        getContentPane().add(campo_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 126, -1));

        campo_telefone.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        getContentPane().add(campo_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 126, -1));

        botao_voltar.setText("Voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_voltar)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_voltar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sexo.add(masculino_radio);
        masculino_radio.setText("Masculino");
        masculino_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculino_radioActionPerformed(evt);
            }
        });
        getContentPane().add(masculino_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, 20));

        sexo.add(feminino_radio);
        feminino_radio.setText("Feminino");
        feminino_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feminino_radioActionPerformed(evt);
            }
        });
        getContentPane().add(feminino_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 20));

        resultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 230, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Cargo:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        campo_cargo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        getContentPane().add(campo_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 126, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cancelarActionPerformed
        campo_cpf.setText("");
        campo_nome.setText("");
        campo_idade.setText("");
        campo_endereco.setText("");
        campo_email.setText("");
        campo_telefone.setText("");
        campo_cargo.setText("");
    }//GEN-LAST:event_botao_cancelarActionPerformed

    private void botao_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_enviarActionPerformed
        Timer timer = new Timer();
        
        TimerTask reiniciarMensagem = new TimerTask() {
            public void run() {
                resultado.setText("");
            }
        };
        
        String cpf = campo_cpf.getText();
        String nome = campo_nome.getText();
        String sexoValor = valores.sexo;
        String idade = campo_idade.getText();
        String endereco = campo_endereco.getText();
        String email = campo_email.getText();
        String tel = campo_telefone.getText();
        String cargo = campo_cargo.getText();
        
        if(cpf.equals("") || nome.equals("") || sexoValor.equals("") || idade.equals("") || endereco.equals("") || email.equals("") || tel.equals("") || cargo.equals("")) {
            resultado.setText("Por favor preencha todos os campos!");
        }else {
            String[] funcionario = {"funcionario", cpf, nome, sexoValor, idade, endereco, email, tel, cargo};
        
            String resultado_cadastro = adicionar_usuario.adicionar_usuario(funcionario);
        
            resultado.setText(resultado_cadastro);
            
            
        }
        timer.schedule(reiniciarMensagem, 3500);
    }//GEN-LAST:event_botao_enviarActionPerformed

    private void campo_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cpfActionPerformed

    private void campo_idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_idadeActionPerformed

    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        Tela_adm_Funcionario Tela_adm_Funcionario = new Tela_adm_Funcionario();
        Tela_adm_Funcionario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botao_voltarActionPerformed

    private void masculino_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculino_radioActionPerformed
        valores.sexo = "masculino";
    }//GEN-LAST:event_masculino_radioActionPerformed

    private void feminino_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feminino_radioActionPerformed
        valores.sexo = "feminino";
    }//GEN-LAST:event_feminino_radioActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cancelar;
    private javax.swing.JButton botao_enviar;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JTextField campo_cargo;
    private javax.swing.JTextField campo_cpf;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_endereco;
    private javax.swing.JTextField campo_idade;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_telefone;
    private javax.swing.JRadioButton feminino_radio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton masculino_radio;
    private javax.swing.JLabel resultado;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
}
