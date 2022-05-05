package servicos;

import entidades.Time;
import interfaces.ITimeServico;


public class TimeServico implements ITimeServico{

	
	
	
	@Override
	public void cadastrar(Time time) {
		if(!time.getNome().isBlank() && !time.getNome().isEmpty() 
				&& time.getNome().length()>=4)
			System.out.println("TIME SALVO:"+time.getNome());
		
	}

	@Override
	public void cadastrar(String nomeTime) {
		// TODO Auto-generated method stub
		
	}
	
	public void teste() {
		System.out.println("alguma coisa");
	}
	public void teste1() {
		System.out.println("alguma coisa");
	}
	
	

}
