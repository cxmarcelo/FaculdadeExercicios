package aula.recursividade;

public class Fatorial {

	private static int fatorial(int n) {
		if(n ==1) return n;
		
		System.out.println(n);
		return fatorial(n-1) * n;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <5;i++) {
			System.out.println("Fatorial de " + i + " é: " + fatorial(i));
		}
	}
}