
public class DVD extends Produto {
	
	private int duracao;
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "DVD [codigo: " + getCodigo() + "][nome: " + getNome() + "][preco: " + getPreco() + "][duracao: " + duracao + " min]";
	}
	
	@Override
	public double valorDesconto(){
		return super.getPreco()*0.05;
	}

	public DVD(int codigo,String nome,double preco,int duracao) {
		super(codigo,nome,preco);
		this.duracao = duracao;
	}

	

}
