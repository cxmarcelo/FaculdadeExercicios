package aulaFilas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo2 {

	public static void main(String[] args) {

		Queue<String> waitingQueue = new LinkedList<>();

		waitingQueue.add("Ana");
		waitingQueue.add("Maria");
		waitingQueue.add("Ester");
		waitingQueue.add("Debora");

		System.out.println("Fila: " + waitingQueue);
		System.out.println("A fila est� vazia ? " + (waitingQueue.isEmpty() ? "sim" : "n�o"));
		System.out.println("O tamanho da fila � " + waitingQueue.size());

		String name = "Ester";
		if(waitingQueue.contains(name)) {
			System.out.println("Fila cont�m: " + name); 
		}else {
			System.out.println("Fila n�o cont�m" + name);
		}
	}	
}
