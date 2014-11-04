package br.unifor.MeuCliente.entity;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = -2127897624529130393L;
	
	private Integer codigo;
	private String nome;
	private String endereco;
	private String tipofornecedor;


	public Cliente(Integer codigo, String nome, String endereco,
			String tipofornecedor) {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipofornecedor() {
		return tipofornecedor;
	}

	public void setTipofornecedor(String tipofornecedor) {
		this.tipofornecedor = tipofornecedor;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", endereco="
				+ endereco + ", tipofornecedor=" + tipofornecedor + "]";
	}
	

}
