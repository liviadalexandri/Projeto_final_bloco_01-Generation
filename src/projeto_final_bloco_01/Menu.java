package projeto_final_bloco_01;

import java.io.IOException;
import java.util.Scanner;

import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.Biquini;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.model.SaidaDePraia;
import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ProdutoController produtos = new ProdutoController();
		
		int opcao, id, tipo;
		String nome, descricao;
		float preco;
		
		Biquini b1 = new Biquini(produtos.gerarId(), "Biquíni Fita", 1, 199.90f, "Biquíni Gabriela");
		produtos.cadastrar(b1);
		
		Biquini b2 = new Biquini(produtos.gerarId(), "Biquíni Decote", 1, 179.90f, "Biquíni Cíntia");
		b2.visualizar();
		
		SaidaDePraia s1 = new SaidaDePraia(produtos.gerarId(), "Kimono Longo", 2, 99.00f, "Kimono Longo Estampado");
		produtos.cadastrar(s1);
		
		SaidaDePraia s2 = new SaidaDePraia(produtos.gerarId(), "Kimono Curto", 2, 110.00f, "Kimono Curto liso");
		s2.visualizar();
		
		produtos.listarTodos();
		
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
			leia.nextLine(); // limpa o buffer
			
			if (opcao == 6) {
				System.out.println("\nMaré Baixa - Seu verão começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
	            case 1:
	                System.out.println(Cores.TEXT_WHITE + "Criar produto\n\n");

	                System.out.println("Digite o nome do produto:");
	                nome = leia.nextLine();

	                System.out.println("Escolha o tipo do produto: 1) Biquíni | 2) Saída de praia");
	                tipo = leia.nextInt();
	                leia.nextLine();

	                System.out.println("Digite o preço do produto: ");
	                preco = leia.nextFloat();
	                leia.nextLine();

	                System.out.println("Digite a descrição do produto:");
	                descricao = leia.nextLine();

	                Produto novoProduto;
	                if (tipo == 1) {
	                    novoProduto = new Biquini(produtos.gerarId(), nome, tipo, preco, descricao);
	                } else if (tipo == 2) {
	                    novoProduto = new SaidaDePraia(produtos.gerarId(), nome, tipo, preco, descricao);
	                } else {
	                    System.out.println("Tipo de produto inválido!");
	                    break;
	                }

	                produtos.cadastrar(novoProduto);
	                keyPress();
	                break;

	            case 2:
	                System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n\n");
	                produtos.listarTodos();
	                keyPress();
	                break;

	            case 3:
	                System.out.println(Cores.TEXT_WHITE + "Buscar produto por ID \n\n");
	                System.out.println("Digite o ID do produto:");
	                id = leia.nextInt();
	                try {
	                    Produto produto = produtos.procurarPorId(id);
	                    produto.visualizar();
	                } catch (Exception e) {
	                    System.out.println(e.getMessage());
	                }
	                keyPress();
	                break;

	            case 4:
	                System.out.println(Cores.TEXT_WHITE + "Atualizar dados do produto\n\n");
	                System.out.println("Digite o ID do produto:");
	                id = leia.nextInt();
	                leia.nextLine();

	                try {
	                    Produto produtoExistente = produtos.procurarPorId(id);

	                    System.out.println("Digite o novo nome do produto:");
	                    nome = leia.nextLine();

	                    System.out.println("Digite o novo preço do produto:");
	                    preco = leia.nextFloat();
	                    leia.nextLine();

	                    System.out.println("Digite a nova descrição do produto:");
	                    descricao = leia.nextLine();

	                    Produto produtoAtualizado;
	                    if (produtoExistente instanceof Biquini) {
	                        produtoAtualizado = new Biquini(id, nome, 1, preco, descricao);
	                    } else if (produtoExistente instanceof SaidaDePraia) {
	                        produtoAtualizado = new SaidaDePraia(id, nome, 2, preco, descricao);
	                    } else {
	                        System.out.println("Tipo de produto desconhecido!");
	                        break;
	                    }

	                    produtos.atualizar(produtoAtualizado);
	                } catch (Exception e) {
	                    System.out.println(e.getMessage());
	                }
	                keyPress();
	                break;

	            case 5:
	                System.out.println(Cores.TEXT_WHITE + "Apagar produto \n\n");
	                System.out.println("Digite o ID do produto:");
	                id = leia.nextInt();
	                try {
	                    produtos.deletar(id);
	                } catch (Exception e) {
	                    System.out.println(e.getMessage());
	                }
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