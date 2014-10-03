package br.unifor.MeuCliente;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastrarCliente extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ManagerTelaCadastrarCliente manager;

	/**
	 * Create the panel.
	 */
	public TelaCadastrarCliente(final ManagerTelaCadastrarCliente manager) {
		this.manager = manager;
		setLayout(null);
		
		setPreferredSize(new Dimension(477, 311));
		setLayout(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setVisible(true);
		
		JLabel lblCadastrarClientes = new JLabel("Cadastrar Cliente");
		lblCadastrarClientes.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblCadastrarClientes.setBounds(104, 11, 237, 73);
		add(lblCadastrarClientes);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCnpj.setBounds(10, 139, 67, 26);
		add(lblCnpj);
		
		JLabel lblProdutoPraVenda = new JLabel("Produto pra venda:");
		lblProdutoPraVenda.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblProdutoPraVenda.setBounds(10, 217, 164, 26);
		add(lblProdutoPraVenda);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEndereo.setBounds(10, 176, 119, 26);
		add(lblEndereo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNome.setBounds(10, 98, 67, 26);
		add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(77, 95, 349, 29);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(77, 139, 349, 29);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(104, 177, 322, 29);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(171, 217, 255, 29);
		add(textField_3);
		
		JButton btnCadastrar = new JButton("VOLTAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.btnCadastrarPressionado();
			}
		});
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCadastrar.setBounds(285, 257, 141, 35);
		add(btnCadastrar);

	}
}
