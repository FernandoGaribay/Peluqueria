package main;

import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JScrollPane;
import javax.swing.SpinnerNumberModel;

public class Barberia extends javax.swing.JFrame {

    private FilaClientes filaClientes;
    private FilaPanelCliente filaPanelCliente;

    public Barberia() {
        initComponents();

        this.filaClientes = new FilaClientes();
        this.filaPanelCliente = new FilaPanelCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedorBotones = new javax.swing.JPanel();
        pnlCliente = new javax.swing.JPanel();
        pnlSexo = new javax.swing.JPanel();
        lblSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        pnlNombre = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnAniadir = new javax.swing.JButton();
        btnDatos = new javax.swing.JButton();
        pnlMinMax = new javax.swing.JPanel();
        pnlMin = new javax.swing.JPanel();
        spnMin = new javax.swing.JSpinner();
        lblMin = new javax.swing.JLabel();
        pnlMax = new javax.swing.JPanel();
        lblMax = new javax.swing.JLabel();
        spnMax = new javax.swing.JSpinner();
        pnlCantidad = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnAniadirBarbero = new javax.swing.JButton();
        lblCantidadClientes = new javax.swing.JLabel();
        lblCantidadBarberos = new javax.swing.JLabel();
        lblCantClientes = new javax.swing.JLabel();
        lblCantBarberos = new javax.swing.JLabel();
        pnlConfiguracion = new javax.swing.JPanel();
        lblConfiguracion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlContenedorServicios = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlContenedorFila = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenedorBotones.setBackground(new java.awt.Color(255, 204, 204));
        pnlContenedorBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCliente.setBackground(new java.awt.Color(255, 102, 102));
        pnlCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSexo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSexo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblSexo.setText("Sexo");
        pnlSexo.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 30));

        cbSexo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        cbSexo.setSelectedIndex(-1);
        pnlSexo.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 40));

        pnlCliente.add(pnlSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 340, -1));

        pnlNombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        pnlNombre.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 40));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNombre.setText("Nombre");
        pnlNombre.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 30));

        pnlCliente.add(pnlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 70));

        btnAniadir.setText("Añadir cliente");
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });
        pnlCliente.add(btnAniadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 40));

        btnDatos.setText("Generar datos");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });
        pnlCliente.add(btnDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 160, 40));

        pnlContenedorBotones.add(pnlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 220));

        pnlMinMax.setBackground(new java.awt.Color(255, 102, 102));
        pnlMinMax.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnMin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        spnMin.setModel(new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1));
        spnMin.setValue(5);
        pnlMin.add(spnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 30));

        lblMin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setText("Minimo de tiempo de atencion");
        pnlMin.add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 20));

        pnlMinMax.add(pnlMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 60));

        pnlMax.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMax.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMax.setText("Maximo de tiempo de atencion");
        pnlMax.add(lblMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 20));

        spnMax.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        spnMax.setModel(new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1));
        spnMax.setValue(15);
        pnlMax.add(spnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 30));

        pnlMinMax.add(pnlMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 340, 60));

        pnlContenedorBotones.add(pnlMinMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 360, 150));

        pnlCantidad.setBackground(new java.awt.Color(255, 102, 102));
        pnlCantidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguiente.setText("Siguiente Cliente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        pnlCantidad.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 40));

        btnAniadirBarbero.setText("Añadir barbero");
        btnAniadirBarbero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirBarberoActionPerformed(evt);
            }
        });
        pnlCantidad.add(btnAniadirBarbero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 160, 40));

        lblCantidadClientes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCantidadClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadClientes.setText("Cantidad de clientes en fila:");
        pnlCantidad.add(lblCantidadClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 40));

        lblCantidadBarberos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCantidadBarberos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadBarberos.setText("Cantidad de barberos:");
        pnlCantidad.add(lblCantidadBarberos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 40));

        lblCantClientes.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblCantClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblCantClientes.setText("0");
        pnlCantidad.add(lblCantClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 40, 40));

        lblCantBarberos.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblCantBarberos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantBarberos.setText("0");
        pnlCantidad.add(lblCantBarberos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 40, 40));

        pnlContenedorBotones.add(pnlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 360, 140));

        pnlConfiguracion.setBackground(new java.awt.Color(255, 102, 102));
        pnlConfiguracion.setForeground(new java.awt.Color(255, 102, 102));
        pnlConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblConfiguracion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        lblConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfiguracion.setText("Configuracion");
        pnlConfiguracion.add(lblConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 360, 30));

        pnlContenedorBotones.add(pnlConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 40));

        getContentPane().add(pnlContenedorBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 400, 700));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlContenedorServicios.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedorServicios.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                pnlContenedorServiciosComponentRemoved(evt);
            }
        });
        pnlContenedorServicios.setLayout(new java.awt.GridLayout(1, 1));
        jScrollPane1.setViewportView(pnlContenedorServicios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlContenedorFila.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedorFila.setLayout(new javax.swing.BoxLayout(pnlContenedorFila, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane3.setViewportView(pnlContenedorFila);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 180, 650));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fila de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 180, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (filaClientes.getQueue().isEmpty()) {
            return;
        }
        if (Integer.parseInt(lblCantBarberos.getText()) < 1) {
            return;
        }
        this.aniadirClienteServicio();
        this.eliminarClienteFila();
        this.actualizarLayoutServicios();

        lblCantClientes.setText(String.valueOf(filaClientes.getQueue().size()));
        lblCantBarberos.setText(String.valueOf(Integer.parseInt(lblCantBarberos.getText()) - 1));
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public void aniadirClienteServicio() {
        Cliente client = filaClientes.getQueue().remove();
        pnlContenedorServicios.add(new vtnServicio((int) spnMin.getValue(), (int) spnMax.getValue(), client));
        pnlContenedorServicios.revalidate();
        pnlContenedorServicios.repaint();
    }

    public void eliminarClienteFila() {
        pnlContenedorFila.remove(filaPanelCliente.getQueue().remove());
        pnlContenedorFila.revalidate();
        pnlContenedorFila.repaint();
    }

    public void actualizarLayoutServicios() {
        int componentes = pnlContenedorServicios.getComponentCount();
        if (componentes < 3) {
            GridLayout layout = new GridLayout(pnlContenedorServicios.getComponentCount() + 1, 1);
            jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            pnlContenedorServicios.setLayout(layout);
        } else {
            GridLayout layout = new GridLayout(pnlContenedorServicios.getComponentCount(), 1);
            jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            pnlContenedorServicios.setLayout(layout);
        }
    }


    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        if(this.camposVacios()){
            return;
        }
        Cliente objCliente = crearCliente();
        
        this.aniadirClienteFila(objCliente);
        this.filaClientes.getQueue().add(objCliente);

        this.lblCantClientes.setText(String.valueOf(filaClientes.getQueue().size()));
        this.vaciarCampos();
    }//GEN-LAST:event_btnAniadirActionPerformed

    private Cliente crearCliente() {
        Cliente objCliente = new Cliente();
        objCliente.setNombre(this.txtNombre.getText());
        objCliente.setSexo(this.cbSexo.getSelectedItem().toString());

        return objCliente;
    }

    private void aniadirClienteFila(Cliente objCliente) {
        PanelCliente pbjPanelCliente = new PanelCliente(objCliente);
        filaPanelCliente.getQueue().add(pbjPanelCliente);
        pnlContenedorFila.add(pbjPanelCliente);
        pnlContenedorFila.revalidate();
        pnlContenedorFila.repaint();
    }
    
    private boolean camposVacios(){
        if(this.txtNombre.getText().isEmpty()){
            return true;
        }
        if(this.cbSexo.getSelectedIndex() == -1){
            return true;
        }
        return false;
    }


    private void btnAniadirBarberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirBarberoActionPerformed
        int cantidadPeluqueros = Integer.parseInt(lblCantBarberos.getText()) + 1;
        this.lblCantBarberos.setText(String.valueOf(cantidadPeluqueros));
    }//GEN-LAST:event_btnAniadirBarberoActionPerformed

    private void pnlContenedorServiciosComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlContenedorServiciosComponentRemoved
        lblCantBarberos.setText(String.valueOf(Integer.parseInt(lblCantBarberos.getText()) + 1));
    }//GEN-LAST:event_pnlContenedorServiciosComponentRemoved

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        Nombres nombreGenerador = new Nombres();
        String nombre;

        if (new Random().nextInt(2) == 1) {
            nombre = nombreGenerador.getNombreHombreAleatorio();
            this.cbSexo.setSelectedIndex(0);
        } else {
            nombre = nombreGenerador.getNombreMujerAleatorio();
            this.cbSexo.setSelectedIndex(1);
        }
        this.txtNombre.setText(nombre);
    }//GEN-LAST:event_btnDatosActionPerformed

    private void vaciarCampos() {
        this.txtNombre.setText("");
        this.cbSexo.setSelectedIndex(-1);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barberia().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnAniadirBarbero;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCantBarberos;
    private javax.swing.JLabel lblCantClientes;
    private javax.swing.JLabel lblCantidadBarberos;
    private javax.swing.JLabel lblCantidadClientes;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JPanel pnlCantidad;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlConfiguracion;
    private javax.swing.JPanel pnlContenedorBotones;
    private javax.swing.JPanel pnlContenedorFila;
    private javax.swing.JPanel pnlContenedorServicios;
    private javax.swing.JPanel pnlMax;
    private javax.swing.JPanel pnlMin;
    private javax.swing.JPanel pnlMinMax;
    private javax.swing.JPanel pnlNombre;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JSpinner spnMax;
    private javax.swing.JSpinner spnMin;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
