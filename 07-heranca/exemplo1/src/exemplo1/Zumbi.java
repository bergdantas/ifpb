package exemplo1;

public class Zumbi {
	private double posX;
	private double posY;
	private double posZ;
	private int velocidadeDoDeslocamento;
	
	public Zumbi(double posX, double posY, double posZ, int velocidadeDoDeslocamento) {
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.velocidadeDoDeslocamento = velocidadeDoDeslocamento;
	}
	
	public Zumbi() {
		
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

	public int getVelocidadeDoDeslocamento() {
		return velocidadeDoDeslocamento;
	}

	public void setVelocidadeDoDeslocamento(int velocidadeDoDeslocamento) {
		this.velocidadeDoDeslocamento = velocidadeDoDeslocamento;
	}

//TO STRING
	@Override
	public String toString() {
		return "Zumbi [posX=" + posX + ", posY=" + posY + ", posZ=" + posZ + ", velocidadeDoDeslocamento="
				+ velocidadeDoDeslocamento + "]";
	}

	public void morder() {
		//implementação da mordida
		System.out.println("mordi");
	}
	
	public void controleDaArea() {
		//implementação do método que gerencia a área
	}
	
}
