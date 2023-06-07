/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.projetobiblioteca;

/**
 *
 * @author userale
 */
public class TelaCadastrarLivros extends javax.swing.JDialog {
    
private AddLivro dados;

    public TelaCadastrarLivros(java.awt.Frame parent,AddLivro dados) {
        
        super(parent);
        
        this.dados = dados;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBremoveLivro = new javax.swing.JButton();
        JLnomeCadastroLivro = new javax.swing.JLabel();
        JLautorCadastroLivro = new javax.swing.JLabel();
        JLgeneroCadastroLivro = new javax.swing.JLabel();
        JTFnomeCadastroLivro = new javax.swing.JTextField();
        JTFautorCadastroLivro = new javax.swing.JTextField();
        JTFgeneroCadastroLivro = new javax.swing.JTextField();
        JBconfirmCadastroLivro = new javax.swing.JButton();
        JBconfirmVendaCadastroLivro = new javax.swing.JButton();
        JLpreçoCadastroLivro = new javax.swing.JLabel();
        JTFpreçoCadastroLivro = new javax.swing.JTextField();

        JBremoveLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBremoveLivro.setText("REMOVE");
        JBremoveLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBremoveLivroActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JLnomeCadastroLivro.setText("Titulo Livro");

        JLautorCadastroLivro.setText("Autor Livro");

        JLgeneroCadastroLivro.setText("Genero Livro");

        JBconfirmCadastroLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBconfirmCadastroLivro.setText("LIVRO ALUGAR");
        JBconfirmCadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBconfirmCadastroLivroActionPerformed(evt);
            }
        });

        JBconfirmVendaCadastroLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBconfirmVendaCadastroLivro.setText("LIVRO VENDER");
        JBconfirmVendaCadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBconfirmVendaCadastroLivroActionPerformed(evt);
            }
        });

        JLpreçoCadastroLivro.setText("Valor Livro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFnomeCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLgeneroCadastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(JTFpreçoCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLautorCadastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFautorCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLpreçoCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFgeneroCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLnomeCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(JBconfirmVendaCadastroLivro)
                .addGap(48, 48, 48)
                .addComponent(JBconfirmCadastroLivro)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(JLnomeCadastroLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnomeCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLgeneroCadastroLivro)
                    .addComponent(JTFpreçoCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(JLautorCadastroLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFautorCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLpreçoCadastroLivro)
                    .addComponent(JTFgeneroCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBconfirmVendaCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBconfirmCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBconfirmCadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBconfirmCadastroLivroActionPerformed
         Alugar alee = new Alugar(
                 
                 this.JTFnomeCadastroLivro.getText(),
                 
                 this.JTFautorCadastroLivro.getText(),
                 
                 this.JTFgeneroCadastroLivro.getText());
         
    this.dados.getBiblioteca().addLivroAluguel(alee);
    this.dispose();
    }//GEN-LAST:event_JBconfirmCadastroLivroActionPerformed

    private void JBconfirmVendaCadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBconfirmVendaCadastroLivroActionPerformed
         Venda alee = new Venda(
                 
                 this.JTFnomeCadastroLivro.getText(),
                 
                 this.JTFautorCadastroLivro.getText(),
                 
                 this.JTFgeneroCadastroLivro.getText(),
                 
                 this.JTFpreçoCadastroLivro.getText());
         
    this.dados.getBiblioteca().addLivroVenda(alee);
    
    this.dispose();
    }//GEN-LAST:event_JBconfirmVendaCadastroLivroActionPerformed

    private void JBremoveLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBremoveLivroActionPerformed
         Alugar alee = new Alugar(
                 
                 this.JTFnomeCadastroLivro.getText(),
                 
                 this.JTFautorCadastroLivro.getText(),
                 
                 this.JTFgeneroCadastroLivro.getText());
         
    this.dados.getBiblioteca().removeLivroAluguel(alee);
    
    this.dispose();
    
    }//GEN-LAST:event_JBremoveLivroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBconfirmCadastroLivro;
    private javax.swing.JButton JBconfirmVendaCadastroLivro;
    private javax.swing.JButton JBremoveLivro;
    private javax.swing.JLabel JLautorCadastroLivro;
    private javax.swing.JLabel JLgeneroCadastroLivro;
    private javax.swing.JLabel JLnomeCadastroLivro;
    private javax.swing.JLabel JLpreçoCadastroLivro;
    private javax.swing.JTextField JTFautorCadastroLivro;
    private javax.swing.JTextField JTFgeneroCadastroLivro;
    private javax.swing.JTextField JTFnomeCadastroLivro;
    private javax.swing.JTextField JTFpreçoCadastroLivro;
    // End of variables declaration//GEN-END:variables
}