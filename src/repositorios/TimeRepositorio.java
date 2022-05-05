package repositorios;

import java.util.ArrayList;

import entidades.Time;
import interfaces.ITimeRepositorio;

public class TimeRepositorio implements ITimeRepositorio {
	private ArrayList<Time> times = new  ArrayList<Time>();
	@Override
	public void salvar(Time time) {
		times.add(time);

		
	}

}
