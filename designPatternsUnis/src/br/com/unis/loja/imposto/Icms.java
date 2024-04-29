package br.com.unis.loja.imposto;

import br.com.unis.loja.orcamento.Orcamento;

public class Icms implements Imposto{
	// Taxa do Icms.
	public double calcular(Orcamento orcamento) {
		double aliquota = orcamento.getValor() * 0.18;
		System.out.printf("Valor da Aliquota ICMS %.2f: ", aliquota );
		System.out.println();
		double total = orcamento.getValor() - aliquota;
		System.out.println("Total do valor depois dos descontos dos impostos: "+ total);
		return total;
	}

}
