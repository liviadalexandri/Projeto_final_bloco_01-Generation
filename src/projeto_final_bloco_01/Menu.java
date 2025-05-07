package projeto_final_bloco_01;

import java.io.IOException;
import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		        
		        Scanner leia = new Scanner(System.in);
				
				int opcao;
						
				while(true) {

					System.out.println(Cores.ANSI_CYAN_BACKGROUND + "꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦");
					System.out.println("                                                     ");
					System.out.println("                MARÉ BAIXA - MODA PRAIA              ");
					System.out.println("                                                     ");
					System.out.println("-----------------------------------------------------");
					System.out.println("                                                     ");
					System.out.println("            1 - Criar produto                        ");
					System.out.println("            2 - Listar todos os produtos             ");
					System.out.println("            3 - Buscar produto por ID                ");
					System.out.println("            4 - Atualizar dados do produto           ");
					System.out.println("            5 - Apagar produto                       ");
					System.out.println("            6 - Sair                                 ");
					System.out.println("                                                     ");
					System.out.println("-----------------------------------------------------");
					System.out.println("               Insira a opção desejada               ");
					System.out.println("                                                     " + Cores.TEXT_RESET);
					
					opcao = leia.nextInt();
						
					if (opcao == 6) {
						System.out.println("\nMaré Baixa - Seu verão começa aqui!");
						sobre();
						leia.close();
						System.exit(0);
					}
						
					switch (opcao) {
						case 1:
							System.out.println(Cores.TEXT_WHITE + "Criar produto\n\n");
						
									keyPress();
		                    		break;
						case 2:
							System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n\n");
							
							        keyPress();
		                    		break;
						case 3:
							System.out.println(Cores.TEXT_WHITE + "Buscar produto por ID \n\n");
							
							   		keyPress();
		                    		break;
						case 4:
							System.out.println(Cores.TEXT_WHITE + "Atualizar dados do produto\n\n");
							
									keyPress();
		                    		break;
						case 5:
							System.out.println(Cores.TEXT_WHITE + "Apagar produto \n\n");
				
									keyPress();
		                   	 		break;
						default:
							System.out.println(Cores.TEXT_RED + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
		                    		
									keyPress();
									break;
					}
				}	
		    }

	public static void sobre() {
		System.out.println("\n***********************************************************");
		System.out.println("Projeto Desenvolvido por: Lívia D'Alexandri                ");
		System.out.println("Lívia D'Alexandri - liviadlxcunha@gmail.com                ");
		System.out.println("github.com/liviadalexandri                                 ");
		System.out.println("***********************************************************");
		   }


public static void keyPress() {
	 
	try {

		System.out.println(Cores.TEXT_RESET + "\nPressione ENTER para Continuar...");
		System.in.read();

	} catch (IOException e) {

		System.err.println("Ocorreu um erro ao tentar ler o teclado");

	}
}
}
