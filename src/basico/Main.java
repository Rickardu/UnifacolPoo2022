package basico; 

public class Main {
	public static void main(String[] args) {
		int x = 4;
		int y = x;

		System.out.println(x + "" + y);
		x = 5;
		System.out.println(x + "" + y);

		Pessoa p1 = new Pessoa();
		System.out.println(">>>" + p1.nome);
		/*
		 * p1.modificarNomeCpf("FULANO","878957345"); System.out.println(p1.nome);
		 * System.out.println(p1.juntarNomeCpf()); System.out.println(p1);
		 * p1.nome="FULANO"; System.out.println(p1); System.out.println(p1.nome);
		 * p1.cpf="878957345"; System.out.println(p1.cpf+" "+p1.nome);
		 * System.out.println(p1); System.out.println(p1.juntarNomeCpf());
		 */

	}
}
