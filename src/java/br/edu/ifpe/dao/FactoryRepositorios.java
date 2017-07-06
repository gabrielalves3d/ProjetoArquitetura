/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.dao;


/**
 *
 * @author Gabriel Alves
 */
public class FactoryRepositorios {

    public static final int INSUMO = 1;
    public static final int ITEMINSUMO = 2;
    public static final int PRATO = 3;
    public static final int CARDAPIO = 4;
    public static final int BANCODADOS = 1;

    public static RepositorioGenerico fabricarRepositorio(int tipoNegocio, int tipoPersistencia) {
        if (tipoPersistencia == BANCODADOS) {
            switch (tipoNegocio) {
                case 1:
                    return new RepositorioInsumoImplBANCO();
                default:
                    break;
            }
        }
        return null;
    }
}
