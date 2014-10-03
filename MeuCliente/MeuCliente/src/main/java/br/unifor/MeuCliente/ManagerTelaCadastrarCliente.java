package br.unifor.MeuCliente;

import java.awt.Container;

public class ManagerTelaCadastrarCliente extends Manager{
	
	private TelaCadastrarCliente tela;
	
	public ManagerTelaCadastrarCliente(FramePrincipal frame) {
		super(frame);
		// TODO Auto-generated constructor stub
		this.tela = new TelaCadastrarCliente(this);
	}

		public TelaCadastrarCliente getTela() {
		return tela;
	}

		/**
		 * Operacao relativa ao botao Cadastrar.
		 */
		public void btnCadastrarPressionado() {
			getFrame().mostrarTelaCliente();
		} 	
}
