package com.xbrain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double valor;
    private Integer qtd;

    public Produto(){}

    public Produto(Integer id, String nome, Double valor, Integer qtd){
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getValor(){
        return this.valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public Integer getQtd(){
        return this.qtd;
    }

    public void setQtd(Integer qtd){
        this.qtd = qtd;
    }

    @Override
    public String toString(){
        return "Produto: id=" + this.id + ", nome=" + this.nome + ", valor=" + this.valor;
    }
    
}
