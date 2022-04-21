package poo.polimorfismo;

import java.util.Date;

public class Jogador extends Atleta {
	 
	private String posicao;	
	
	public Jogador(String nome, Date dataNascimento) {		 
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso=200;
		this.setAltura(12);
		 
	}
	public Jogador() {		 
		 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
	public void fazerGol(int idade) {
		if(idade>18 && idade<29)
			System.out.println("GOLLLLLL!");
		
	}
	public void fazerGol(String posicao) {
		if(posicao.equals("atacante"))
			System.out.println("GOLLLLLL!");		
	}
	public String getCpf() {
		return cpf.substring(0, 3)+"*******";
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
