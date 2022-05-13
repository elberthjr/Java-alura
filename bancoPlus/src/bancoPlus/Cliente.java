package bancoPlus;

public class Cliente {

	private static int id = 0;
	private String nome;
	private String cpf;
	private String profissao;
	
	public Cliente(String nome, String cpf) {
		Cliente.id++;
		this.nome = nome;
		this.cpf = cpf;
		System.out.println("O cliente: " + this.nome + " foi cadastrado!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public static int getId() {
		return Cliente.id;
	}
}
