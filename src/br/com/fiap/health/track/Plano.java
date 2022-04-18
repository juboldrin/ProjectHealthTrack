package br.com.fiap.health.track;

import java.io.Serializable;
import java.time.LocalDate;

public class Plano implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int codPlano;
	String nomePlano;
	int codAssinatura;
	LocalDate dtAssinatura;
	String tipoAssinatura;
	double valorAssinatura;
	
	public Plano() {
		
	}
	
	//Construtor de classe
	public Plano(int codPlano, String nomePlano, int codAssinatura, LocalDate dtAssinatura, String tipoAssinatura, double valorAssinatura ) {
		this.codPlano = codPlano;
		this.nomePlano = nomePlano;
		this.codAssinatura = codAssinatura;
		this.dtAssinatura = dtAssinatura;
		this.tipoAssinatura = tipoAssinatura;
		this.dtAssinatura = LocalDate.now();
		this.valorAssinatura = valorAssinatura;
	}
	
	public String consultaPlano() {
		return nomePlano;
	}
	
	public void trocaPlano(String tipo_assinatura) {
		this.tipoAssinatura = tipo_assinatura;
	}
}

