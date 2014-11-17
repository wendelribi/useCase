/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.GUITest;

import br.com.wendel.domain.Caracteristica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author wendel
 */
public class NovoProjeto extends javax.swing.JInternalFrame {

    /**
     * Creates new form NovoProjeto
     */
    public NovoProjeto(Caracteristica caracteristica) {
        initComponents();
        novoCaso();
        this.caracteristica = caracteristica;
    }
    
    private String getId(){
        return idTxt.getText();
    }
    private String getNome(){
        return nomeTxt.getText();
    }
    private Caracteristica preencheCaracteristica(){
        return new Caracteristica(getId(), getNome());
    }
    
    private void caso(){
        CasoUso casoUso = new CasoUso(preencheCaracteristica());
        Principal.getPainel().add(casoUso);
        this.setVisible(false);
        casoUso.setVisible(true);
    }
    
    
    private void novoCaso(){
        botaoNovoCaso.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                caso();
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nomeTxt = new javax.swing.JTextField();
        botaoNovoCaso = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setTitle("Projeto");
        setAutoscrolls(true);

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        botaoNovoCaso.setText("Novo Caso");

        botaoSalvar.setText("Salvar");

        botaoCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoNovoCaso)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTxt)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovoCaso)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCancelar))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Caracteristica caracteristica;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoNovoCaso;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nomeTxt;
    // End of variables declaration//GEN-END:variables
}
