/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controller;
import br.edu.ifpe.model.Insumo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Gabriel Alves
 */
@ManagedBean
@RequestScoped
public class BuilderInsumo {
    private int codInsumo;
    private String nome;
    private String tipoUnidade;
    private double quantidade;

    public String getNome() {
        return nome;
    }

   

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public int getCodInsumo() {
        return codInsumo;
    }


    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    public Insumo buildInsumo(){
        return new Insumo(codInsumo,nome,tipoUnidade,quantidade);
    }

}
