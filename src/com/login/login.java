/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

//import java.awt.BorderLayout;
import java.awt.Color;


/**
 *
 * @author USER
 */
public class login extends javax.swing.JFrame {
    int xMouse, yMouse;
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        System.out.println("Hola Mundo Soy Cesar");
        System.out.println("Pruebaaaaa");
        System.out.println("Danaste julitza!");
        //archivos a1 = new archivos();
        //a1.setSize(765, 540);
        //a1.setLocation(0, 0);
        
        //bg.removeAll();
        //bg.add(a1, BorderLayout.CENTER);
        //bg.revalidate();
        //bg.repaint();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        archivo = new javax.swing.JLabel();
        integrantes = new javax.swing.JLabel();
        abandonar = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exitlbl = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/archivo.png"))); // NOI18N
        archivo.setText("jLabel2");
        archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archivoMouseClicked(evt);
            }
        });
        bg.add(archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 210, 50));

        integrantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/integrantes.png"))); // NOI18N
        integrantes.setText("jLabel3");
        integrantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(integrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 210, 50));

        abandonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/abandonar.png"))); // NOI18N
        abandonar.setText("jLabel4");
        abandonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abandonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abandonarMouseClicked(evt);
            }
        });
        bg.add(abandonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 210, 50));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));

        exitlbl.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        exitlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitlbl.setText("X");
        exitlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitlblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 280, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/background_1.png"))); // NOI18N
        background.setText("jLabel1");
        bg.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlblMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitlblMouseClicked

    private void exitlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlblMouseEntered
        // TODO add your handling code here:
        exitbtn.setBackground(Color.orange);
        exitlbl.setForeground(Color.white);
    }//GEN-LAST:event_exitlblMouseEntered

    private void exitlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlblMouseExited
        // TODO add your handling code here:
        exitbtn.setBackground(Color.white);
        exitlbl.setForeground(Color.black);
        
    }//GEN-LAST:event_exitlblMouseExited

    private void archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivoMouseClicked
        // TODO add your handling code here:
       Archivo archivo3 = new Archivo();
       archivo3.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_archivoMouseClicked

    private void abandonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_abandonarMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abandonar;
    private javax.swing.JLabel archivo;
    private javax.swing.JLabel background;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel exitlbl;
    private javax.swing.JPanel header;
    private javax.swing.JLabel integrantes;
    // End of variables declaration//GEN-END:variables
}
