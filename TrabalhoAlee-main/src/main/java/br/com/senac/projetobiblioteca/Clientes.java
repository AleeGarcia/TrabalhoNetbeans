/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

/**
 *
 * @author userale
 */

public class Clientes {
    
 private int userid;
 
 private String nome;
 
 private String telefone;
 
 private String senha;


    public Clientes 
           ( String nomecompleto , String telefone , String senha)
           
                   {
                       
       this.nome = nomecompleto;
       
       this.telefone = telefone;
       
       this.senha = senha;
       
                   
    }
    public int getUserId(){
        
        return userid;
    }
    public String getNome(){
        
        return nome;
    }
    
    public String getCelular(){
        
        return telefone;
    }
    
    public String getSenha(){
        
        return senha;
    }
       public void setUserId(int id) {
           
        this.userid = id;
    }


}
