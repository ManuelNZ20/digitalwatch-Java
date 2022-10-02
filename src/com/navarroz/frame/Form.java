package com.navarroz.frame;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TimerTask;
import java.util.Timer;

public class Form extends javax.swing.JFrame {

    SimpleDateFormat simple;
    Calendar calendar;

    public Form() {
        initComponents();
        timer();
    }

    private void timer() {
        int horas, minutos, segundo;
        String nombre = "";
        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                calendar = Calendar.getInstance();
                lblhoras.setText(String.valueOf(calendar.get(Calendar.HOUR) < 10 ?"0"+ calendar.get(Calendar.HOUR) : calendar.get(Calendar.HOUR)));
                lblminutos.setText(String.valueOf(calendar.get(Calendar.MINUTE) < 10 ? "0" + calendar.get(Calendar.MINUTE) : calendar.get(Calendar.MINUTE)));
                lblsegundos.setText(String.valueOf(calendar.get(Calendar.SECOND) < 10 ?"0"+calendar.get(Calendar.SECOND) : calendar.get(Calendar.SECOND)));
                lbldianombre.setText(getDayWatch(calendar));
                lbldia.setText(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
                lblmes.setText(geyMonthWathc(calendar));
                lblanyo.setText(String.valueOf(calendar.get(Calendar.YEAR)));
            }
        };
        Timer timer1 = new Timer();
        timer1.schedule(timer, new Date(), 1000);
    }
    
    private String geyMonthWathc(Calendar calendar){
        switch (calendar.get(Calendar.MONTH)) {
            case 0:
            return "Enero";
            case 1:
                return "Febrero";
            case 2:
                return "Marzo";
            case 3:
                return "Abril";
            case 4:
                return "Mayo";
            case 5:
                return "Junio";
            case 6:
                return "Julio";
            case 7:
                return "Agosto";
            case 8:
                return "Septiembre";
            case 9:
                return "Octubre";
            case 10:
                return "Noviembre";
            default:
                return "Diciembre";
        }
    }

    private String getDayWatch(Calendar calendar){
        switch(calendar.get(Calendar.DAY_OF_WEEK)){
            case 1:return "Domingo";
            case 2:return "Lunes";
            case 3:return "Martes";
            case 4:return "Miercoles";
            case 5:return "Jueves";
            case 6:return "Viernes";
            default:
                return "Sábado";
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblhoras = new javax.swing.JLabel();
        lblpoint = new javax.swing.JLabel();
        lblminutos = new javax.swing.JLabel();
        lblsegundos = new javax.swing.JLabel();
        lbldianombre = new javax.swing.JLabel();
        lbldia = new javax.swing.JLabel();
        lblmes = new javax.swing.JLabel();
        lblanyo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblhoras.setFont(new java.awt.Font("OCR A Extended", 0, 220)); // NOI18N
        lblhoras.setForeground(new java.awt.Color(255, 255, 0));
        lblhoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhoras.setText("00");

        lblpoint.setFont(new java.awt.Font("OCR A Extended", 0, 220)); // NOI18N
        lblpoint.setForeground(new java.awt.Color(255, 255, 255));
        lblpoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpoint.setText(":");

        lblminutos.setFont(new java.awt.Font("OCR A Extended", 0, 220)); // NOI18N
        lblminutos.setForeground(new java.awt.Color(255, 255, 0));
        lblminutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminutos.setText("00");

        lblsegundos.setFont(new java.awt.Font("OCR A Extended", 0, 70)); // NOI18N
        lblsegundos.setForeground(new java.awt.Color(0, 153, 204));
        lblsegundos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblsegundos.setText("00");

        lbldianombre.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        lbldianombre.setForeground(new java.awt.Color(255, 255, 255));
        lbldianombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldianombre.setText("Miercoles");

        lbldia.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        lbldia.setForeground(new java.awt.Color(255, 255, 255));
        lbldia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldia.setText("<00>");

        lblmes.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        lblmes.setForeground(new java.awt.Color(255, 255, 255));
        lblmes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmes.setText("<mes>");

        lblanyo.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        lblanyo.setForeground(new java.awt.Color(255, 255, 255));
        lblanyo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblanyo.setText("<año>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblhoras)
                .addGap(0, 0, 0)
                .addComponent(lblpoint)
                .addGap(0, 0, 0)
                .addComponent(lblminutos)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblanyo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldianombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(lblsegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblpoint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblminutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblsegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldianombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblanyo)
                        .addGap(6, 6, 6))
                    .addComponent(lblhoras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblanyo;
    private javax.swing.JLabel lbldia;
    private javax.swing.JLabel lbldianombre;
    private javax.swing.JLabel lblhoras;
    private javax.swing.JLabel lblmes;
    private javax.swing.JLabel lblminutos;
    private javax.swing.JLabel lblpoint;
    private javax.swing.JLabel lblsegundos;
    // End of variables declaration//GEN-END:variables
}
