/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controller;

import br.edu.ifpe.dao.FactoryRepositorios;
import br.edu.ifpe.dao.RepositorioGenerico;
import br.edu.ifpe.model.Insumo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel Alves
 */
@ManagedBean
@SessionScoped
public class InsumoController {
    RepositorioGenerico<Insumo, Integer> repositorioInsumo = null;
    
    private Insumo selected =null;
    
    
    public Insumo getSelected(){
        return selected;
    }
    public void setSelected(Insumo selected){
        this.selected=selected;
    }public InsumoController() {
        this.repositorioInsumo = FactoryRepositorios.fabricarRepositorio(
                FactoryRepositorios.INSUMO, FactoryRepositorios.BANCODADOS);
    }
    public String inserir(Insumo insumo) {
        this.repositorioInsumo.inserir(insumo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O insumo foi criado com sucesso"));
        
        return "ApresentarInsumo.xhtml";
    }
     
     public String alterar(Insumo t){
        this.repositorioInsumo.alterar(t);
        return "ApresentarInsumo.xhtml";
     }

    public Insumo recuperarInsumo(int codigo) {
        
        return this.repositorioInsumo.recuperar(codigo);
    }

    public void excluir(Insumo t) {
        this.repositorioInsumo.excluir(t);
    }

    public List<Insumo> recuperarTodos() {
        return this.repositorioInsumo.recuperarTodos();
    }
    
    
}
