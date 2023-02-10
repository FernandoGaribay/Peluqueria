package main;

import java.awt.Color;
import java.awt.Container;
import java.text.DecimalFormat;
import java.util.Random;

public class servicio extends javax.swing.JPanel {

    private int min;
    private int max;

    public servicio(int min, int max) {
        initComponents();

        this.min = min;
        this.max = max;

        new Thread(() -> {
            tiempoServicio();
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTemp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemp.setText("00:00 Segundos");
        jPanel1.add(lblTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 780, 38));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 280));
    }// </editor-fold>//GEN-END:initComponents

    public void tiempoServicio() {
        int timeLimit = randomTimer();
        DecimalFormat formatter = new DecimalFormat("00.00");

        for (double i = timeLimit; i >= 0; i -= 0.01) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            System.out.println(formatter.format(i));
            this.lblTemp.setText(formatter.format(i) + " Segundos");
        }
        this.deleteService();

    }

    public int randomTimer() {
        Random random = new Random();

        int randomNumber = random.nextInt((this.max - this.min) + 1) + this.min;
        System.out.println("Numero aleatorio: " + randomNumber);
        return randomNumber;
    }

    public void deleteService() {
        this.lblTemp.setText("Servicio finalizado.");
        this.lblTemp.setForeground(Color.green);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println(this.getParent());
        Container contenedor = this.getParent();
        contenedor.remove(this);
        contenedor.revalidate();
        contenedor.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTemp;
    // End of variables declaration//GEN-END:variables
}
