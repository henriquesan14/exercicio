import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> produtos=new ArrayList<>();
		Produto livro=new Livro(1,"Livro1",5.50,"Henrique");
		Produto cd=new CD(2,"RobertoCarlos",7,22);
		Produto dvd=new DVD(3,"BrunoMarrone",10,150);
		Produto livro2=new Livro(4,"Livro2",10,"Machado");
		Produto cd2=new CD(5,"RenatoRusso",30,160);
		produtos.add(livro);
		produtos.add(cd);
		produtos.add(dvd);
		produtos.add(livro2);
		produtos.add(cd2);
		Produto dvd2=new DVD(3,"BrunoMarrone",10,150);
		Produto dvd3=new DVD(6,"BrunoMarrone",10,150);
		busca(dvd2,produtos);
		busca(dvd3,produtos);
		
		
	}
	
	public static void busca(Produto produtoBusc,ArrayList<Produto> produtos){
		int i=1;
		boolean busca=false;
			for(Produto produto: produtos){
				if (produto.equals(produtoBusc)){
					System.out.println("Produto encontrado, posição: "+i);
					busca=true;
					break;
				}else{
					i++;
				}
			}
			if(!busca){
				System.out.println("Produto não encontrado");
			}
			
	}
	
 
}
