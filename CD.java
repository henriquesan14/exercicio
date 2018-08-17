
public class CD extends Produto	 {
	
	private int numFaixas;
	
	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

	@Override // metódo toString sobrescrito pra mostrar todos atributos, inclusives o da superClasse Produto.
	public String toString() {
		return "CD [codigo: " + getCodigo() + "][nome: " + getNome() + "][preco: " + getPreco() + "][numFaixas: " + numFaixas + "]";
	}
	
	
	//metódo construtor passando como parâmetro os atributos da classe CD super classe Produto.
	public CD(int codigo,String nome, double preco, int numFaixas) {
		super(codigo,nome,preco);  // chamando construtor da super classe.
		this.numFaixas = numFaixas;
	}

	@Override 
	public double valorDesconto(){
		return super.getPreco()*0.05;
	}

	
	
}
