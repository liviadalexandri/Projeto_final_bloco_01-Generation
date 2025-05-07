package projeto_final_bloco_01.model;

public class Biquini extends Produto{
	
	private String biquiniFita;

	public Biquini(int id, String nome, int tipo, float preco, String biquiniFita) {
		super(id, nome, tipo, preco);
		this.biquiniFita = biquiniFita;
	}

	public String getBiquiniFita() {
		return biquiniFita;
	}

	public void setBiquiniFita(String biquiniFita) {
		this.biquiniFita = biquiniFita;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome do modelo: " + this.biquiniFita);

	}

}