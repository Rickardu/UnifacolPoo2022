package interfaceNota;

public class MainNota {
	public static void main(String[] args) {
		Aluno a=new Aluno();
		a.inserirNota(1213, 7.5f);
		System.out.println("Nota:"+a.visualizarNota(1213));
		 
	}
}
