import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		
		System.out.println(soma(a,b));
		
		sc.close();
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}

}
