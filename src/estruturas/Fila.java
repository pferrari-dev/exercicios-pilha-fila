package estruturas;

import java.util.LinkedList;
import java.util.Queue;
public class Fila {

	public static void main(String[] args) {
		// criação de uma fila
		
		Queue<Integer> fila = new LinkedList<Integer>();
		System.out.println(fila);
		
		fila.add(5);
		fila.add(10);
		fila.add(15);
		
		System.out.println(fila);
		fila.remove(10);
		
		System.out.println(fila);
		
//		System.out.println(fila);
//		System.out.println(fila.peek());
//		
//		fila.poll();
//		System.out.println(fila);
//		
	}

}
