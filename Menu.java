package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
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
		
		if (opcao == 0) {
			
			System.out.println("\nVolte Sempre!!!!");
			leia.close();
			System.exit(0);
			
		}
		
		switch (opcao){
			
			case 1: 
				System.out.println("\t\t 1 - Camarão Empanado-------------------- R$ 50,00");
				
				break;
				
			case 2:
				System.out.println("\t\t 2 - Lula Empanado----------------------- R$ 50,00");
				
				break;
				
			case 3: 	
				System.out.println("\t\t 3 - Isca Empanado----------------------- R$ 40,00");
				
				break;
				
				
			case 4:
				System.out.println("\t\t 4 - Moqueca Frutos do Mar--------------- R$ 200,00");
				
				break;
				
			case 5:
				System.out.println("\t\t 5 - Moqueca Vegetariana ---------------- R$ 150,00");
				
				break;
				
			case 6:
				System.out.println("\t\t 6 - Bobó de Camarão--------------------- R$ 170,00");
				
				break;
				
			case 7:
				System.out.println("\t\t 7 - Àgua de Coco------------------------ R$ 12,00");
				
				break;
				
			case 8:
				System.out.println("\t\t 8 - Refrigerante lata------------------- R$ 8,00");
				
				break;
				
			case 9:
				System.out.println("\t\t 9 - Suco-------------------------------- R$ 15,00");
				
				break;
				
			default:
				System.out.println("\nOpção Inválida!");
				
				
				
				
		}
		
		}
		
	}

}
