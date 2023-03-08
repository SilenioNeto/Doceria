package br.ucsal.bes.poo20222.avaliacao02.persistence;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.ucsal.bes.poo20222.avaliacao02.domain.Bolo;
import br.ucsal.bes.poo20222.avaliacao02.domain.Produto;

public class DoceriaDAO {
	private static List<Produto> produtos = new ArrayList<>();

	public static void incluir(Produto produto) {
		produtos.add(produto);
	}

	public static List<Produto> obterProdutos() {
		List<Produto> lista = new ArrayList<>(produtos);
		lista.sort(Comparator.comparing(Produto::getValorUnitario).thenComparing(Produto::getDescricao,
				String.CASE_INSENSITIVE_ORDER));
		return lista;
	}

	public static List<String> obterTemas() {
		List<String> temas = new ArrayList<>();

		for (Produto produto : produtos) {
			if (produto instanceof Bolo bolo) {
				String tema = bolo.getTema();
				if (tema.length() > 0 && !temasIguais(temas, tema))
					temas.add(tema);
			}
		}

		return temas;
	}

	private static boolean temasIguais(List<String> list, String a) {
		for (String b : list)
			if (a.equalsIgnoreCase(b))
				return true;

		return false;
	}
}
