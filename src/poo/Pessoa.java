package poo;

public class Pessoa {
	String nome; 
	String cpf;
	String rg;
	String endereco;
	
	
	int idade;
	float salario;
	
	
	public Pessoa(String nome, String cpf, String rg, String endereco, int idade, float salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.idade = idade;
		this.salario = salario;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

}
