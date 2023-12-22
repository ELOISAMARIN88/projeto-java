package menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import Pagamento.Pagamento;
import Pagamento.CartãodeCredito;
import Pagamento.CartaodeDebito;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao, quant = 0, opcaoPg;
		double total = 0;
		
		while (true) {
			
			
		System.out.println("---------------------------------------------------------");
		System.out.println("                                                      ");
		System.out.println("                 Cadapio  da Onda do Mar:                         ");
		System.out.println("                                                      ");
		System.out.println("\t\t 1 - Camarão Empanado-------------------- R$ 50,00");
		System.out.println("\t\t 2 - Lula Empanado----------------------- R$ 50,00");
		System.out.println("\t\t 3 - Isca Empanado----------------------- R$ 40,00");
		System.out.println("\t\t 4 - Moqueca Frutos do Mar--------------- R$ 200,00");
		System.out.println("\t\t 5 - Moqueca Vegetariana ---------------- R$ 150,00");
		System.out.println("\t\t 6 - Bobó de Camarão--------------------- R$ 170,00");
		System.out.println("\t\t 7 - Àgua de Coco------------------------ R$ 12,00");
		System.out.println("\t\t 8 - Refrigerante lata------------------- R$ 8,00");
		System.out.println("\t\t 9 - Suco-------------------------------- R$ 15,00");
		System.out.println("\t\t 0 - Sair                                         ");
		System.out.println("\n---------------------------------------------------------");
		System.out.println("\nEntre com a opção desejada:                             ");
		
		opcao = leia.nextInt();
		
		try {
			opcao = leia.nextInt();
		}catch(InputMismatchException e){
			System.out.println("\nEntre com valores inteiros!");
			leia.nextLine();
			opcao = 10;
		}
		
		if (opcao == 0) {
			
			System.out.println("Total do pedido: R$ " + total);
			leia.close();
			System.exit(0);
			
			
		}
		
		switch (opcao){
			
			case 1: 
				System.out.println("\t\t 1 - Camarão Empanado-------------------- R$ 50,00");
				
				
				 System.out.println("\nDigite a quantidade que você deseja: ");
                 quant = leia.nextInt();
                 total += quant * 50.0;
				break;
				
			case 2:
				System.out.println("\t\t 2 - Lula Empanado----------------------- R$ 50,00");
				
				System.out.println("\nDigite a quantidaade que você deseja: ");
				quant = leia.nextInt();
				total += quant * 50.0;
				
				break;
				
			case 3: 	
				System.out.println("\t\t 3 - Isca Empanado----------------------- R$ 40,00");
				
				System.out.println("\nDigite a quantidaade que você deseja: ");
				quant = leia.nextInt();
				total += quant *50.0;
				
				break;
				
				
			case 4:
				System.out.println("\t\t 4 - Moqueca Frutos do Mar--------------- R$ 200,00");
				
				 System.out.println("\nDigite a quantidade que você deseja: ");
                 quant = leia.nextInt();
                 total += quant * 200.0;
				
				break;
				
			case 5:
				System.out.println("\t\t 5 - Moqueca Vegetariana ---------------- R$ 150,00");
				
				 System.out.println("\nDigite a quantidade que você deseja: ");
                 quant = leia.nextInt();
                 total += quant * 150.0;
                 
				break;
				
			case 6:
				System.out.println("\t\t 6 - Bobó de Camarão--------------------- R$ 170,00");
				
				 System.out.println("\nDigite a quantidade que você deseja: ");
                 quant = leia.nextInt();
                 total += quant * 170.0;
                 
				break;
				
			case 7:
				System.out.println("\t\t 7 - Àgua de Coco------------------------ R$ 12,00");
				
				 System.out.println("\nDigite a quantidade que você deseja: ");
                 quant = leia.nextInt();
                 total += quant * 12.0;
                 
				break;
				
			case 8:
				System.out.println("\t\t 8 - Refrigerante lata------------------- R$ 8,00");
				
				 System.out.println("\nDigite a quantidade que você deseja: ");
                 quant = leia.nextInt();
                 total += quant * 8.0;
				
				break;
				
			case 9:
				System.out.println("\t\t 9 - Suco-------------------------------- R$ 15,00");
				
				 System.out.println("\nDigite a quantidade que você deseja: ");
                 quant = leia.nextInt();
                 total += quant * 15.0;
				
				break;
				
			default:
				System.out.println("\nOpção Inválida!");
				
				
				
				
				
				
				
		}
		
		 System.out.println("Bem-vindo ao sistema de pagamento!");

	        System.out.println("Selecione a forma de pagamento:");
	        System.out.println("1 - Dinheiro");
	        System.out.println("2 - Cartão de Crédito");
	        System.out.println("3 - Cartão de Débito");
	        System.out.println("4 - Pix");

	        opcaoPg = leia.nextInt();

	        switch (opcaoPg) {
	            case 1:
	                System.out.println("Você escolheu pagar em dinheiro. Por favor, tenha o valor exato.");
	                break;

	            case 2:
	                System.out.println("Você escolheu pagar com cartão de crédito. Insira o cartão na máquina.");
	                break;

	            case 3:
	                System.out.println("Você escolheu pagar com cartão de débito. Insira o cartão na máquina.");
	                break;

	            case 4:
	                System.out.println("Você escolheu pagar com Pix. Utilize a chave Pix fornecida.");
	                break;

	            default:
	                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
	        }

	        leia.close();
	    }
	}
		

		
	

}
