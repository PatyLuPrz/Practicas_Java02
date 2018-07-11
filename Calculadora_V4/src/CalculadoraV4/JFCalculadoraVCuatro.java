/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraV4;

import javax.swing.JOptionPane;

/**
 *
 * @author Norberto
 */
public class JFCalculadoraVCuatro extends javax.swing.JFrame {

    /**
     * Creates new form JFCalculadoraVCuatro
     */
    public JFCalculadoraVCuatro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelNumeroUno = new javax.swing.JLabel();
        jLabelNumeroDos = new javax.swing.JLabel();
        jTextFieldNumeroUno = new javax.swing.JTextField();
        jTextFieldNumeroDos = new javax.swing.JTextField();
        jTextFieldResultado = new javax.swing.JTextField();
        jButtonSuma = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonResiduo = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonMultiplicacion = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLTResultCalc1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTextResult = new javax.swing.JLabel();
        jLabelNumero1 = new javax.swing.JLabel();
        jLabelNumero2 = new javax.swing.JLabel();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jComboBoxOperaciones = new javax.swing.JComboBox<>();
        jButtonCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jl_numero1 = new javax.swing.JLabel();
        jtf_numero1 = new javax.swing.JTextField();
        jl_numero2 = new javax.swing.JLabel();
        jtf_numero2 = new javax.swing.JTextField();
        jrb_suma = new javax.swing.JRadioButton();
        jrb_resta = new javax.swing.JRadioButton();
        jrb_multiplicacion = new javax.swing.JRadioButton();
        jrb_division = new javax.swing.JRadioButton();
        jrb_modulo = new javax.swing.JRadioButton();
        jb_calcular = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora V1.0", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNumeroUno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelNumeroUno.setText("Número 1:");
        jPanel1.add(jLabelNumeroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabelNumeroDos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelNumeroDos.setText("Número 2:");
        jPanel1.add(jLabelNumeroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTextFieldNumeroUno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextFieldNumeroUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumeroUno.setText("0.0");
        jPanel1.add(jTextFieldNumeroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 167, -1));

        jTextFieldNumeroDos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextFieldNumeroDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumeroDos.setText("0.0");
        jPanel1.add(jTextFieldNumeroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 167, -1));

