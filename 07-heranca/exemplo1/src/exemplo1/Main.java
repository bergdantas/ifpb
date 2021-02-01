package exemplo1;

public class Main {

	public static void main(String[] args){
		Creeper c1 = new Creeper(100.0, 50.0, 60.0, 100, 3);
		System.out.println(c1);
		c1.explodir();

		Zumbi z1 = new Zumbi(50.5, 100.87, 32.85, 2);		
		System.out.println(z1);
		z1.morder();
	}
}
