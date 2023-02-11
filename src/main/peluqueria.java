package main;

import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class peluqueria extends javax.swing.JFrame {

    private FilaClientes fila = new FilaClientes();

    public peluqueria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotones = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        spnMin = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spnMax = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        lblClientes = new javax.swing.JLabel();
        lblCantClientes = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        lblBarberos = new javax.swing.JLabel();
        lblCantBarberos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones.setBackground(new java.awt.Color(239, 244, 255));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setText("Sexo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 30));

        cbGender.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        cbGender.setSelectedIndex(-1);
        jPanel2.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 360, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 70));

        jButton3.setText("Añadir cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 110, 40));

        jButton2.setText("Generar datos");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 110, 40));

        pnlBotones.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnMin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        spnMin.setValue(5);
        jPanel5.add(spnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Minimo de tiempo de atencion");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 20));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 60));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maximo de tiempo de atencion");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 20));

        spnMax.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        spnMax.setValue(15);
        jPanel6.add(spnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 60));

        pnlBotones.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 130));

        jButton4.setText("Siguiente Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlBotones.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 633, 190, 40));

        lblClientes.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblClientes.setText("Cantidad de clientes en fila:");
        pnlBotones.add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 280, 40));

        lblCantClientes.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblCantClientes.setText("0");
        pnlBotones.add(lblCantClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 40, 40));

        jButton5.setText("Añadir barbero");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnlBotones.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 160, 40));

        lblBarberos.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblBarberos.setText("Cantidad de barberos:");
        pnlBotones.add(lblBarberos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 280, 40));

        lblCantBarberos.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblCantBarberos.setText("0");
        pnlBotones.add(lblCantBarberos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 40, 40));

        getContentPane().add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 400, 700));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                pnlContenedorComponentRemoved(evt);
            }
        });
        pnlContenedor.setLayout(new java.awt.GridLayout(1, 1));
        jScrollPane1.setViewportView(pnlContenedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (fila.getQueue().isEmpty()) {
            return;
        }
        if (Integer.parseInt(lblCantBarberos.getText()) < 1) {
            return;
        }

        Cliente client = fila.getQueue().remove();
        pnlContenedor.add(new servicio((int) spnMin.getValue(), (int) spnMax.getValue(), client));
        pnlContenedor.revalidate();
        pnlContenedor.repaint();

        lblCantClientes.setText(String.valueOf(fila.getQueue().size()));
        lblCantBarberos.setText(String.valueOf(Integer.parseInt(lblCantBarberos.getText()) - 1));

        int componentes = pnlContenedor.getComponentCount();
        if (componentes < 3) {
            GridLayout layout = new GridLayout(pnlContenedor.getComponentCount() + 1, 1);
            jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            pnlContenedor.setLayout(layout);
        } else {
            GridLayout layout = new GridLayout(pnlContenedor.getComponentCount(), 1);
            jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            pnlContenedor.setLayout(layout);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cliente cliente = new Cliente();

        cliente.setName(this.txtName.getText());
        cliente.setGender(this.cbGender.getSelectedItem().toString());
        fila.getQueue().add(cliente);

        lblCantClientes.setText(String.valueOf(fila.getQueue().size()));
        System.out.println(fila.getQueue());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int cantidadPeluqueros = Integer.parseInt(lblCantBarberos.getText()) + 1;
        this.lblCantBarberos.setText(String.valueOf(cantidadPeluqueros));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pnlContenedorComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlContenedorComponentRemoved
        lblCantBarberos.setText(String.valueOf(Integer.parseInt(lblCantBarberos.getText()) + 1));
    }//GEN-LAST:event_pnlContenedorComponentRemoved

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
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarberos;
    private javax.swing.JLabel lblCantBarberos;
    private javax.swing.JLabel lblCantClientes;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JSpinner spnMax;
    private javax.swing.JSpinner spnMin;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