        jTextFieldResultado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextFieldResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldResultado.setText("0.0");
        jTextFieldResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 166, -1));

        jButtonSuma.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSuma.setText("+");
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jButtonResta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonResta.setText("-");
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 20));

        jButtonResiduo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonResiduo.setText("%");
        jButtonResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResiduoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonResiduo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 50, 20));

        jButtonDivision.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonDivision.setText("/");
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 20));

        jButtonMultiplicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonMultiplicacion.setText("*");
        jButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        jButtonLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 160, 20));

        jLTResultCalc1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLTResultCalc1.setText("Resultado:");
        jPanel1.add(jLTResultCalc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 250));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora V2.0", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTextResult.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelTextResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextResult.setText("0.0");
        jPanel2.add(jLabelTextResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 230, 20));

        jLabelNumero1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelNumero1.setText("Número 1:");
        jPanel2.add(jLabelNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabelNumero2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelNumero2.setText("Número 2:");
        jPanel2.add(jLabelNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        jTextFieldNumero2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextFieldNumero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumero2.setText("0.0");
        jPanel2.add(jTextFieldNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 120, -1));

        jTextFieldNumero1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextFieldNumero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumero1.setText("0.0");
        jPanel2.add(jTextFieldNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, -1));

        jComboBoxOperaciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBoxOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División", "Modulo" }));
        jComboBoxOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacionesActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 130, 120, 20));

        jButtonCalcular.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 320, 250));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora V3.0", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_numero1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_numero1.setText("Número 1:");
        jPanel3.add(jl_numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 30));

        jtf_numero1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtf_numero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_numero1.setText("0.0");
        jPanel3.add(jtf_numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 150, -1));

        jl_numero2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jl_numero2.setText("Número 2:");
        jPanel3.add(jl_numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 30));

        jtf_numero2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtf_numero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_numero2.setText("0.0");
        jPanel3.add(jtf_numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, -1));

        buttonGroup1.add(jrb_suma);
        jrb_suma.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jrb_suma.setText("Suma");
        jPanel3.add(jrb_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        buttonGroup1.add(jrb_resta);
        jrb_resta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jrb_resta.setText("Resta");
        jPanel3.add(jrb_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        buttonGroup1.add(jrb_multiplicacion);
        jrb_multiplicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jrb_multiplicacion.setText("Multiplicación");
        jPanel3.add(jrb_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        buttonGroup1.add(jrb_division);
        jrb_division.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jrb_division.setText("División");
        jPanel3.add(jrb_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        buttonGroup1.add(jrb_modulo);
        jrb_modulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jrb_modulo.setText("Modulo");
        jPanel3.add(jrb_modulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jb_calcular.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_calcular.setText("Calcular");
        jb_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_calcularMouseClicked(evt);
            }
        });
        jb_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcularActionPerformed(evt);
            }
        });
        jPanel3.add(jb_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 30));

        jb_borrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jb_borrar.setText("Borrar");
        jb_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_borrarMouseClicked(evt);
            }
        });
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });
        jPanel3.add(jb_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 90, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 640, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        float numero1 = 0.0f;//Variable numero1
        float numero2 = 0.0f;//Variable numero2
        numero1 = Float.parseFloat(this.jTextFieldNumeroUno.getText()); //Convierte el texto a flotante y guarda el numero1
        numero2 = Float.parseFloat(this.jTextFieldNumeroDos.getText()); //Convierte el texto a flotante y guarda el numero2
        float resultado = numero1 + numero2; //Se crea una variable flotante "Resultado" y se guarda la suma
        this.jTextFieldResultado.setText(String.valueOf(resultado)); // Mostrar resultado en JTextFieldResultado el resultado
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        float numero1 = 0.0f;//Variable numero1
        float numero2 = 0.0f;//Variable numero2
        numero1 = Float.parseFloat(this.jTextFieldNumeroUno.getText());//Convierte texto a flotante
        numero2 = Float.parseFloat(this.jTextFieldNumeroDos.getText());
        float resultado = numero1 - numero2;
        this.jTextFieldResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResiduoActionPerformed
        float numero1 = 0.0f;//Variable numero1
        float numero2 = 0.0f;//Variable numero2
        numero1 = Float.parseFloat(this.jTextFieldNumeroUno.getText());//Convierte texto a flotante
        numero2 = Float.parseFloat(this.jTextFieldNumeroDos.getText());//Y guarda numero1 y numero2
        float resultado = numero1 % numero2;
        this.jTextFieldResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButtonResiduoActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        float numero1 = 0.0f;//Variable numero1
        float numero2 = 0.0f;//Variable numero2
        numero1 = Float.parseFloat(this.jTextFieldNumeroUno.getText());//Convierte texto a flotante
        numero2 = Float.parseFloat(this.jTextFieldNumeroDos.getText());//Y guarda numero1 y numero2
        float resultado = numero1 / numero2;
        this.jTextFieldResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacionActionPerformed
        float numero1 = 0.0f;//Variable numero1
        float numero2 = 0.0f;//Variable numero2
        numero1 = Float.parseFloat(this.jTextFieldNumeroUno.getText());//Convierte texto a flotante
        numero2 = Float.parseFloat(this.jTextFieldNumeroDos.getText());//Y guarda numero1 y numero2
        float resultado = numero1 * numero2;
        this.jTextFieldResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButtonMultiplicacionActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextFieldNumeroUno.setText("0.0");
        jTextFieldNumeroDos.setText("0.0");
        jTextFieldResultado.setText("0.0");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jComboBoxOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacionesActionPerformed

    }//GEN-LAST:event_jComboBoxOperacionesActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        float numero1 = 0.0f;
        float numero2 = 0.0f;

        numero1 = Float.parseFloat(jTextFieldNumero1.getText());
        numero2 = Float.parseFloat(jTextFieldNumero2.getText());

        int operacion = jComboBoxOperaciones.getSelectedIndex();

        if (operacion == 0)
        {
            jLabelTextResult.setText(String.valueOf(numero1 + numero2));
        }

        else if(operacion == 1)
        {
            jLabelTextResult.setText(String.valueOf(numero1 - numero2));
        }

        else if(operacion == 2)
        {
            jLabelTextResult.setText(String.valueOf(numero1 * numero2));
        }
        else if(operacion == 3)
        {
            jLabelTextResult.setText(String.valueOf(numero1 / numero2));
        }
        else if(operacion == 4)
        {
            jLabelTextResult.setText(String.valueOf(numero1 % numero2));
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jb_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_calcularMouseClicked
        float numero1 = 0.0f;
        float numero2 =0.0f;
        float resultado =0.0f;
        String signo = null;
        numero1 = Float.parseFloat(this.jtf_numero1.getText());
        numero2 = Float.parseFloat(this.jtf_numero2.getText());

        if(this.jrb_suma.isSelected())
        {
            resultado = numero1 + numero2;
            signo = " + ";
        }
        else if(this.jrb_resta.isSelected())
        {
            resultado = numero1 - numero2;
            signo = " - ";
        }
        else if(this.jrb_multiplicacion.isSelected())
        {
            resultado = numero1 * numero2;
            signo = " * ";
        }
        else if(this.jrb_division.isSelected())
        {
            resultado = numero1 / numero2;
            signo = " / ";
        }
        else if(this.jrb_modulo.isSelected())
        {
            resultado = numero1 % numero2;
            signo = " % ";
        }
        JOptionPane.showMessageDialog(this, numero1 + signo + numero2+ " = " + resultado);
    }//GEN-LAST:event_jb_calcularMouseClicked

    private void jb_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_calcularActionPerformed

    private void jb_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarMouseClicked
        float numero1=0.0f;
        float numero2=0.0f;
        float resultado=0.0f;
        this.jtf_numero1.setText(String.valueOf(numero1));
        this.jtf_numero2.setText(String.valueOf(numero2));
    }//GEN-LAST:event_jb_borrarMouseClicked

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void jTextFieldResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(JFCalculadoraVCuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCalculadoraVCuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCalculadoraVCuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCalculadoraVCuatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCalculadoraVCuatro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonMultiplicacion;
    private javax.swing.JButton jButtonResiduo;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JComboBox<String> jComboBoxOperaciones;
    private javax.swing.JLabel jLTResultCalc1;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelNumero2;
    private javax.swing.JLabel jLabelNumeroDos;
    private javax.swing.JLabel jLabelNumeroUno;
    private javax.swing.JLabel jLabelTextResult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    private javax.swing.JTextField jTextFieldNumeroDos;
    private javax.swing.JTextField jTextFieldNumeroUno;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_calcular;
    private javax.swing.JLabel jl_numero1;
    private javax.swing.JLabel jl_numero2;
    private javax.swing.JRadioButton jrb_division;
    private javax.swing.JRadioButton jrb_modulo;
    private javax.swing.JRadioButton jrb_multiplicacion;
    private javax.swing.JRadioButton jrb_resta;
    private javax.swing.JRadioButton jrb_suma;
    private javax.swing.JTextField jtf_numero1;
    private javax.swing.JTextField jtf_numero2;
    // End of variables declaration//GEN-END:variables
}