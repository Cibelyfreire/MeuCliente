package br.unifor.MeuCliente;

import java.awt.Container;

public class ManagerTelaVenda extends Manager{
	
	private TelaVenda tela;

	public ManagerTelaVenda(FramePrincipal frame) {
		super(frame);
		// TODO Auto-generated constructor stub
		this.tela = new TelaVenda(this);
	}
	
	public TelaVenda getTela() {
		return tela;
	}
	
	/**
	 * Operacao relativa ao botao Cadastrar.
	 */
	public void btnVendaPressionado() {
		getFrame().mostrarTelaVenda();
	} 	

}
