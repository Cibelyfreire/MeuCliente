package br.unifor.MeuCliente.entity;

public class Agendamento extends Cliente {
	private Integer dataVisita;
	private Integer dataUltimaVisita;

	public Integer getDataVisita() {
		return dataVisita;
	}

	public void setDataVisita(Integer dataVisita) {
		this.dataVisita = dataVisita;
	}

	public Integer getDataUltimaVisita() {
		return dataUltimaVisita;
	}

	public void setDataUltimaVisita(Integer dataUltimaVisita) {
		this.dataUltimaVisita = dataUltimaVisita;
	}

	@Override
	public String toString() {
		return "Agendamento [dataVisita=" + dataVisita + ", dataUltimaVisita="
				+ dataUltimaVisita + "]";
	}

}