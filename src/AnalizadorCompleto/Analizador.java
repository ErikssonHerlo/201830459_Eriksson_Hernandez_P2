/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguajesproyecto2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ErikssonHerlo
 */
public class Analizador extends javax.swing.JFrame {
    
   JFileChooser seleccionar = new JFileChooser();
   File archivo;
   FileInputStream entrada;
   FileOutputStream salida;
   
    /**
     * Creates new form Analizador
     */
    public Analizador() {
        initComponents();
        this.setSize(640,480);
        
        // Archivos a = new Archivos();
       // System.out.println(a.leerTxt("/home/alejandrobr/NetBeansProjects/201831234_AlejandroBarrios_P2/LenguajesProyecto2/src/txt/prueba.txt"));
      }
    
    public String AbrirArchivo(File archivo){
        String documento="";
        try{
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1)
            {
                char caracter=(char)ascci;
                documento+=caracter;
            }
        }catch(Exception e){
            
        }
        return documento;
    }
    
    public String GuardarArchivos(File archivo,String documento){
        String mensaje=null;
        try{
            salida=new FileOutputStream(archivo);
            byte[] bytxt= documento.getBytes();
            salida.write(bytxt);
            mensaje="Archivo Guardado";
        }catch(Exception e){
            
        }
        return mensaje;
    }
            
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        abrirDocumento = new javax.swing.JButton();
        guardarTexto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(254, 254, 254));
        Titulo.setText("ANALIZADOR LEXICO Y SINTACTICO");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 460, 60));

        jLabel4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Seleccione su archivo de texto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 310, 30));

        abrirDocumento.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        abrirDocumento.setText("Cargar Archivo");
        abrirDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(abrirDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 160, 40));

        guardarTexto.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 15)); // NOI18N
        guardarTexto.setText("Analizar Documento");
        guardarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(guardarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 180, 50));

        txtarea.setEnabled(false);
        jScrollPane1.setViewportView(txtarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 530, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/library.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirDocumentoActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.canRead()){
                
            if(archivo.getName().endsWith("txt")){
                String documento = AbrirArchivo(archivo);
                System.out.println("Inicio documento: "+documento);
                txtarea.setText(documento);
            }else{
                JOptionPane.showMessageDialog(null,"Archivo No Compatible");
     
                
            }
            }
        }
    }//GEN-LAST:event_abrirDocumentoActionPerformed

    private void guardarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTextoActionPerformed
        // TODO add your handling code here:
     /*   if(seleccionar.showDialog(null,"Guardar")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                String Documento=txtarea.getText();
                String mensaje=GuardarArchivos(archivo, Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                   JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Guardar documento.");
            }
        }*/
         String Documento=txtarea.getText();
         
         System.out.println("show Document"+Documento);
         Automata mostrar = new Automata();
         mostrar.Automata(Documento);
         this.setVisible(false);   
         
         
        
    }//GEN-LAST:event_guardarTextoActionPerformed

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
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton abrirDocumento;
    private javax.swing.JButton guardarTexto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtarea;
    // End of variables declaration//GEN-END:variables
}
