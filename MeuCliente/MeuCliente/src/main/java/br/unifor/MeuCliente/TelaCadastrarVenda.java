package br.unifor.MeuCliente;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class TelaCadastrarVenda extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public TelaCadastrarVenda() {
		setLayout(null);
		
		JLabel lblCadastrarVenda = new JLabel("Cadastrar Venda");
		lblCadastrarVenda.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblCadastrarVenda.setBounds(86, 22, 251, 33);
		add(lblCadastrarVenda);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEmpresa.setBounds(10, 82, 88, 39);
		add(lblEmpresa);
		
		JLabel lblProdutoVendido = new JLabel("Produto vendido:");
		lblProdutoVendido.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblProdutoVendido.setBounds(10, 134, 145, 39);
		add(lblProdutoVendido);
		
		JLabel lblQuentidade = new JLabel("Quantidade:");
		lblQuentidade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblQuentidade.setBounds(10, 187, 112, 39);
		add(lblQuentidade);
		
		textField = new JTextField();
		textField.setBounds(163, 82, 260, 27);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(163, 134, 260, 27);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(163, 187, 260, 27);
		add(textField_2);

	}

}
