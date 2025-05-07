package projeto_final_bloco_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import projeto_final_bloco_01.model.Biquini;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.model.SaídaDePraia;
import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		        
		        Scanner leia = new Scanner(System.in);
				
				int opcao;
				
				
				Biquini b1 = new Biquini(1, "Biquíni Fita", 1, 199.90f, "Biquíni Gabriela");
				b1.visualizar();
				
				Biquini b2 = new Biquini(2, "Biquíni Decote", 1, 179.90f, "Biquíni Cíntia");
				b2.visualizar();
				
				SaídaDePraia s1 = new SaídaDePraia(3, "Kimono Longo", 2, 99.00f, "Kimono Longo Estampado");
				s1.visualizar();
				
				SaídaDePraia s2 = new SaídaDePraia(4, "Kimono Curto", 2, 110.00f, "Kimono Curto liso");
				s2.visualizar();
				
				
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
