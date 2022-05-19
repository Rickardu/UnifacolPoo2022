package repositorios;

import java.util.ArrayList;

import entidades.Time;
import interfaces.ITimeRepositorio;

public class TimeArrayListRepositorio implements ITimeRepositorio {
	public ArrayList<Time> times = new  ArrayList<Time>();
	@Override
	public void salvar(Time time) {
		times.add(time);		
	}
	@Override
	public void alterar(Time timeAlterar) {
		for (Time time : times) {
			if(timeAlterar.getCodigo()==time.getCodigo())
				time=timeAlterar;
			
		} 
		
	}
	@Override
	public ArrayList<Time> persquisar(String nome) {
		// TODO Auto-generated method stub
		
		/*ArrayList<Time> times=new ArrayList<Time>();
		for (Time time : this.times) {
			times.add(time);
		}*/
		return null;
	}
	
	public void qualquerCoisa() {}
	@Override
	public ArrayList<Time> listarTodos() {
		
		return times;
	}
	public int gerarCodigo() {
		return  this.times.size()+1;
	}
	
	public Time pesquisarPorCodigo(int codigo) {
		 
		for (Time time : times) {
			if(codigo==time.getCodigo())
				return time;
			
		}
		return null;
	}
	@Override
	public void excluir(Time time) {
		this.times.remove(time);
		
	}

}
