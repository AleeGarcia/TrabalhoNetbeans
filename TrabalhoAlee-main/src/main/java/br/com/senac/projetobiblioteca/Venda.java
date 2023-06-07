/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

/**
 *
 * @author userale
 */

public class Venda {
    
    private int LivroVendaid;
    
    private String titulo;
    
    private String autor;
    
    private String genero;
    
    private String preço;
    

    public Venda(
            
            String titulo, String autor, String genero, String preco
    )
            
            
            
                 
    {
        this.titulo = titulo;
        
        this.autor = autor;
        
        this.genero = genero;
        
        this.preço = preco;
        
    }

    public int getId() {
        
        return LivroVendaid;
        
    }

    public String getTitulo() {
        
        return titulo;
        
    }

    public String getAutor() {
        
        return autor;
        
    }

    public String getGenero() {
        
        return genero;
        
    }
    
    public String getPreço(){
        
        return preço;
        
    }
        
    public void setId(int id) {
        
        this.LivroVendaid = id;
        
    }
}
