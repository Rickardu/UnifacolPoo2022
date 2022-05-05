package gui;

import java.util.ArrayList;
import java.util.Iterator;

import entidades.Time;

public class Main {
	public static void main(String[] args) {
		
		
		Time t1=new Time("");
		Time t2=new Time("");
		Time t3=new Time("");
		
		Time[] timesVetor=new Time[3];
		timesVetor[0]=t1;
		timesVetor[1]=t2;
		timesVetor[2]=t3;
		Time t4=new Time();
		//timesVetor[3]=t4;
		
		timesVetor=new Time[4];
		
		ArrayList<Time> timesList =new ArrayList<Time>();
		timesList.add(t1);
		timesList.add(t2);
		timesList.add(t3);
		timesList.add(t4);
		for (long i = 0; i<1000000;i++) {
			timesList.add(new Time("Time"+i));
			
		}
		
		/*for (int i = 0; i<timesList.hashCode();i++) {
		 System.out.println("NOME:"+timesList.get(i).getNome());
			
		}*/
		Time t=new Time("Time12323");
		System.out.println("NOME:"+timesList.get(5).getNome());
		timesList.remove(t);
		System.out.println("NOME:"+timesList.get(5).getNome());
		System.out.println("NOME:"+timesList.get(5) +" --- "+t);
		timesList.remove(5);
		System.out.println("NOME:"+timesList.get(5).getNome());
		timesList.add(t);
		System.out.println("NOME:"+timesList.get(timesList.size()-1).getNome());
		//timesList.remove(t);
		System.out.println("NOME REMOVEU?:"+timesList.get(timesList.size()-1).getNome());
		
		int ie=-1;
		Time buscaTime= null;
		for (int i = 0; i<timesList.size();i++) {
			 if(timesList.get(i).getNome()!=null && timesList.get(i).getNome().equals("Time99")) {
				 buscaTime=timesList.get(i);
				 ie=i;
				 break;
			 }
			
		}
		
		
		System.out.println("NOMEA:"+timesList.get(ie).getNome());
		if(buscaTime!=null)
			timesList.remove(buscaTime);
		System.out.println("NOMED:"+timesList.get(ie).getNome());
		for (Time time : timesList) {
			System.out.println("NOMEForeach:"+time.getNome());
		}
	}
	
	

}
