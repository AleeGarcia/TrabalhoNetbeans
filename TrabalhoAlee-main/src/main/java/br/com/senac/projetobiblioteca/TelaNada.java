/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.projetobiblioteca;

/**
 *
 * @author userale
 */
public class TelaNada extends javax.swing.JDialog {
   
    
    public TelaNada(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ImagemErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MDS NÃO AGUENTO MAIS JAVA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 320, 300, 25);

        ImagemErro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/WhatsApp Image 2023-04-10 at 21.15.18 (1).jpeg"))); // NOI18N
        getContentPane().add(ImagemErro);
        ImagemErro.setBounds(0, 0, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                TelaNada dialog = new TelaNada(new javax.swing.JFrame(), true);
                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        
                        System.exit(0);
                        
                    }
                });
                
                dialog.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemErro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
