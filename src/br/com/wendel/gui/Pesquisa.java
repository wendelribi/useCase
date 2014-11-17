/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.gui;

import br.com.wendel.domain.Caracteristica;
import br.com.wendel.domain.CasoDeUso;

/**
 *
 * @author wendel
 */
public class Pesquisa {
    private Caracteristica caracteristica;
    private String nomeCaracteristica;
    private String caso;
    private String fluxo;
    private String passo;
    
    public Pesquisa(Caracteristica caracteristica, String nomeCaracteristica){
        this.caracteristica = caracteristica;
        this.nomeCaracteristica = nomeCaracteristica;
    }
    
    public Pesquisa(Caracteristica caracteristica, String nomeCaracteristica, String caso){
        this.caracteristica = caracteristica;
        this.nomeCaracteristica = nomeCaracteristica;
        this.caso = caso;
    }
    
    public Pesquisa(Caracteristica caracteristica, String nomeCaracteristica, String caso, String fluxo){
        this.caracteristica = caracteristica;
        this.nomeCaracteristica = nomeCaracteristica;
        this.caso = caso;
        this.fluxo = fluxo;
    }
    
    public Pesquisa(Caracteristica caracteristica, String nomeCaracteristica, String caso, String fluxo, String passo){
        this.caracteristica = caracteristica;
        this.nomeCaracteristica = nomeCaracteristica;
        this.caso = caso;
        this.fluxo = fluxo;
        this.passo = passo;
    }
    
    public int pesquisaCaso(Pesquisa p){
        for(CasoDeUso c : p.caracteristica.getListaDeCasos()){
            if(c.equals(caso)){
                return p.caracteristica.getListaDeCasos().indexOf(c);
            }
        }
        return 53;
    }
}
