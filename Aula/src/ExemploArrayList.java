
import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Double> lista2 = new ArrayList<>();
		ArrayList<String> lista3 = new ArrayList<>();
		
		ArrayList<Object> bandas = new ArrayList<>();
		
		bandas.add("Pink Floyd");
		bandas.add(1967);
		bandas.add(307.6);
		
		for (int i = 0; i < bandas.size(); i++) {
			System.out.println(bandas.get(i));
		}
		
		// add() -> Adiciona um item a lista.
		// remove() -> Remove um item da lista.
		// get() -> "Pega" um item da lista.
		// size() -> Dá o tamanho da lista.
		// clear() -> Limpa todos os elementos da lista.
		
		lista1.add(10);
		lista1.add(-5);
		
		lista2.add(7.8);
		lista2.add(3.7);
		
		lista3.add("banana");
		lista3.add("morango");
		lista3.add("siriguela");
		lista3.add("manga");
		lista3.add("guanabana");
		
		lista3.add(0, "abacaxi");
		
		lista3.clear();
		
		for (int i = 0; i < lista3.size(); i++) {
			System.out.println(lista3.get(i));
		}
		
		System.out.println();
		lista3.remove("guanabana");
		
		for (int i = 0; i < lista3.size(); i++) {
			System.out.println(lista3.get(i));
		}
	}
}
