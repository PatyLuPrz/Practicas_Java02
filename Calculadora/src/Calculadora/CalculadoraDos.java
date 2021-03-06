/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import javax.swing.JComboBox;

/**
 *
 * @author TeddyBear
 */
public class CalculadoraDos extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraDos
     */
    public CalculadoraDos() {
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

        jp_calculadorados = new javax.swing.JPanel();
        jl_n1 = new javax.swing.JLabel();
        jl_n2 = new javax.swing.JLabel();
        jtf_n2 = new javax.swing.JTextField();
        jtf_n1 = new javax.swing.JTextField();
        jcb_op = new javax.swing.JComboBox<>();
        jb_r = new javax.swing.JButton();
        jl_r = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_calculadorados.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Calculadora V2.0", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jl_n1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jl_n1.setText("Numero 1:");

        jl_n2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jl_n2.setText("Numero 2:");

        jtf_n2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_n2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtf_n1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtf_n1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jcb_op.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcb_op.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division", "Modulo" }));

        jb_r.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jb_r.setText("Calcular");
        jb_r.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_rMouseClicked(evt);
            }
        });
        jb_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_rActionPerformed(evt);
            }
        });

        jl_r.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jl_r.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_r.setText("0.0");

        javax.swing.GroupLayout jp_calculadoradosLayout = new javax.swing.GroupLayout(jp_calculadorados);
        jp_calculadorados.setLayout(jp_calculadoradosLayout);
        jp_calculadoradosLayout.setHorizontalGroup(
            jp_calculadoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_calculadoradosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jp_calculadoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_calculadoradosLayout.createSequentialGroup()
                        .addComponent(jcb_op, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_calculadoradosLayout.createSequentialGroup()
                        .addGroup(jp_calculadoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_n2)
                            .addComponent(jl_n1))
                        .addGap(30, 30, 30)
                        .addGroup(jp_calculadoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_n2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jtf_n1)))
                    .addComponent(jl_r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jp_calculadoradosLayout.setVerticalGroup(
            jp_calculadoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_calculadoradosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jp_calculadoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_n1)
                    .addComponent(jtf_n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jp_calculadoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_n2)
                    .addComponent(jtf_n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jl_r)
                .addGap(15, 15, 15)
                .addGroup(jp_calculadoradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_r))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jp_calculadorados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jp_calculadorados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_rActionPerformed
        
    }//GEN-LAST:event_jb_rActionPerformed

    private void jb_rMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_rMouseClicked
        float n1;
        float n2;
        float r;
        n1 = Float.parseFloat(this.jtf_n1.getText());
        n2 = Float.parseFloat(this.jtf_n2.getText());
        String indx;
        indx = this.jcb_op.getSelectedItem().toString();
        switch(indx){
            case "Suma":{
                r=n1+n2;
                this.jl_r.setText(String.valueOf(r));
                break;
            }
            case "Resta":{
                r=n1-n2;
                this.jl_r.setText(String.valueOf(r));
                break;
            }
            case "Multiplicacion":{
                r=n1*n2;
                this.jl_r.setText(String.valueOf(r));
                break;
            }
            case "Modulo":{
                r=n1%n2;
                this.jl_r.setText(String.valueOf(r));
                break;
            }
            case "Division":{
                r=n1/n2;
                this.jl_r.setText(String.valueOf(r));
                break;
            }
            default:{
                this.jl_r.setText("Esto no sirve");
            }                
        }
    }//GEN-LAST:event_jb_rMouseClicked

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
            java.util.logging.Logger.getLogger(CalculadoraDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraDos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_r;
    private javax.swing.JComboBox<String> jcb_op;
    private javax.swing.JLabel jl_n1;
    private javax.swing.JLabel jl_n2;
    private javax.swing.JLabel jl_r;
    private javax.swing.JPanel jp_calculadorados;
    private javax.swing.JTextField jtf_n1;
    private javax.swing.JTextField jtf_n2;
    // End of variables declaration//GEN-END:variables
}
