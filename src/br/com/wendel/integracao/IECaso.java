/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.integracao;

import br.com.wendel.domain.Caracteristica;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author wendel
 */
public interface IECaso {
    public void salvar(Caracteristica caracteristica, String local) throws IOException;
    public Caracteristica carregar(String local) throws FileNotFoundException;
}
