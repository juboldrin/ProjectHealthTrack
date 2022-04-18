package br.com.fiap.health.track;

import java.time.LocalDate;

public class Alimentos {
	int seqOperacaoAlimento;
	int codOperacaoAlimento;
	LocalDate dtOperacaoAlimento;
	int codAlimento;
	String nomeAlimento;
	double qtCalorias;


	public Alimentos() {
		
	}
	
	//Construtor de classe
	public Alimentos( int seqOperacaoAlimento, int codOperacaoAlimento, LocalDate dtOperacaoAlimento, int codAlimento, String nomeAlimento, double qtCalorias) {
		
		this.seqOperacaoAlimento = seqOperacaoAlimento;
		this.codOperacaoAlimento = codOperacaoAlimento;
		this.dtOperacaoAlimento = dtOperacaoAlimento;
		this.codAlimento = codAlimento;
		this.nomeAlimento = nomeAlimento;
		this.qtCalorias = qtCalorias;
		
	}

	public LocalDate getDtOperacaoAlimento() {
		return dtOperacaoAlimento;
	}

	public void setDtOperacaoAlimento(LocalDate dtOperacaoAlimento) {
		this.dtOperacaoAlimento = dtOperacaoAlimento;
	}

	public int consultarCodAlimento() {
		return codAlimento;
	}

	public String consultarNomeAlimento() {
		return nomeAlimento;
	}

	public double consultarQtCalorias() {
		return qtCalorias;
	}




}


