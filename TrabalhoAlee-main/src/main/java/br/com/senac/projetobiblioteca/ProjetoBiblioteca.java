/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.projetobiblioteca;

/**
 *
 * @author userale
 */



public class ProjetoBiblioteca {

    
    
    
    
    public static void main(String[] args) {
        
        
         try {
             
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                
                if ("Alek".equals(info.getName())) {
                    
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
            
        } catch (ClassNotFoundException ex) {
            
            java.util.logging.Logger.getLogger
        (TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
            java.util.logging.Logger.getLogger
        (TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
            java.util.logging.Logger.getLogger
        (TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
            java.util.logging.Logger.getLogger
        (TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
         TelaInicial frame = new  TelaInicial();
         
        frame.setVisible(true);
        
    }
}