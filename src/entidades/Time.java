package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Time {		 
	private String nome;
	private Atleta tecnico;
	private ArrayList<Atleta> jogadores = new ArrayList<Atleta>();
	public Time(String nome) {
		this.nome=nome;
	}
	
	public Time() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Atleta getTecnico() {
		return tecnico;
	}
	public void setTecnico(Atleta tecnico) {
		this.tecnico = tecnico;
	}
	public ArrayList<Atleta> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Atleta> jogadores) {
		this.jogadores = jogadores;
	}
	
	
	

}
