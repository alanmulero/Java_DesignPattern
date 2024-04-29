package br.com.unis.loja.imposto;

import br.com.unis.loja.orcamento.Orcamento;

public class CalculadoraDeImposto {
	// Calculos gerais de todos os tipos de impostos sem usar o conceito de Design
	// Patterns.
	/**
	 * Segue exemplo. public double calcularImposto(Orcamento valor, TipoImposto
	 * tipoDeImposto) { switch (tipoDeImposto) { case ICMS: double total =
	 * valor.valor * 0.18; return total; case ISS: total = valor.valor * 0.12;
	 * return total;
	 * 
	 * default: return 0; } }
	 **/
	
	// Metodo da calculadora alterado para uso do padrão Designer Patterns Strategy.
	
	public double calcularImposto(Orcamento orcamento, Imposto imposto) {
		// Resumimos todo código anterior em uma linha.
		return imposto.calcular(orcamento);
	}
	
}
