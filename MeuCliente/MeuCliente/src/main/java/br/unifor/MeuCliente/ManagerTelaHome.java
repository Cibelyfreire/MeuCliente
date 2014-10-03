package br.unifor.MeuCliente;

public class ManagerTelaHome extends Manager{

	private TelaHome tela;
	
	public ManagerTelaHome(FramePrincipal frame) {
		super(frame);
		// TODO Auto-generated constructor stub
		this.tela = new TelaHome(this);
	}
	
	public TelaHome getTela() {
		return tela;
	}
	
	/**
	 * Operacao relativa ao botao Clientes.
	 */
    public void btnCliente() {
		getFrame().mostrarTelaCliente();
		
	}

    /**
	 * Operacao relativa ao botao Vendas.
	 */
	public void btnVendas() {
		getFrame().mostrarTelaVenda();
		
	}
}
