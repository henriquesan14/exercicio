import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> produtos=new ArrayList<>(); // cria ArrayList de Produtos
		
		//criando objetos de Produtos
		Livro livro=new Livro(1,"Livro1",5.50,"Henrique"); 
		CD cd=new CD(2,"RobertoCarlos",7,22);
		DVD dvd=new DVD(3,"BrunoMarrone",10,150);
		Livro livro2=new Livro(4,"Livro2",10,"Machado");
		CD cd2=new CD(5,"RenatoRusso",30,160);
		
		//adicionando os objetos ao ArrayList produtos
		produtos.add(livro);
		produtos.add(cd);
		produtos.add(dvd);
		produtos.add(livro2);
		produtos.add(cd2);
		
		//criando mais 2 objetos, um com c�digo igual e outro com c�digo diferente dos adicionaos ao ArrayList
		DVD dvd2=new DVD(3,"BrunoMarrone",10,150);
		DVD dvd3=new DVD(6,"BrunoMarrone",10,150);
		
		//chamando met�do busca() pra verificar se o produto existe no ArrayList
		busca(dvd2,produtos);
		busca(dvd3,produtos);
		
		
	}
	
	//met�do de busca pra verificar se existe um produto com mesmo c�digo no ArrayList
	public static void busca(Produto produtoBusc,ArrayList<Produto> produtos){ //par�metro 1:produto buscado, 2: ArrayList 
		int i=1; // variavel pra contar a posi��o do produto
		boolean busca=false; // variavel pra retornar true se o produto existir
			for(Produto produto: produtos){ // la�o de repeti��o pra percorrer o ArrayList
				if (produto.equals(produtoBusc)){  //se existir um produto com mesmo c�digo de barra do produtoBuscado
					System.out.println("Produto encontrado, posi��o: "+i); 
					busca=true; // busca recebe true
					break; // para o la�o
				}else{
					i++; //sen�o for encontrando o produto, vai incrementando posi��o
				}
			}
			if(!busca){
				System.out.println("Produto n�o encontrado");
			}
			
	}
	
 
}