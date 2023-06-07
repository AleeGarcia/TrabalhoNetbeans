/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author userale
 */
public class BibliDuAlee {
    private String nome;
    private List<Clientes> clientes;
    private List<Venda> livrosVendas;
    private List<Alugar> livrosAluguel;
    private int idCounter = 0;
    
    public BibliDuAlee (String nome){
        this.nome = nome ;
        this.clientes = new ArrayList<>();
        this.livrosVendas = new ArrayList<>();
        this.livrosAluguel = new ArrayList<>();
}
        public BibliDuAlee getBiblioteca(){
        return this;
    }
        public void addCliente(Clientes cliente){
        cliente.setUserId(++this.idCounter);
        this.clientes.add(cliente);
    }
            public void editCliente(Clientes cliente){
        if(cliente.getUserId()> 0){
            int index = this.clientes.indexOf(cliente);
            if(index >= 0)
                this.clientes.set(index, cliente);
        } else {
            addCliente(cliente);
        }
    }
        public void removerCliente(Clientes cliente){
        this.clientes.remove(cliente);
    }
         public List<Clientes> findClientes(String nomecompleto, String celular){
        List<Clientes> resultadoClientes = new ArrayList<>();
        for (Clientes cliente : this.clientes) {
            if(cliente.getNome().equals(nomecompleto))
                resultadoClientes.add(cliente);
            else if(cliente.getCelular().equals(celular))
                resultadoClientes.add(cliente);
        }
        return resultadoClientes;
    }
    public String getNomeCliente() {
        return nome;
    }
    public List<Clientes> getClientes() {
        return clientes;
    };
         
               public void addLivroVenda(Venda livrosVenda){
        livrosVenda.setId(++this.idCounter);
        this.livrosVendas.add(livrosVenda);
    }
            public void editLivroVenda(Venda livrosVenda){
        if(livrosVenda.getId()> 0){
            int index = this.livrosVendas.indexOf(livrosVenda);
            if(index >= 0)
                this.livrosVendas.set(index, livrosVenda);
        } else {
            addLivroVenda(livrosVenda);
        }
    }
                public void removeLivroVenda(Venda livrosVenda){
        this.livrosVendas.remove(livrosVenda);
    }
         public List<Venda> findLivroVenda(String titulo, String autor, String genero){
        List<Venda> resultadoVendas = new ArrayList<>();
        for (Venda livrosvenda : this.livrosVendas) {
            if(livrosvenda.getTitulo().equals(titulo))
                resultadoVendas.add(livrosvenda);
            else if(livrosvenda.getAutor().equals(autor))
                resultadoVendas.add(livrosvenda);
            else if(livrosvenda.getGenero().equals(genero))
                resultadoVendas.add(livrosvenda);
        }
        return resultadoVendas;
    }
    public String getNomeVenda() {
        return nome;
    }

    public List<Venda> getLivrosVenda() {
        return livrosVendas;
    };
                        
        public void addLivroAluguel(Alugar livrosAluguel){
        livrosAluguel.setId(++this.idCounter);
        this.livrosAluguel.add(livrosAluguel);
    }
            public void editLivroAluguel(Alugar livrosAluguel){
        if(livrosAluguel.getId()> 0){
            int index = this.livrosAluguel.indexOf(livrosAluguel);
            if(index >= 0)
                this.livrosAluguel.set(index, livrosAluguel);
        } else {
            addLivroAluguel(livrosAluguel);
        }
    }
                public void removeLivroAluguel(Alugar livrosAluguel){
        this.livrosAluguel.remove(livrosAluguel);
    }
        public List<Alugar> findLivroAluguel(String titulo, String autor, String genero){
        List<Alugar> resultadoAluguel = new ArrayList<>();
        for (Alugar livrosaluguel : this.livrosAluguel) {
            if(livrosaluguel.getTitulo().equals(titulo))
                resultadoAluguel.add(livrosaluguel);
            else if(livrosaluguel.getAutor().equals(autor))
                resultadoAluguel.add(livrosaluguel);
            else if(livrosaluguel.getGenero().equals(genero))
                resultadoAluguel.add(livrosaluguel);
        }
        return resultadoAluguel;
    }
    public String getNomeAluguel() {
        return nome;
    }
    public List<Alugar> getLivrosAluguel() {
        return livrosAluguel;
    }
}
