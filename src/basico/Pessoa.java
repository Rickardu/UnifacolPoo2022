package basico;

public class Pessoa {
	String nome;
	String cpf;
	public  Pessoa(String nome,String cpf){
	    this.cpf=nome;
	    this.nome=cpf;
	}
	public  Pessoa( ){
	     
	}
    public String  juntarNomeCpf(){
         System.out.println(this);
        int nome=0;
	    return "Nome:"+ nome+" CPF:"+cpf+"int nome:"+nome;
	}
	
	public void  modificarNomeCpf(String nome,String cpf){
	    this.nome=nome;
	    this.cpf=cpf;
	    
	}
	 
	 

}
