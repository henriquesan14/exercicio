
public class Produto {
	private String nome;
	private double preco;
	private int codigo;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Produto [codigo: " + codigo + "][nome: " + nome + ", preco: " + preco + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double valorDesconto(){
		return this.preco*0.02;
	}

	public Produto(int codigo,String nome, double preco) {
		super();
		this.codigo=codigo;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override //Verifica se o atributo 'codigo' do objeto Produto é igual ao do objeto passando por parâmetro.
	   public boolean equals(Object o) {
	      boolean result = false;
	      if (this.getCodigo() == ((Produto)o).getCodigo()) {
	         result = true;
	      }
	      return result;
	   }   
	
	
}
