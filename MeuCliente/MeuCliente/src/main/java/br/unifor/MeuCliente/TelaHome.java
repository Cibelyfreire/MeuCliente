package br.unifor.MeuCliente;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaHome extends JPanel{

	private ManagerTelaHome manager;

	/**
	 * Create the application.
	 * @param managerTelaHome 
	 */
	public TelaHome(ManagerTelaHome manager) {
		
	    this.manager = manager;
		
	    setPreferredSize(new Dimension(424, 242));
		setLayout(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btnCliente = new JButton("Clientes");
		btnCliente.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnClientePressionado(); 
			}
		});
		btnCliente.setBounds(24, 182, 107, 38);
		add(btnCliente);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnVendasPressionado(); 
			}
		});
		btnVendas.setBounds(165, 182, 107, 38);
		add(btnVendas);
		
		JLabel lblMyClient = new JLabel("Meu Cliente");
		lblMyClient.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMyClient.setBounds(24, 11, 206, 104);
		add(lblMyClient);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSair.setBounds(307, 182, 107, 38);
		add(btnSair);
	}
	
	public void btnClientePressionado() {
		manager.btnCliente();
	}
	
	public void btnVendasPressionado() {
		manager.btnVendas();
	}
}
