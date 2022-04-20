package poo.polimorfismo;

public class Jogador extends Atleta {
	private String nome;
	private int idade;
	private String posicao;	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public Jogador(String nome, int idade) {		 
		this.nome = nome;
		this.idade = idade;
	}
	public Jogador() {		 
		 
	}
	
	public void fazerGol(int idade) {
		if(idade>18 && idade<29)
			System.out.println("GOLLLLLL!");
		
	}
	public void fazerGol(String posicao) {
		if(posicao.equals("atacante"))
			System.out.println("GOLLLLLL!");		
	}
	

}
