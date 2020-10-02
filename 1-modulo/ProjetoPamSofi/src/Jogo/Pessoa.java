package Jogo;

// criação de classe
public class Pessoa {
	//criação de atributos
	public String nome;
	private String email;	
	
	//criação do método construtor
	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	//criação dos getter e setter para puxar infomrações
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
	