/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

public class peluqueria extends javax.swing.JFrame {

    public peluqueria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotones = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        spnMax = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        spnMin = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones.setBackground(new java.awt.Color(239, 244, 255));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 30));

        pnlBotones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setText("Sexo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 40));

        pnlBotones.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 360, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setText("Edad");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

        pnlBotones.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 360, -1));

        jButton2.setText("Generar datos");
        pnlBotones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 160, 40));

        jButton3.setText("Añadir cliente");
        pnlBotones.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 40));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnMax.setValue(15);
        jPanel4.add(spnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 170, 30));

        jLabel1.setText("Maximo de tiempo de atencion");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 170, 20));

        spnMin.setValue(5);
        jPanel4.add(spnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 30));

        jLabel2.setText("Minimo de tiempo de atencion");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 20));

        pnlBotones.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 60));

        jButton4.setText("Siguiente Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlBotones.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 633, 360, 40));

        lblCantidad.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblCantidad.setText("Cantidad de clientes en fila:");
        pnlBotones.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 280, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel6.setText("0");
        pnlBotones.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 70, 40));

        getContentPane().add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 400, 700));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setLayout(new javax.swing.BoxLayout(pnlContenedor, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnlContenedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pnlContenedor.add(new servicio((int)spnMin.getValue(), (int)spnMax.getValue()));
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peluqueria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peluqueria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JSpinner spnMax;
    private javax.swing.JSpinner spnMin;
    // End of variables declaration//GEN-END:variables
}
