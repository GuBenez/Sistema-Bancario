package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		/**
		 * @param valor do saldo
		 * @param numero da agencia
		 * @param numero da conta
		 * @return o valor do deposito e da retirada
		 */
		
		Conta cc = new Conta();
		cc.depositar(50.0);
		cc.setAgencia(0001);
		cc.setNumero(97232);
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setAgencia(1111);
		cc1.setNumero(1234);
		cc1.setTipo("PF");
		cc1.setChequeEspecial(1500);
		
		Conta poupanca = new Conta(111, 222, 1000);
		
		cc.depositar(1000);
		System.out.println(cc.getSaldo());
		
		cc.retirar(25);
		System.out.println(cc.getSaldo());
		
		poupanca.retirar(300);
		System.out.println(poupanca.getSaldo());
		
		Conta cc2 = null;
		if (cc2 != null) {
			System.out.println("Existe uma conta");
		}
		cc1.depositar(2000);
		System.out.println(cc1.getSaldo());
	}
}
