package projeto_final_bloco_01.model;

import java.text.NumberFormat;

public abstract class Produto {
	
	private int id;
	private String nome;
	private int tipo;
	private float preco;
	
	
	public Produto(int id, String nome, int tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public float getPreço() {
		return preco;
	}


	public void setPreço(float preço) {
		this.preco = preço;
	}
	
public void visualizar() {
		
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		String tipo = "";
		
		switch(this.tipo) {
		  case 1 -> tipo = "Biquíni";
		  case 2 -> tipo = "Saída de Praia";
		  default -> tipo = "Inválido";
		
		
		}
		
		System.out.println("\n\n*************************************");
		System.out.println("           DADOS DO PRODUTO            ");
		System.out.println("-------------------------------------");
		System.out.println("ID do produto: " + this.id);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Tipo de produto: " + tipo);
		System.out.println("Valor do produto: " + nfMoeda.format(this.preco));
	
	}

}

