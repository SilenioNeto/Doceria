package br.ucsal.bes.poo20222.avaliacao02.tui;

import br.ucsal.bes.poo20222.avaliacao02.domain.*;
import br.ucsal.bes.poo20222.avaliacao02.exceptions.QtdMinPedidoInvalidaException;
import br.ucsal.bes.poo20222.avaliacao02.persistence.DoceriaDAO;

public class DoceriaTUI {
	public static void cadastrarDoce() {
		String descricao = obterDescricao();
		int codigo = obterCodigo();
		float valorUnitario = obterValorUnitario();
		int qtdMinima = TUIUtil.obterInt("Informe a quantidade mínima:");

		try {
			Doce doce = new Doce(codigo, descricao, valorUnitario, qtdMinima);
			DoceriaDAO.incluir(doce);
			System.out.println("Doce cadastrado.");
		} catch (QtdMinPedidoInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void cadastrarBolo() {
		String descricao = obterDescricao();
		int codigo = obterCodigo();
		float valorUnitario = obterValorUnitario();
		int fatias = TUIUtil.obterInt("Informe o número de fatias:");
		String tema = TUIUtil.obterString("Informe o tema:").trim();

		Bolo bolo = new Bolo(codigo, descricao, valorUnitario, fatias, tema);
		DoceriaDAO.incluir(bolo);
		System.out.println("Bolo cadastrado.");
	}

	public static void listarProdutosPorValorEDescricao() {
		System.out.println("Listando produtos por ordem crescente de valor unitário:\n");
		for (Produto produto : DoceriaDAO.obterProdutos()) {
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Valor unitário: " + produto.getValorUnitario());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println();
		}
	}

	public static void listarTemas() {
		System.out.println("Temas de bolo cadastrados:");
		for (String tema : DoceriaDAO.obterTemas())
			System.out.printf("- %s\n", tema);
	}

	private static String obterDescricao() {
		return TUIUtil.obterString("Informe a descrição:");
	}

	private static int obterCodigo() {
		return TUIUtil.obterInt("Informe o código:");
	}

	private static float obterValorUnitario() {
		return TUIUtil.obterFloat("Informe o valor unitário:");
	}
}
