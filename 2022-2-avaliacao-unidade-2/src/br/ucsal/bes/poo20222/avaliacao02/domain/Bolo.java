package br.ucsal.bes.poo20222.avaliacao02.domain;

public class Bolo extends Produto {
	private int qtdFatias;
	private String tema;

	public Bolo(int codigo, String descricao, float valorUnitario, int qtdFatias, String tema) {
		super(codigo, descricao, valorUnitario);
		this.qtdFatias = qtdFatias;
		this.tema = tema;
	}

	public int getQtdFatias() {
		return qtdFatias;
	}

	public void setQtdFatias(int qtdFatias) {
		this.qtdFatias = qtdFatias;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Bolo [qtdFatias=" + qtdFatias + ", tema=" + tema + ", toString()=" + super.toString() + "]";
	}
}
