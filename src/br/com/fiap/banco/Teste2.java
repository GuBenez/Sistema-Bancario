package br.com.fiap.banco;

//Testando polimorfismo e sobreescrevendo o método retirar da superclasse. Como sobreescrevi 
//agora tem uma taxa de R$10 na retirada da ContaCorrente que não existe na retirada da conta. 

public class Teste2 {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(2000);
		conta2.retirar(200);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta2: " + conta2.getSaldo());
		System.out.println("Conta3: " + conta3.getSaldo());
	}
}
