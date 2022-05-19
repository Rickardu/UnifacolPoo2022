package interfaces;

import java.util.ArrayList;

import entidades.Time;

public interface ITimeRepositorio {
	public void salvar(Time time);
	public void alterar(Time time);
	public ArrayList<Time> persquisar(String nome);
	public ArrayList<Time> listarTodos();
	public void excluir(Time time);
	

}
