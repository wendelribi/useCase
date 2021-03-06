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

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author wendel
 */

public class UseCase extends javax.swing.JFrame {

    /**
     * Creates new form UseCase
     */
    public UseCase() {
        initComponents();
        carregarAction();
    }
    private static UseCase p;

    
    /**
     * 
     * @return Retorna uma instancia da Clasee UseCase
     */
    public static UseCase getInstance() {
        if (p == null) {
            p = new UseCase();
        }
        return p;
    }

    public static JPanel getPainel() {
        return getInstance().painelPrincipal;
    }
    
    public void verificaExistenciaCaracteristica(java.awt.event.ActionEvent evt){
        if(!(caracteristica == null)){
            int op =JOptionPane.showConfirmDialog(getPainel(), "Gostaria de salvar o Projeto antes de continuar?");
            if(op==0){
                try {
                    salvarCaracActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(UseCase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        painelPrincipal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        novo = new javax.swing.JMenuItem();
        salvarCarac = new javax.swing.JMenuItem();
        carregar = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("MessagesBundle_pt_BR"); // NOI18N
        jMenu1.setText(bundle.getString("PROJETO")); // NOI18N

        novo.setText(bundle.getString("NOVO")); // NOI18N
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        jMenu1.add(novo);

        salvarCarac.setText(bundle.getString("SALVAR")); // NOI18N
        jMenu1.add(salvarCarac);

        carregar.setText("Carregar");
        jMenu1.add(carregar);

        exit.setText(bundle.getString("SAIR")); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        verificaExistenciaCaracteristica(evt);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        verificaExistenciaCaracteristica(evt);
        caracteristica=new Caracteristica();
        Projeto obj = new Projeto(caracteristica);
        UseCase.getPainel().add(obj);
        obj.setVisible(true);
        
        getPainel().validate();

    }//GEN-LAST:event_novoActionPerformed
    
    private void salvarCaracActionPerformed(ActionEvent evt) throws IOException{
    	JFileChooser chooser = new JFileChooser();
    	chooser.setFileFilter(new FileNameExtensionFilter("Arquivo Json", "json"));
    	chooser.setAcceptAllFileFilterUsed(false);
    	File file = null;
    	String caminho = "";
    	int retorno = chooser.showSaveDialog(null);
    	try{
    		if (retorno == JFileChooser.SAVE_DIALOG) {
    			caminho = chooser.getSelectedFile().getAbsolutePath();
    		    new GerenteCasos().salvar(caracteristica, caminho);
    		}
    	}catch (Exception e){
            
    	}
    }
    
    private void carregarActionPerformed(java.awt.event.ActionEvent evt, Caracteristica caracteristica) {                                         
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Arquivo Json", "json"));
        chooser.setAcceptAllFileFilterUsed(false);
        File file = null;
        String caminho = "";
        int retorno = chooser.showSaveDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = chooser.getSelectedFile().getAbsolutePath();
            try {
                caracteristica = new GerenteCasos().carregar(caminho);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UseCase.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        criarArvore(caracteristica);
    }
    private void carregarAction(){
        carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarActionPerformed(evt, caracteristica);
            }
        });
    }
    public void criarArvore(Caracteristica caracteristica){
        try {
            DefaultMutableTreeNode feature = new DefaultMutableTreeNode(caracteristica.getNome());

            feature.add(new DefaultMutableTreeNode(caracteristica.getNome()));
            feature.add(new DefaultMutableTreeNode(caracteristica.getId()));

            for (CasoDeUso c : caracteristica.getListaDeCasos()) {
                DefaultMutableTreeNode useCase = new DefaultMutableTreeNode(c.getNome());

                feature.add(useCase);
                useCase.add(new DefaultMutableTreeNode(c.getNome()));
                useCase.add(new DefaultMutableTreeNode(c.getId()));
                useCase.add(new DefaultMutableTreeNode(c.getDescricao()));

                for (Fluxo f : c.getFluxo()) {
                    DefaultMutableTreeNode flow = new DefaultMutableTreeNode(f.getNome());
                    useCase.add(flow);
                    flow.add(new DefaultMutableTreeNode(f.getId()));
                    flow.add(new DefaultMutableTreeNode(f.getNome()));
                    flow.add(new DefaultMutableTreeNode(f.getFromStep()));
                    flow.add(new DefaultMutableTreeNode(f.getToStep()));
                    flow.add(new DefaultMutableTreeNode(f.getDescricao()));

                    for (Passo p : f.getListaDePassos()) {
                        DefaultMutableTreeNode step = new DefaultMutableTreeNode(p.getId());
                        flow.add(step);
                        step.add(new DefaultMutableTreeNode(p.getId()));
                        step.add(new DefaultMutableTreeNode(p.getCondicao()));
                        step.add(new DefaultMutableTreeNode(p.getAcao()));
                        step.add(new DefaultMutableTreeNode(p.getResposta()));
                    }
                }
            }
            
            final JTree t = new JTree(feature);
            jScrollPane2.setViewportView(t);
            t.addMouseListener(new MouseListener()  {

                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println(e.getButton());
                    System.out.println(t.getAnchorSelectionPath());
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
            
            repaint();
        }
        catch(Exception e){

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UseCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UseCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UseCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UseCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getInstance().setVisible(true);
            }
        });
    }

    private JTree tree;
    private DefaultMutableTreeNode noPai;
    private Caracteristica caracteristica;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem carregar;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem novo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JMenuItem salvarCarac;
    // End of variables declaration//GEN-END:variables
}
