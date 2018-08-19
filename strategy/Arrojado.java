package ads.pc.atividade.p2.strategy;

import ads.pc.atividade.p2.modelo.Conta;

public class Arrojado implements Investimentos{

	@Override
	public void calculaInventimento(Conta conta) {
		double escolhido = new java.util.Random().nextDouble();

		if(escolhido<=0.20) {
			conta.depositaInvestimento(conta.getSaldo()*0.5);
		}
		else if(escolhido > 0.20 && escolhido <=0.30){
			conta.depositaInvestimento(conta.getSaldo()*0.3);
		}
		else {
			conta.depositaInvestimento(conta.getSaldo()*0.006);
		}
	}
}