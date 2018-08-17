import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> produtos=new ArrayList<>(); // cria ArrayList de Produtos
		
		//criando objetos de Produtos
		Produto livro=new Livro(1,"Livro1",5.50,"Henrique"); 
		Produto cd=new CD(2,"RobertoCarlos",7,22);
		Produto dvd=new DVD(3,"BrunoMarrone",10,150);
		Produto livro2=new Livro(4,"Livro2",10,"Machado");
		Produto cd2=new CD(5,"RenatoRusso",30,160);
		
		//adicionando os objetos ao ArrayList produtos
		produtos.add(livro);
		produtos.add(cd);
		produtos.add(dvd);
		produtos.add(livro2);
		produtos.add(cd2);
		
		//criando mais 2 objetos, um com código igual e outro com código diferente dos adicionaos ao ArrayList
		Produto dvd2=new DVD(3,"BrunoMarrone",10,150);
		Produto dvd3=new DVD(6,"BrunoMarrone",10,150);
		
		//chamando metódo busca() pra verificar se o produto existe no ArrayList
		busca(dvd2,produtos);
		busca(dvd3,produtos);
		
		
	}
	
	//metódo de busca pra verificar se existe um produto com mesmo código no ArrayList
	public static void busca(Produto produtoBusc,ArrayList<Produto> produtos){ //parâmetro 1:produto buscado, 2: ArrayList 
		int i=1; // variavel pra contar a posição do produto
		boolean busca=false; // variavel pra retornar true se o produto existir
			for(Produto produto: produtos){ // laço de repetição pra percorrer o ArrayList
				if (produto.equals(produtoBusc)){  //se existir um produto com mesmo código de barra do produtoBuscado
					System.out.println("Produto encontrado, posição: "+i); 
					busca=true; // busca recebe true
					break; // para o laço
				}else{
					i++; //senão for encontrando o produto, vai incrementando posição
				}
			}
			if(!busca){
				System.out.println("Produto não encontrado");
			}
			
	}
	
 
}
