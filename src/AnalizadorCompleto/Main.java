/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguajesproyecto2;

/**
 *
 * @author ErikssonHerlo
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setSize(640,390);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        IrAnalizador = new javax.swing.JButton();
        Informacion = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(254, 254, 254));
        Titulo1.setText("Y SINTACTICO");
        getContentPane().add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 370, 110));

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(254, 254, 254));
        Titulo.setText("ANALIZADOR LEXICO");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 560, 110));

        IrAnalizador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        IrAnalizador.setText("Analizador Léxico y Sintáctico");
        IrAnalizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAnalizadorActionPerformed(evt);
            }
        });
        getContentPane().add(IrAnalizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 310, 40));

        Informacion.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        Informacion.setText("Información del Estudiante");
        Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformacionActionPerformed(evt);
            }
        });
        getContentPane().add(Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 310, 40));

        Salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 310, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/library.jpeg"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(800, 467));
        Fondo.setMinimumSize(new java.awt.Dimension(800, 467));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -70, 930, 526));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IrAnalizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrAnalizadorActionPerformed
        // TODO add your handling code here:
        Analizador Analizar = new Analizador();
        Analizar.setVisible(true);
        this.setVisible(false);

      
    }//GEN-LAST:event_IrAnalizadorActionPerformed

    private void InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformacionActionPerformed
        InformacionEstudiante Info = new InformacionEstudiante();
        Info.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_InformacionActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Informacion;
    private javax.swing.JButton IrAnalizador;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    // End of variables declaration//GEN-END:variables
}