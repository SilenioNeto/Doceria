package br.ucsal.bes.poo20222.avaliacao02.domain;

import br.ucsal.bes.poo20222.avaliacao02.exceptions.QtdMinPedidoInvalidaException;

public class Doce extends Produto {
	private int qtdMin;

	public Doce(int codigo, String descricao, float valorUnitario, int qtdMin) throws QtdMinPedidoInvalidaException {
		super(codigo, descricao, valorUnitario);
		setQtdMin(qtdMin);
	}

	public int getQtdMin() {
		return qtdMin;
	}

	public void setQtdMin(int qtdMin) throws QtdMinPedidoInvalidaException {
		if (qtdMin < 50)
			throw new QtdMinPedidoInvalidaException("A quantidade mínima deve ser maior ou igual a 50");
		this.qtdMin = qtdMin;
	}

	@Override
	public String toString() {
		return "Doce [qtdMin=" + qtdMin + ", toString()=" + super.toString() + "]";
	}
}
