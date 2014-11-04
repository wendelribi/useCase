/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.gui;

import br.com.wendel.domain.Caracteristica;
import br.com.wendel.domain.CasoDeUso;
import br.com.wendel.domain.Fluxo;
import br.com.wendel.domain.GerenteCasos;
import br.com.wendel.domain.Passo;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.ScrollPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTree;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author wendel
 */
public class TestesPainel extends javax.swing.JPanel {

    /**
     * Creates new form TestesPainel
     */
    
    public TestesPainel() {
        initComponents();
        
    }

    public void abrirArquivoJson() {
        Caracteristica caracteristica;
        JFileChooser chooser = new JFileChooser();
        
        chooser.setFileFilter(new FileNameExtensionFilter("Arquivo Json", "json"));
        chooser.setAcceptAllFileFilterUsed(false);
        File file = null;
        
        String caminho = "";
        int retorno = chooser.showOpenDialog(null);
        
        if (retorno == JFileChooser.APPROVE_OPTION) {
            
            caminho = chooser.getSelectedFile().getAbsolutePath();

            try {
                caracteristica = new GerenteCasos().carregar(caminho);
                criaArvore(caracteristica);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UseCase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    public void criaArvore(Caracteristica caracteristica) {
        try {
            DefaultMutableTreeNode feature = new DefaultMutableTreeNode("Caracteristica-" + caracteristica.getNome());

            feature.add(new DefaultMutableTreeNode(caracteristica.getNome()));
            feature.add(new DefaultMutableTreeNode(caracteristica.getId()));

            for (CasoDeUso c : caracteristica.getListaDeCasos()) {
                
                DefaultMutableTreeNode useCase = new DefaultMutableTreeNode("Caso de Uso");

                feature.add(useCase);
                
                useCase.add(new DefaultMutableTreeNode(c.getNome()));
                useCase.add(new DefaultMutableTreeNode(c.getId()));
                useCase.add(new DefaultMutableTreeNode(c.getDescricao()));

                for (Fluxo f : c.getFluxo()) {

                    DefaultMutableTreeNode flow = new DefaultMutableTreeNode("Fluxo");
                    
                    useCase.add(flow);
                    
                    flow.add(new DefaultMutableTreeNode(f.getId()));
                    flow.add(new DefaultMutableTreeNode(f.getNome()));
                    flow.add(new DefaultMutableTreeNode(f.getFromStep()));
                    flow.add(new DefaultMutableTreeNode(f.getToStep()));
                    flow.add(new DefaultMutableTreeNode(f.getDescricao()));

                    for (Passo p : f.getListaDePassos()) {

                        DefaultMutableTreeNode step = new DefaultMutableTreeNode("Passos");
                        
                        flow.add(step);
                        
                        step.add(new DefaultMutableTreeNode(p.getId()));
                        step.add(new DefaultMutableTreeNode(p.getCondicao()));
                        step.add(new DefaultMutableTreeNode(p.getAcao()));
                        step.add(new DefaultMutableTreeNode(p.getResposta()));
                    }
                }
            }
            jScrollPane1.setViewportView(new JTree(feature));
            //repaint();
        } catch (Exception e) {
            System.err.println("Cancelado");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
