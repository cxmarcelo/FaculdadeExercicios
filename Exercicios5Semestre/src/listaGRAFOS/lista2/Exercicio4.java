package listaGRAFOS.lista2;

public class Exercicio4 {

	/*
	4)	Escreva	um	programa	que receba como	entrada	uma	matriz	de	adjacências	para	o	grafo	não
	direcionado	 em	 sua	 forma	 triangular	 inferior,	 conforme	 ilustrado	 abaixo e	 retorne a	 matriz	
	completa,	obtendo	a	parte	superior	considerando	a simetria.
	0
	1 0
	0 1 0
	0 1 1 0
	1 1 0 1 0
	0 0 1 1 1 0
	 */

	public void completarMatriz(int[][] matriz) {
		for (int li = 0; li < matriz.length; li++) {
			for (int col = 0; col < matriz.length; col++) {
				matriz[li][col] = matriz[col][li];
			}
		}
		imprimirMatriz(matriz);
	}
	
	public void imprimirMatriz(int[][] matriz) {
		for (int li = 0; li < matriz.length; li++) {
			for (int col = 0; col < matriz.length; col++) {
				System.out.print(matriz[li][col] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		int[][] matriz1 = {
				{0, 0, 0, 0, 0},
				{1, 0, 0, 0, 0},
				{1, 0, 0, 0, 0},
				{1, 0, 0, 0, 0},
				{0, 1, 1, 1, 0}
		};
		Exercicio4 exe = new Exercicio4();
		exe.completarMatriz(matriz1);
		
		
	}
}
