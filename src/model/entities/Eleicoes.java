package model.entities;

public class Eleicoes {
	
	private String nome;
	private Integer quantidadeVotos;
	
	public Eleicoes() {}
	
	public Eleicoes(String nome, Integer quantidadeVotos) {
		this.nome = nome;
		this.quantidadeVotos = quantidadeVotos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeVotos() {
		return quantidadeVotos;
	}

	public void setQuantidadeVotos(Integer quantidadeVotos) {
		this.quantidadeVotos = quantidadeVotos;
	}
	

}
