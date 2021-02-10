package exemplo3;

public class Main {
	public static void main(String[] args){
		Creeper c1 = new Creeper(50.50, 65.98, 85.98, 100, 3);
		Zumbi z1 = new Zumbi(35.87, 98.69, 96.98, 70, 3);
		
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
