package basico;

public class JavaForEach {
	public static void main(String[] args) {
	String [] nomes= {"AAA","BBB","CCC","DDD","EEE","AAA1","BBB1","CCC1","DDD1","1EEE"};
	for (String nome : nomes) {
		//System.out.printf(" nome: %s\n",nome);
		if(nome.equals("DDD1")) {
		 System.out.printf(" nome: %s\n",nome);
			break;
		}
		if(nome.equals("BBB")||nome.equals("AAA")||nome.equals("CCC")||nome.equals("EEE")||nome.equals("DDD"))
			continue;
		
		System.out.printf("|+++++++");
		
		
	}
	
	}

}
