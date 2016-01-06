package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {

	private Long id;

	private int anoDeInicio;

	private String nome;

	public Projeto() {
	}

	public Projeto(Long id, String nome, int anoDeInicio) {
		super();
		this.id = id;
		this.anoDeInicio = anoDeInicio;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public int getAnoDeInicio() {
		return anoDeInicio;
	}

	public String getNome() {
		return nome;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String toXML() {
		return new XStream().toXML(this);
	}

}
