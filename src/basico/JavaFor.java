package basico;

public class JavaFor {
public static void main(String[] args) {
		
		 /*for(int n=20;n>=1 ;n--) {
			 System.out.printf("O valor de n é %d\n",n);
		 }*/
		 
		 String [] nomes= {"AAA","BBB","CCC","DDD","EEE","AAA1","BBB1","CCC1","DDD1","1EEE"};
		 for(int i=0; i<nomes.length-5;i++) {
			 System.out.printf("No indice %d temos a string %s\n",i,nomes[i]);
		 }
	 
		 //System.out.println( nomes[2]);
		 
	}

}
