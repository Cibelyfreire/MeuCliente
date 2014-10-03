package br.unifor.MeuCliente;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class TelaVenda extends JPanel {

	private ManagerTelaVenda manager;

	/**
	 * Create the panel.
	 * @param manager 
	 */
	public TelaVenda(ManagerTelaVenda manager) {
		this.manager = manager;
		
		setPreferredSize(new Dimension(468, 241));
		setLayout(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setVisible(true);
		setLayout(null);
		
		JLabel lblVendas = new JLabel("Vendas");
		lblVendas.setBounds(180, 22, 89, 36);
		lblVendas.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		add(lblVendas);
		
		JButton btnAgendarPrximaVisita = new JButton("Agendar próxima visita");
		btnAgendarPrximaVisita.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAgendarPrximaVisita.setBounds(0, 163, 230, 36);
		add(btnAgendarPrximaVisita);
		
		JButton btnCadastrarVenda = new JButton("Cadastrar \r\nvenda");
		btnCadastrarVenda.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCadastrarVenda.setBounds(0, 69, 170, 36);
		btnCadastrarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVendaPressionado();
			}
		});
		add(btnCadastrarVenda);
		
		
		JButton btnAgendamentos = new JButton("Agendamentos");
		btnAgendamentos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAgendamentos.setBounds(0, 116, 159, 36);
		add(btnAgendamentos);

	}

	public void btnVendaPressionado() {
		manager.btnVendaPressionado();
	}
}
