/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.GUITest;

import br.com.wendel.domain.Caracteristica;
import br.com.wendel.domain.GerenteCasos;
import br.com.wendel.gui.UseCase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author wendel
 */
public class MenuBarra {
    
    public static void menuSalvar(Caracteristica caracteristica){
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Arquivo Json", "json"));
        chooser.setAcceptAllFileFilterUsed(false);
        
        File file = null;
        
        String caminho = "";
        
        int retorno = chooser.showSaveDialog(Principal.getPainel());
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = chooser.getSelectedFile().getAbsolutePath();
            try {
                new GerenteCasos().salvar(caracteristica, caminho);
            } catch (IOException ex) {
                Logger.getLogger(MenuBarra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static Caracteristica menuCarregar(){
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Arquivo Json", "json"));
        chooser.setAcceptAllFileFilterUsed(false);
        
        File file = null;
       
        String caminho = "";
        
        int retorno = chooser.showOpenDialog(Principal.getPainel());
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = chooser.getSelectedFile().getAbsolutePath();
            try {
                return new GerenteCasos().carregar(caminho);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UseCase.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return null;
    }
}
