
public class Livro extends Produto {
	
	private String autor;
	
	
	//metódo construtor passando como parâmetro os atributos da classe Livro e super classe Produto.
	public Livro(int codigo,String nome,double preco,String autor) {
		super(codigo,nome,preco);
		this.autor = autor;
	}

	@Override // metódo toString sobrescrito pra mostrar todos atributos, inclusives o da superClasse Produto.
	public String toString() {
		return "Livro  [codigo: " + getCodigo() + "][nome: " + getNome() + "][preco: " + getPreco() + "][autor: " + autor + "]";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public double valorDesconto(){
		return super.getPreco()*0.02;
	}
	

}