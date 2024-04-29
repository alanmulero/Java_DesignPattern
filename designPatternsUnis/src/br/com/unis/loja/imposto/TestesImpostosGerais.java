package br.com.unis.loja.imposto;

import br.com.unis.loja.orcamento.Orcamento;

public class TestesImpostosGerais {

	public static void main(String[] args) {
		// Instanciando os testes.
		/** 
		 * @author alan.toledo
		 * // Aplicando o design pattern Strategy.
		 */
		
		Orcamento is = new Orcamento(10);
		Orcamento ic = new Orcamento(10);
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		System.out.println(calc.calcularImposto(ic, new Icms()));
		System.out.println(calc.calcularImposto(is, new Iss() ));

	}

}
