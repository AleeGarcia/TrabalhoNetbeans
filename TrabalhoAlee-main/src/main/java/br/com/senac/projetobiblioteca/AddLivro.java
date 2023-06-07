/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

/**
 *
 * @author userale
 */
public class AddLivro {
    
     private BibliDuAlee bibliduAle;
    
    public AddLivro() {
        
        initDados();
        
    }
    
    private void initDados(){
        
        this.bibliduAle = new BibliDuAlee("Ale");
        
        this.bibliduAle.addLivroAluguel(new Alugar("1914","LucasArts","Drama"));
        
         this.bibliduAle.addLivroVenda(new Venda("Star Wars","LucasArts","Sci-fi","15,00"));
         
        this.bibliduAle.addCliente(new Clientes("Bryan","28472837","1836"));
    }
    public BibliDuAlee getBiblioteca(){
        
        return this.bibliduAle;
        
    }
}
