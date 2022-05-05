package gui;

import entidades.Time;
import interfaces.ITimeServico;
import servicos.TimeServico;

public class MainTime {
	public static void main(String[] args) {
		Time t= new Time("Vasco");
		TimeServico tservice=new TimeServico();
		tservice.cadastrar(t);
		
		ITimeServico Itservice=new TimeServico();
		Itservice.cadastrar(t);
		
		
	}
}
