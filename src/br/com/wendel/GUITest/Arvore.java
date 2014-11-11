/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.GUITest;

import br.com.wendel.domain.Caracteristica;
import br.com.wendel.domain.CasoDeUso;
import br.com.wendel.domain.Fluxo;
import br.com.wendel.domain.Passo;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author wendel
 */
public class Arvore {
    public static JTree criarArvore(Caracteristica caracteristica){
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
            
            return new JTree(feature);
        }
        catch(Exception e){
            System.out.println("Erro");
        }
        return null;
    }
}
