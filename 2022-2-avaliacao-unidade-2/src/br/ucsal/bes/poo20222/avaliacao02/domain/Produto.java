package br.ucsal.bes.poo20222.avaliacao02.domain;

public abstract class Produto {
	private int codigo;
	private String descricao;
	private float valorUnitario;

	public Produto(int codigo, String descricao, float valorUnitario) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valorUnitario=" + valorUnitario + "]";
	}
}
