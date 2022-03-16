package basico;

public class JavaSwitch {
	public static void main(String[] args) {
		String cor_sinal = "vermelho";
		switch (cor_sinal) {
		case "soma":
			System.out.println("ATENCAO");
		case "verde":
			System.out.println("SIGA");
			break;
		case "vermelho":
			System.out.println("PARE");
			break;
		default:
			System.out.println("ERRO");
		}
	}

}
