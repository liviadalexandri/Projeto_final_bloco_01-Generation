package projeto_final_bloco_01.model;

public class SaidaDePraia extends Produto{
	
	private String kimono;

	public SaidaDePraia(int id, String nome, int tipo, float preco, String kimono) {
		super(id, nome, tipo, preco);
		this.kimono = kimono;
	}

	
	public String getKimono() {
		return kimono;
	}

	
		public void setKimono(String kimono) {
		this.kimono = kimono;
	}



	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome do modelo: " + this.kimono);

	}
}
