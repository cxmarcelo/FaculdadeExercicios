package listaGRAFOS.lista2;

import java.util.ArrayList;

public class Exercicio3 {
	/*3)	 Escreva	 um	 programa	 que	 receba	 como	 entrada	 uma	 matriz	 de	 adjacências	 de	 um	 grafo	
simples,	 ponderado	 e	 conexo	 e	 escreva	 como	 saída	 as	 arestas	 (na	 forma	 de	 pares	 ordenados e	
seus	pesos).*/

	public ArrayList<int[]> arestasComPeso(int[][] matriz) {
		ArrayList<int[]> arestas = new ArrayList<int[]>();
		for (int li = 0; li < matriz.length; li++) {
			for (int col = 0; col < matriz.length; col++) {
				if(matriz[li][col] != 0) {
					arestas.add(new int[]{(li +1),(col +1), matriz[li][col]});
				}
			}
		}
		return arestas;
	}

	public void imprimirArestas(ArrayList<int[]> arestas) {
		for (int[] is : arestas) {
			System.out.println("Areast " + is[0] + " " + is[1] + " de peso: " + is[2]);
		}
	}

	public static void main(String[] args) {
		int[][] matriz1 = {
				{0, 12, 1, 1, 0},
				{1, 11, 0, 3, 1},
				{1, 9, 0, 7, 1},
				{8, 0, 2, 0, 1},
				{1, 1, 15, 1, 4}
		};

		Exercicio3 exe = new Exercicio3();
		exe.imprimirArestas(exe.arestasComPeso(matriz1));
	}


}
