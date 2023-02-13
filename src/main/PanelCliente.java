package main;

public class PanelCliente extends javax.swing.JPanel {

    public PanelCliente(Cliente objCliente) {
        initComponents();
        
        this.lblNombre.setText(objCliente.getNombre());
        this.lblSexo.setText(objCliente.getSexo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContenedor = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\garib\\OneDrive\\Escritorio\\ClienteFace.png")); // NOI18N
        lblContenedor.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 100));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Fernando");
        lblContenedor.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 30));

        lblSexo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexo.setText("Hombre");
        lblContenedor.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 30));

        add(lblContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 160));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCliente;
    private javax.swing.JPanel lblContenedor;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    // End of variables declaration//GEN-END:variables
}
