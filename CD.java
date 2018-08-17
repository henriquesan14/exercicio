
public class CD extends Produto	 {
	
	private int numFaixas;
	
	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

	@Override // metódo toString sobrescrito pra mostrar todos atributos, inclusives o da superClasse.
	public String toString() {
		return "CD [codigo: " + getCodigo() + "][nome: " + getNome() + "][preco: " + getPreco() + "][numFaixas: " + numFaixas + "]";
	}
	
	public CD(int codigo,String nome, double preco, int numFaixas) {
		super(codigo,nome,preco);
		this.numFaixas = numFaixas;
	}

	@Override
	public double valorDesconto(){
		return super.getPreco()*0.05;
	}

	
	
}
