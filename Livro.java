
public class Livro extends Produto {
	
	private String autor;
	
	
	
	public Livro(int codigo,String nome,double preco,String autor) {
		super(codigo,nome,preco);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro  [codigo: " + getCodigo() + "][nome: " + getNome() + "][preco: " + getPreco() + "][autor: " + autor + "]";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
