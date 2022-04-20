package poo.polimorfismo;

public class Atleta {
	private String porteFisico;
	private String estruturaOssea;
	private String pressao;
	private float altura;
	private float peso;
	
	private float getImc() {
		return this.peso/(this.altura*this.altura);
	}

	public String getPorteFisico() {
		return porteFisico;
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

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	

}
