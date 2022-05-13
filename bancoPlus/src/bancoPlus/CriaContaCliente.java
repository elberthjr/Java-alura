package bancoPlus;

public class CriaContaCliente {
	
	public static void main(String[] args) {
		//Criando conta e cliente
		Conta conta = new Conta(2001, 20001);
		Cliente cliente = new Cliente("Elberth Junior", "123.456.789.12");
		
		//Atribuindo cliente á conta 
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getNome());
		
		//Criando cliente2 e conta2
		Conta conta2 = new Conta(2002, 20002);
		Cliente cliente2 = new Cliente("Brenda Silva", "123.456.789.12");
		
		//Atribuindo cliente a conta, porem invertendo os clientes
		conta2.setTitular(cliente);
		conta.setTitular(cliente2);
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta2.getTitular().getNome());
		
		//Alterando cpf do cliente
		cliente.setCpf("222.333.444.55");
		System.out.println(cliente.getCpf());
		
		//Atribuindo profissao ao cliente
		cliente2.setProfissao("Recursos Humanos");
		System.out.println(conta.getTitular().getProfissao());
	
	}
}
