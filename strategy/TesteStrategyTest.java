package ads.pc.atividade.p2.strategy;


import org.junit.Assert;
import org.junit.Test;
import ads.pc.atividade.p2.modelo.Conta;


public class TesteStrategyTest {
	@Test
	public void verificaOsValores() {
		//cenário
		Conta conta = new Conta("sdf","14583-55", 1000);
		//ação
		CalculadorDeInvestimentos investimento = new CalculadorDeInvestimentos();		
		investimento.realizaCalculo(conta, new Conservador());
		//saída
		double valorEsperado = 1060.0;
		Assert.assertEquals(valorEsperado, conta.getSaldo(),0.0001);
	} 

}	

