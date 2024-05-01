package estruturas;
import java.util.Scanner;
import java.util.Stack;


public class ExercicioPilha {

	public static void main(String[] args) {
		// exercicio pilhas '-'
		
		// PROFS NÃO DESISTAM DE MIM, UM DIA SEREI UMA OTIMA DEV *-* //
		
		Stack<String> livro = new Stack<String>();
		  Scanner scanner = new Scanner(System.in);
		
		  int opcao;
	        do {
		
		System.out.println("***** Menu: *****");
        System.out.println("1 - Adicionar livro na pilha");
        System.out.println("2 - Listar os livros");
        System.out.println("3 - Retirar livro");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        
        switch (opcao) {
        case 1:
            scanner.nextLine(); 
            System.out.print("Digite o nome do livro: ");
            String nomeLivro = scanner.nextLine();
            
            livro.push(nomeLivro);
            System.out.println(nomeLivro + " adicionado à pilha.");
            break;
        case 2:
            if (livro.isEmpty()) {
                System.out.println("A pilha está vazia.");
            } else {
                System.out.println("Livros na pilha:");
                for (String livro1 : livro) {
                    System.out.println(livro1);
                }
            }
            break;
        case 3:
            if (livro.isEmpty()) {
                System.out.println("A pilha está vazia.");
            } else {
                String livroRetirado = livro.pop();
                System.out.println("Livro " + livroRetirado + " retirado da pilha.");
            }
            break;
        case 0:
            System.out.println("Programa encerrado.");
            break;
        default:
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            break;
    }
} while (opcao != 0);

scanner.close();
	}

}
