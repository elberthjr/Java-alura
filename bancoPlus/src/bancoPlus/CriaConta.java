package bancoPlus;

public class CriaConta {
	
	public static void main(String[] args) {
		//Iniciando a primeira conta
		Conta conta = new Conta(1001, 10001);
		//Deposito
		conta.deposita(1000);
		//Chacando Saldo
		System.out.println(conta.getSaldo());
		
		//iniciando a segunda conta 
		Conta conta2 = new Conta(1001, 10002);
		//Tranferencia da conta1 para conta 2
		conta.transfere(500, conta2);
		//Checando saldo das contas 
		System.out.println(conta2.getSaldo());
		System.out.println(conta.getSaldo());
		
		//Iniciando a conta3
		Conta conta3 = new Conta(1001, 10003);
		//Alterando agencia conta3
		conta3.setAgencia(1002);
		//Alterando numero da conta1
		conta.setNumero(10005);
		
	}
}
