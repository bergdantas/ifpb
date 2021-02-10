package exemplo3;
public class Zumbi extends Monstro{

	private int velocidadeDoDeslocamento;
	
	public Zumbi(double posX, double posY, double posZ, int vida, int velocidadeDoDeslocamento) {
		super(posX, posY, posZ, vida);
		this.velocidadeDoDeslocamento = velocidadeDoDeslocamento;
	}
	
	public Zumbi() {
		
	}

	public void morder() {
		//implementação da mordida
		System.out.println("Mordo como um zumbi");
	}

	@Override
	public boolean controleDaArea() {
		System.out.println("Como sou um zumbi, monitoro um cubo de tamanho 3");
		return false;
	}
}