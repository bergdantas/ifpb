package exemplo1;

public class Creeper {
	private double posX;
	private double posY;
	private double posZ;
	private int vida;
	private int contagemregressivaParaDetonacao;
	
	public Creeper(double posX, double posY, double posZ, int vida, int contagemregressivaParaDetonacao) {
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.vida = vida;
		this.contagemregressivaParaDetonacao = contagemregressivaParaDetonacao;
	}
	
	public Creeper() {
		
	}

//SETTERS E GETTERS	
	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getPosZ() {
		return posZ;
	}

	public void setPosZ(double posZ) {
		this.posZ = posZ;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getContagemregressivaParaDetonacao() {
		return contagemregressivaParaDetonacao;
	}

	public void setContagemregressivaParaDetonacao(int contagemregressivaParaDetonacao) {
		this.contagemregressivaParaDetonacao = contagemregressivaParaDetonacao;
	}
	
//TO STRING
	@Override
	public String toString() {
		return "Creeper [posX=" + posX + ", posY=" + posY + ", posZ=" + posZ + ", vida=" + vida
				+ ", contagemregressivaParaDetonacao=" + contagemregressivaParaDetonacao + "]";
	}
	
	public void explodir() {
		//implementação da explosão
		System.out.println("explodi");
	}
	
	public boolean controleDaArea() {
		//implementação do método que gerencia a área
		
		return false;
	}
	
	public void deslocamento() {
		//implementação do método que movimenta o monstro

	}
}
