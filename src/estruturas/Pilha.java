package estruturas;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// criando uma pilha

		Stack<String> nomes = new Stack<String>();
		System.out.println(nomes);
		
		nomes.push("Paloma");
		nomes.push("Vinicius");
		nomes.add("Yasmin");
		nomes.add("Henrique");
		
		System.out.println(nomes.pop());
		nomes.remove(2);
		System.out.println(nomes);
	}

}
