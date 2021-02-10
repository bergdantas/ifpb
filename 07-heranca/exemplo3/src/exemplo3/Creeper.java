package exemplo3;

public class Creeper extends Monstro {
	private int contagemRegressivaParaExplosao;
	
	public Creeper(double posX, double posY, double posZ, int vida, int contagemRegressivaParaExplosao) {
		super(posX, posY, posZ, vida);
		this.contagemRegressivaParaExplosao = contagemRegressivaParaExplosao;
	}

	public Creeper() {
		
	}

	public void explodir() {
		//implementação da explosão
		System.out.println("Explodo como um creeper");
	}
	
	@Override
	public boolean controleDaArea() {
		System.out.println("Como sou um Creeper, monitoro um cubo de tamanho 7");
		return false;
	}
}
