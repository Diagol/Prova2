package ads.pc.atividade.p2.strategy;

import ads.pc.atividade.p2.modelo.Conta;

public class Moderado implements Investimentos{

	@Override
	public void calculaInventimento(Conta conta) {
		double escolhido = new java.util.Random().nextDouble();

		if(escolhido<=0.50) {
			conta.depositaInvestimento(conta.getSaldo()*0.025);
		}
		else {
			conta.depositaInvestimento(conta.getSaldo()*0.007);
		}
		
	}

}
