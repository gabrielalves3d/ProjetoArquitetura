/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.dao;


import br.edu.ifpe.model.Insumo;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Alves
 */
public class RepositorioInsumoImplBANCO implements RepositorioGenerico<Insumo, Integer> {
    
    @Override
    public void inserir(Insumo t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Insumo t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Insumo recuperar(Integer g) {
        try{
           return (Insumo) DaoManagerHiber.getInstance().recover("from Insumo where codigo="+g).get(0);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }

    @Override
    public void excluir(Insumo t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Insumo");
    }

}
