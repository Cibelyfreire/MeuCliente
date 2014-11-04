package br.unifor.MeuCliente.entity;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private static final long serialVersionUID = -2174390265239130394L;
	
	public Integer referencia;
	public String nome;
	public Integer validade;
	public Double preco;

	public Produto(Integer referencia, String nome, Integer validade) {
	}

	public Integer getReferencia() {
		return referencia;
	}

	public void setReferencia(Integer referencia) {
		this.referencia = referencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getValidade() {
		return validade;
	}

	public void setValidade(Integer validade) {
		this.validade = validade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [referencia=" + referencia + ", nome=" + nome
				+ ", validade=" + validade + ", preco=" + preco + "]";
	}

}
