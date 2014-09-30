package br.com.wendel.gui;

import java.awt.Event;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class UseCase extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnCriar;
	private JButton btnCancelar;
	private JLabel lblNome;
	private JLabel lblDescrio;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtDescricao;
	ArrayList<String> listaInf = new ArrayList<String>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UseCase frame = new UseCase();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UseCase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		btnCriar = new JButton("Criar");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCriar, 105, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCriar, -10, SpringLayout.SOUTH, contentPane);
		btnCriar.addActionListener(this);
		contentPane.add(btnCriar);
		
		btnCancelar = new JButton("Cancelar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnCriar);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCancelar, 51, SpringLayout.EAST, btnCriar);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCancelar, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCancelar, -120, SpringLayout.EAST, contentPane);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
		
		JLabel lblId = new JLabel("ID");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblId, 60, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblId, 60, SpringLayout.WEST, contentPane);
		contentPane.add(lblId);
		
		lblNome = new JLabel("NOME");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNome, 45, SpringLayout.SOUTH, lblId);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNome, 0, SpringLayout.WEST, lblId);
		contentPane.add(lblNome);
		
		lblDescrio = new JLabel("DESCRIÇÃO");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDescrio, 0, SpringLayout.WEST, lblId);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblDescrio, -35, SpringLayout.NORTH, btnCriar);
		contentPane.add(lblDescrio);
		
		txtId = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtId, -2, SpringLayout.NORTH, lblId);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtId, 0, SpringLayout.WEST, btnCancelar);
		txtId.setText("id");
		txtId.addActionListener(this);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setText("nome");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNome, 0, SpringLayout.NORTH, lblNome);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNome, 0, SpringLayout.EAST, txtId);
		txtId.addActionListener(this);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtDescricao = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDescricao, -2, SpringLayout.NORTH, lblDescrio);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDescricao, 0, SpringLayout.WEST, btnCancelar);
		txtDescricao.setText("descrição");
		txtDescricao.addActionListener(this);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCriar){
			System.out.println("CLICOU EM Okkkk");
		}
		else if(e.getSource()==btnCancelar){
			System.out.println("Cancelou");
		}
	}
}
