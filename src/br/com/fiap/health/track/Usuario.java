package br.com.fiap.health.track;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nomeUsuario;
	private int nmCPF;
	private int nmTelCelular;
	private String endEmail;
	
	public Usuario() {
		
	}
	
	//Construtor de classe
	public Usuario(String nomeUsuario, int nmCPF, int nmTelCelular, String endEmail) {
		
		this.nomeUsuario = nomeUsuario;
		this.nmCPF = nmCPF;
		this.nmTelCelular = nmTelCelular;
		this.endEmail = endEmail;
		
	}

	public String getNome() {
		return nomeUsuario;
	}

	public void setNome(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getNm_cpf() {
		return nmCPF;
	}

	public void setNm_cpf(int nmCPF) {
		this.nmCPF = nmCPF;
	}

	public int getNm_tel_celular() {
		return nmTelCelular;
	}

	public void setNm_tel_celular(int nmTelCelular) {
		this.nmTelCelular = nmTelCelular;
	}

	public String getEnd_email() {
		return endEmail;
	}

	public void setEnd_email(String endEmail) {
		this.endEmail = endEmail;
	}
}


