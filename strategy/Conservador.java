package ads.pc.atividade.p2.strategy;

import ads.pc.atividade.p2.modelo.Conta;

public class Conservador implements Investimentos{

	@Override
	public void calculaInventimento(Conta conta) {
		conta.depositaInvestimento(conta.getSaldo()*0.08);		
	}
	


}
