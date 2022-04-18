package br.com.fiap.health.track;

import java.io.Serializable;
import java.time.LocalDate;

public class Saude implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int seqOperacaoSaude;
	int codOperacaoSaude;
	LocalDate dtOperacaoSaude;
	double valorPeso;
	double valorPressaoArterial;
	
	public Saude() {
		
	}
	
	//Construtor de classe
	public Saude(int seqOperacaoSaude, int codOperacaoSaude, LocalDate dtOperacaoSaude, double valorPeso, double valorPressaoArterial) {
		
		this.seqOperacaoSaude = seqOperacaoSaude;
		this.codOperacaoSaude = codOperacaoSaude;
		this.dtOperacaoSaude = dtOperacaoSaude;
		this.valorPeso = valorPeso;
		this.valorPressaoArterial = valorPressaoArterial;
	}


	public double getValor_peso() {
		return valorPeso;
	}

	public double getValor_pressao_arterial() {
		return valorPressaoArterial;
	}


	
	
}
