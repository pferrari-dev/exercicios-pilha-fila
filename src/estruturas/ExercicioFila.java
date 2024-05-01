package estruturas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ExercicioFila {

	public static void main(String[] args) {
		// exercicio fila 
		
		Queue<String> fila = new LinkedList<String>();
		 Scanner scanner = new Scanner(System.in);
		 
		 int opcao;
	        do {
	            System.out.println("***** Menu: *****");
	            System.out.println("1 - Adicionar cliente na fila");
	            System.out.println("2 - Listar os clientes");
	            System.out.println("3 - Chamar um cliente");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            
	            switch (opcao) {
	                case 1:
	                    scanner.nextLine();
	                    System.out.print("Digite o nome do cliente: ");
	                    String nomeCliente = scanner.nextLine();
	                    fila.add(nomeCliente);
	                    
	                    System.out.println(nomeCliente + " adicionado(a) à fila.");
	                    
	                    break;
	                    
	                case 2:
	                    if (fila.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        System.out.println("Clientes na fila:");
	                        for (String cliente : fila) {
	                            System.out.println(cliente);
	                        }
	                    }
	                    break;
	                    
	                case 3:
	                    if (fila.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        String clienteChamado = fila.poll();
	                        System.out.println("Cliente " + clienteChamado + " chamado e retirado da fila.");
	                    }
	                    break;
	                    
	                    
	                case 0:
	                    System.out.println("Programa finalizado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Por favor, escolha uma opção.");
	                    break;
	                    
	            }
	        } while (opcao != 0);
	        
	        scanner.close();
	    }
	}