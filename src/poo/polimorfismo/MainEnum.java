package poo.polimorfismo;

public class MainEnum {
	public static void main(String[] args) {
		DiaSemanaEnum dia=DiaSemanaEnum.SengudaFeira;
		if (dia==DiaSemanaEnum.QuartaFeira  ) {
			System.out.println("Hoje tem aula de POO");
		}
		else
			System.out.println("Hoje n�o tem aula de POO");
		String domingo=DiaSemanaEnum.Domingo.toString();
		System.out.println(DiaSemanaEnum.Domingo.ordinal());
	}
	

}
