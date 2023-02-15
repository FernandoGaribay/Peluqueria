package main;

import java.awt.Color;
import java.awt.Container;
import java.text.DecimalFormat;
import java.util.Random;

public class vtnServicio extends javax.swing.JPanel {

    private Cliente objCliente;
    private int min;
    private int max;

    public vtnServicio() {
    }

    public vtnServicio(int min, int max, Cliente objCliente) {
        initComponents();

        this.min = min;
        this.max = max;
        this.objCliente = objCliente;

        this.lblNombre.setText("Nombre: " + objCliente.getNombre());
        this.lblSexo.setText("Genero: " + objCliente.getSexo());

        new Thread(() -> {
            tiempoServicio();
        }).start();
    }

    public void tiempoServicio() {
        int timeLimit = randomTimer();
        DecimalFormat formatter = new DecimalFormat("00.00");

        for (double i = timeLimit; i >= 0; i -= 0.01) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.lblTiempo.setText("Tiempo restante: " + formatter.format(i) + " Segundos");
        }
        this.deleteService();

    }

    public int randomTimer() {
        Random random = new Random();

        int randomNumber = random.nextInt((this.max - this.min) + 1) + this.min;
        return randomNumber;
    }

    public void deleteService() {
        this.lblTiempo.setText("Servicio finalizado.");
        this.lblTiempo.setForeground(Color.green);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Container contenedor = this.getParent();
        contenedor.remove(this);
        contenedor.revalidate();
        contenedor.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        lblClienteServicio = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblBarbero = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClienteServicio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblClienteServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblClienteServicio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblClienteServicio.setText("Cliente en Servicio:");
        pnlContenedor.add(lblClienteServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 180, -1));

        lblSexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSexo.setText("Hombre");
        pnlContenedor.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 160, -1));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNombre.setText("Fernando");
        pnlContenedor.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 160, -1));

        lblCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cliente.png"))); // NOI18N
        pnlContenedor.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        lblBarbero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barbero.png"))); // NOI18N
        pnlContenedor.add(lblBarbero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        lblTiempo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo.setText("Tiempo restante: 00:00 Segundos");
        pnlContenedor.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barberia.png"))); // NOI18N
        pnlContenedor.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 280));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBarbero;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblClienteServicio;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables
}
