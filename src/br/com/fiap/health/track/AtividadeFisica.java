package br.com.fiap.health.track;

import java.time.LocalDate;

public class AtividadeFisica {
	int seqOperacaoAtivfisica;
	int codOperacaoAtivfisica;
	LocalDate dtOperacaoAtivfisica;
	int codAtivfisica;
	String nomeAtivfisica;
	LocalDate hrInicio;
	LocalDate hrFim;
	double qtTempoTotal;
	double qtCalorias;
	
	public AtividadeFisica() {
		
	}
	
	//Construtor de classe
	public AtividadeFisica(	int seqOperacaoAtivfisica, int codOperacaoAtivfisica, LocalDate dtOperacaoAtivfisica, int codAtivfisica, String nomeAtivfisica, LocalDate hrInicio, LocalDate hrFim, double qtTempoTotal, double qtCalorias) {
		
		this.seqOperacaoAtivfisica = seqOperacaoAtivfisica;
		this.codOperacaoAtivfisica = codOperacaoAtivfisica;
		this.dtOperacaoAtivfisica = dtOperacaoAtivfisica;
		this.codAtivfisica = codAtivfisica;
		this.nomeAtivfisica = nomeAtivfisica;
		this.hrInicio = hrInicio;
		this.hrFim = hrFim;
		this.qtTempoTotal = qtTempoTotal;
		this.qtCalorias = qtCalorias;
		
		}

	public LocalDate getDtOperacaoAtivfisica() {
		return dtOperacaoAtivfisica;
	}

	public void setDtOperacaoAtivfisica(LocalDate dtOperacaoAtivfisica) {
		this.dtOperacaoAtivfisica = dtOperacaoAtivfisica;
	}

	public String getNomeAtivfisica() {
		return nomeAtivfisica;
	}

	public void setNomeAtivfisica(String nomeAtivfisica) {
		this.nomeAtivfisica = nomeAtivfisica;
	}

	public LocalDate getHrInicio() {
		return hrInicio;
	}

	public void setHrInicio(LocalDate hrInicio) {
		this.hrInicio = hrInicio;
	}

	public LocalDate getHrFim() {
		return hrFim;
	}

	public void setHrFim(LocalDate hrFim) {
		this.hrFim = hrFim;
	}

	public double getQtTempoTotal() {
		return qtTempoTotal;
	}

	public void setQtTempoTotal(double qtTempoTotal) {
		this.qtTempoTotal = qtTempoTotal;
	}

	public double getQtCalorias() {
		return qtCalorias;
	}

	public void setQtCalorias(double qtCalorias) {
		this.qtCalorias = qtCalorias;
	}
	
		

}
