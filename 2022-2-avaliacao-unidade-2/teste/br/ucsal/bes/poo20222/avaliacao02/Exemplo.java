package br.ucsal.bes.poo20222.avaliacao02;

import br.ucsal.bes.poo20222.avaliacao02.tui.DoceriaTUI;
import br.ucsal.bes.poo20222.avaliacao02.tui.TUIUtil;

public class Exemplo {
	public static void main(String[] args) {
		int qtdDoces = TUIUtil.obterInt("Digite a quantidade de doces a serem cadastrados:");
		for (int i = 0; i < qtdDoces; i++) {
			System.out.println("Cadastrando doce " + (i + 1));
			DoceriaTUI.cadastrarDoce();
		}

		int qtdBolos = TUIUtil.obterInt("Digite a quantidade de bolos a serem cadastrados:");
		for (int i = 0; i < qtdBolos; i++) {
			System.out.println("Cadastrando bolo " + (i + 1));
			DoceriaTUI.cadastrarBolo();
		}

		DoceriaTUI.listarProdutosPorValorEDescricao();
		DoceriaTUI.listarTemas();
	}
}
