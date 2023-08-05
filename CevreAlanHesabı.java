import java.util.Scanner;
public class CevreAlanHesabı {

	public static void main(String[] args) {
		int r;
		double pi = 3.14,alan,cevre;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Dairenin yari capi : ");
		r = inp.nextInt();
		
		alan = pi*r*r;
		cevre = 2*pi*r;
		
		System.out.println("yari cap: " + r);
		System.out.println("Dairenin alani: "+alan);
		System.out.println("Dairenin cevresi : "+cevre);
		
		
		
	}

}
