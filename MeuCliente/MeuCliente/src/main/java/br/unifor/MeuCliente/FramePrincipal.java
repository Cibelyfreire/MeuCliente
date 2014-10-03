package br.unifor.MeuCliente;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class FramePrincipal extends JFrame{
	
	private static final long serialVersionUID = 3577900688565338673L;

	private ManagerTelaHome managerTelaHome;
	private ManagerTelaCliente managerTelaCliente;
	private ManagerTelaCadastrarCliente managerTelaCadastrarCliente;
	private ManagerTelaVenda managerTelaVenda;
	//private ManagerClienteCadastrado managerClienteCadastrado;
	private ManagerTelaCadastrarVenda managerTelaCadastrarVenda;

	/**
	 * Cria o frame.
	 */
	public FramePrincipal() {
		setTitle("Meu Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mudarLookAndFeel();
		inicializarManagers();
		setContentPane(managerTelaHome.getTela());
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/**
	 * Instancia todos os managers.
	 */
	public void inicializarManagers() {
		
		managerTelaHome = new ManagerTelaHome(this);
		managerTelaCliente = new ManagerTelaCliente(this);
		managerTelaCadastrarCliente = new ManagerTelaCadastrarCliente(this);
		managerTelaVenda = new ManagerTelaVenda(this);
		//managerClienteCadastrado = new ManagerClienteCadastrado(this);
		//managerTelaCadastrarVenda = new ManagerTelaCadastrarVenda(this);
	}

	/**
	 * Tenta mudar o look and feel para "Nimbus".
	 */
	public void mudarLookAndFeel() {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Exibe a tela TelaHome no frame.
	 */
	public void mostrarTelaHome() {
		setContentPane(managerTelaHome.getTela());
		pack();
	}

	/**
	 * Exibe a tela TelaCliente no frame.
	 */
	public void mostrarTelaCliente() {
		setContentPane(managerTelaCliente.getTela());
		pack();
	}

	/**
	 * Exibe a tela TelaCadastrarCliente no frame.
	 */
	public void mostrarTelaCadastrarCliente() {
		setContentPane(managerTelaCadastrarCliente.getTela());
		pack();
	}

	/**
	 * Exibe a tela TelaVenda no frame.
	 */
	public void mostrarTelaVenda() {
		setContentPane(managerTelaVenda.getTela());
		pack();
	}

	/**
	 * Exibe a tela TelaCadastrarVenda no frame.
	 */
	public void mostrarTelaCadastrarVenda() {
		setContentPane(managerTelaCadastrarVenda.getTela());
		pack();
	}

	

}
