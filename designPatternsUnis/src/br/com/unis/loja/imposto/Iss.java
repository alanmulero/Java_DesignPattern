package br.com.unis.loja.imposto;

import br.com.unis.loja.orcamento.Orcamento;

public class Iss implements Imposto {
	// Calculo para o ISS
	public double calcular(Orcamento orcamento) {
		double aliquota = orcamento.getValor() * 0.12;
		System.out.println("Valor da Aliquota ISS: " + aliquota );
		double total = orcamento.getValor() - aliquota;
		System.out.println("Total do valor depois dos descontos dos impostos: " + total);
		return total;
	}

}
