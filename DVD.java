
public class DVD extends Produto {
	
	private int duracao;
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override // metódo toString sobrescrito pra mostrar todos atributos, inclusives o da superClasse Produto.
	public String toString() {
		return "DVD [codigo: " + getCodigo() + "][nome: " + getNome() + "][preco: " + getPreco() + "][duracao: " + duracao + " min]";
	}
	
	@Override
	public double valorDesconto(){
		return super.getPreco()*0.05;
	}
	
	
	//metódo construtor passando como parâmetro os atributos da classe DVD e super classe Produto.
	public DVD(int codigo,String nome,double preco,int duracao) {
		super(codigo,nome,preco);
		this.duracao = duracao;
	}

	

}