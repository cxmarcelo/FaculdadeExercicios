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

	
	//deu ruim
	public boolean isCiclico3(int[][] matriz) {
		ArrayList<int[]> arestas = arestas(matriz);
		
		for (int i = 0; i < arestas.size(); i++) {
			int[] inicial = arestas.get(i);
			int vertInicial = arestas.get(i)[0];
			ArrayList<int[]> aux = arestas(matriz);
			aux.removeIf(n -> (n[0] == inicial[0] || n[0] == inicial[1] && n[1] == inicial[0]));
			int verticeAtual = inicial[1];

			if(busca(vertInicial, verticeAtual, aux)) {
				return true;
			}
		}
		return false;
	}

	
	private boolean busca(int vertInicial, int vertAtual, ArrayList<int[]> lista) {
		ArrayList<int[]> poss = possiblidades(vertAtual, lista);
		for (int[] is : poss) {
			if(is[1] == vertInicial) {
				return true;
			}else {
				lista.removeIf(n -> (n[0] == is[0] && n[1] == is[1]));
				return busca(vertInicial, is[1], lista);
			}
		}
		return false;
	}
	
	
	private ArrayList<int[]> possiblidades(int atual, ArrayList<int[]> lista) {
		ArrayList<int[]> listaAux = new ArrayList<int[]>();
		for (int[] is : lista) {
			if(is[0] == atual) {
				listaAux.add(is);
			}
		}
		return listaAux;
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

		ArrayList<ArrayList<Integer>> lista = exe.listaAdjacencia(matriz2);

		for (ArrayList<Integer> linha : lista) {
			for (Integer li : linha) {
				System.out.print(li +" -> ");
			}
			System.out.print("-");
			System.out.println("");
		}
		

		System.out.println("\n--------------------------------");
		System.out.println("1)E)");
		System.out.println();
		System.out.println(exe.isCiclico3(matriz2) ? "Ciclico" : "Aciclico");
		
	}
}
