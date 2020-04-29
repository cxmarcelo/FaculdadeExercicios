package listaGRAFOS.lista2;

import java.util.ArrayList;

public class Exercicio1 {

	public Exercicio1() {
	}

	public void lerMatriz() {
	}

	public ArrayList<int []> arestas (int[][] matriz) {
		ArrayList<int[]> arestas = new ArrayList<int[]>();
		for (int li = 0; li < matriz.length; li++) {
			for (int col = 0; col < matriz.length; col++) {
				if(matriz[li][col] != 0) {
					for (int x = 0; x < matriz[li][col]; x++) {
						arestas.add(new int[]{(li +1),(col +1)});
					}
				}
			}
		}
		return arestas;
	}

	public boolean isDirecionado(int[][] matriz) {
		boolean ret = false;
		for (int li = 0; li < matriz.length; li++) {
			for (int col = 0; col < matriz.length; col++) {
				if(!(matriz[li][col] == matriz[col][li])) {
					return true;
				}
			}
		}
		return ret;
	}

	public ArrayList<Integer> grauVertice(int[][] matriz) {
		ArrayList<Integer> vertices = new ArrayList<Integer>();
		for (int li = 0; li < matriz.length; li++) {
			int grau = 0;
			for (int col = 0; col < matriz.length; col++) {
				grau = grau + matriz[li][col];
			}
			vertices.add(grau);
		}
		return vertices;
	}


	public void isCiclico(int[][] matriz) {
		ArrayList<int[]> arestas = arestas(matriz);
		int[] inicial;


		for (int i = 0; i < arestas.size() ; i++) {
			inicial = arestas.get(i);
			ArrayList<int[]> possiveis = new ArrayList<int[]>();
			for (int j = 0; j < arestas.size(); j++) {
				if(inicial[1] == arestas.get(j)[0]) {
					possiveis.add(arestas.get(j));
				}
			}
			for (int[] areP : possiveis) {
			}
		}
	}


	public ArrayList<ArrayList<Integer>> listaAdjacencia(int[][] matriz) {
		ArrayList<ArrayList<Integer>> lista = new ArrayList<ArrayList<Integer>>();
		for (int li = 0; li < matriz.length; li++) {
			ArrayList<Integer> listaAux = new ArrayList<Integer>();
			listaAux.add(li + 1);
			for (int col = 0; col < matriz.length; col++) {
				if(matriz[li][col] != 0) {
					for (int i = 0; i < matriz[li][col]; i++) {
						listaAux.add(col + 1);
					}
				}
			}
			lista.add(listaAux);
		}
		return lista;
	}

	private ArrayList<int[]> andar(int[] arest, ArrayList<int[]> arestas) {
		int[] volta = {arest[1], arest[0]};
		ArrayList<int[]> possiblidades = new ArrayList<int[]>();
		for (int i = 0; i < arestas.size(); i++) {
			if(arest[1] == arestas.get(i)[0] && volta != arestas.get(i)) {
				possiblidades.add(arestas.get(i));
			}
		}
		return possiblidades;
	}

	public boolean isConexo(int[][] matriz) {
		ArrayList<Integer> grauVert = grauVertice(matriz);
		boolean aux = true;
		for (int x = 0; x < grauVert.size(); x++) {

			if(grauVert.get(x).intValue() == 0) {
				for (int i = 0; i < matriz.length; i++) {
					if(matriz[i][x] != 0 && i != x) {
						aux = true;
					}else{
						aux = false;
					}
				}
			}
		}
		return aux;
	}

	
	public void isConexo2(int[][] matriz) {
		ArrayList<ArrayList<Integer>> listaAdj = new ArrayList<ArrayList<Integer>>();
		boolean retorno = false;
		
		
		
		for (ArrayList<Integer> linha : listaAdj) {
			if(linha.size() > 2) {
				int inicial = linha.get(0).intValue();
				for (int i = 2; i <= linha.size(); i++) {
					
					if(linha.get(i).intValue() == inicial) {
						retorno = true;
					}

				}
			}


		}
	}
	

	public static void main(String[] args) {

		int[][] matriz1 = {
				{0, 1, 1, 1, 0},
				{1, 0, 0, 0, 1},
				{1, 0, 0, 0, 1},
				{1, 0, 0, 0, 1},
				{0, 1, 1, 1, 0}
		};

		int [][] matriz2 = {
				{0, 1, 1, 0, 0},
				{1, 0, 0, 0, 0},
				{1, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1}
		};

		int [][] matriz3 = {
				{0, 1, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0}
		};

		Exercicio1 exe = new Exercicio1();
		System.out.println("1) A)");
		ArrayList<int[]> arestas = exe.arestas(matriz1);
		for (int[] are : arestas) {
			System.out.println(are[0] + ", " +  are[1]);
		}

		System.out.println("\n--------------------------------");
		System.out.println("1)B)");
		System.out.println(exe.isDirecionado(matriz1) ? "Dígrafo" : "Não Direcionado");


		System.out.println("\n--------------------------------");
		System.out.println("1)C)");

		ArrayList<Integer> listaGraus = exe.grauVertice(matriz1);
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println("Vértice: " +  (i+1)  + " tem grau: " + listaGraus.get(i));
		}

		System.out.println("\n--------------------------------");
		System.out.println("1)D)");

		System.out.println(exe.isConexo(matriz3) ? "Grafo é conexo" : "Grafo desconexo");


		System.out.println("\n--------------------------------");
		System.out.println("1)f)");
		System.out.println();

		ArrayList<ArrayList<Integer>> lista = exe.listaAdjacencia(matriz1);

		for (ArrayList<Integer> linha : lista) {
			for (Integer li : linha) {
				System.out.print(li +" -> ");
			}
			System.out.print("-");
			System.out.println("");
		}



	}
}
