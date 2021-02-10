package exemplo2;

public class Monstro {
	protected double posX;
	protected double posY;
	protected double posZ;
	protected int vida;
	
	public boolean controleDaArea() {
		//implementação do método que gerencia a área
		System.out.println("Controlo a área como um monstro");
		
		return false;
	}
	
	public void deslocamento() {
		//implementação do método que movimenta o monstro]
		System.out.println("Me movimento como um monstro");
	}
}
