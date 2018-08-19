package ads.pc.atividade.p2.strategy;

import org.junit.Test;

import ads.pc.atividade.p2.modelo.Conta;

public class TesteStrategy {
	public static void main(String[] args) {

		//cenário
		Conta conta = new Conta("sdf","14583-55", 1000);
		System.out.println(conta.getSaldo());
		//ação
		CalculadorDeInvestimentos investimento = new CalculadorDeInvestimentos();		
		investimento.realizaCalculo(conta, new Conservador());
		//saída
		double valorEsperado =0;
		System.out.println("Saldo $ "+conta.getSaldo());
	}
}

