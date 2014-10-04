package br.unifor.MeuCliente;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class TelaCliente extends JPanel {
	
	private static final long serialVersionUID = 2857670324681532711L;
	
	private ManagerTelaCliente manager;

	/**
	 * Create the panel.
	 * @param managerTelaCliente 
	 */
	public TelaCliente(ManagerTelaCliente manager) {
		this.manager = manager;
		
		setPreferredSize(new Dimension(391, 230));
		setLayout(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setVisible(true);
		
		
		
		JButton btnCadastrarNovoCliente = new JButton("Cadastrar novo cliente");
		btnCadastrarNovoCliente.setFont(new Font("Arial", Font.BOLD, 18));
		btnCadastrarNovoCliente.setBounds(152, 170, 229, 49);
		btnCadastrarNovoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadastrarNovoClientePressionado();
			}
		});
		add(btnCadastrarNovoCliente);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblClientes.setBounds(141, 11, 134, 49);
		add(lblClientes);
	}
	
	public void btnCadastrarNovoClientePressionado() {
		manager.btnCadastrarNovoClientePressionado();
	}
}
