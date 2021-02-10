package exemplo2;

public class Main {
	public static void main(String[] args){
		Creeper c1 = new Creeper();
		Zumbi z1 = new Zumbi();
		
		System.out.println("CREEPER");
		c1.controleDaArea();
		c1.deslocamento();
		c1.explodir();
		
		System.out.println("ZUMBI");
		z1.controleDaArea();
		z1.deslocamento();
		z1.morder();
	}
}