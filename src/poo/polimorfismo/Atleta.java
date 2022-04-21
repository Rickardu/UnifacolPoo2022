package poo.polimorfismo;

public abstract class Atleta extends Pessoa {
	 
	private String porteFisico;
	private String estruturaOssea;
	private String pressao;
	private float altura;
	protected float peso;
	//public boolean ehSaudavel;
	
	 
	public String getEhSaudavel() {
		float imc_resultado=getImc();
		if(imc_resultado<16)
			return "Subpeso Severo";
		else if(imc_resultado>=16 && imc_resultado<=19.9)
			return "Subpeso";
		else if(imc_resultado>=20 && imc_resultado<=24.9)
			return "Normal";
		else if(imc_resultado>=25 && imc_resultado<=25.9)
			return "Sobre Peso";
		else if(imc_resultado>=30 && imc_resultado<=39.9)
			return "Obeso";
		else if(imc_resultado>40)
			return "Obeso Mórbido";
		else
			return "ERRO";
		 
	}
	
	 
	
	
	
	private float getImc() {
		return this.peso/(this.altura*this.altura);
	}

	public String getPorteFisico() {
		return porteFisico ;
	}

	public void setPorteFisico(String porteFisico) {
		this.porteFisico = porteFisico;
	}

	public String getEstruturaOssea() {
		return estruturaOssea;
	}

	public void setEstruturaOssea(String estruturaOssea) {
		this.estruturaOssea = estruturaOssea;
	}

	public String getPressao() {
		return pressao;
	}

	public void setPressao(String pressao) {
		this.pressao = pressao;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	protected float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	

}
