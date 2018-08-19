package ads.pc.atividade.p2.strategy;

import ads.pc.atividade.p2.modelo.Conta;

public class CalculadorDeInvestimentos {
	public void realizaCalculo(Conta conta, Investimentos investimento) {
		investimento.calculaInventimento(conta);

	}
}