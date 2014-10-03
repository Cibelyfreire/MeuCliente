package br.unifor.MeuCliente;

public class ManagerTelaCliente extends Manager{
	
	private TelaCliente tela;

	public ManagerTelaCliente(FramePrincipal frame) {
		super(frame);
		// TODO Auto-generated constructor stub
		this.tela = new TelaCliente(this);
	}
	
	public TelaCliente getTela() {
		return tela;
	}
	
	/**
	 * Operacao relativa ao botao Cadastrar.
	 */
	public void btnCadastrarNovoClientePressionado() {
		getFrame().mostrarTelaCadastrarCliente();
	}

	
	

}
