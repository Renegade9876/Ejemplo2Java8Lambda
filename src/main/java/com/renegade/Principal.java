package com.renegade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public void ordenar(){
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Tres");
		lista.add("Cuatro");

		/** Clase An�nima. Ordena la lista por orden alfab�tico.
		As� lo hac�a con Java7 utilizando clases an�nimas 
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		}); */
		
		// Ahora con Java8, sustituyo la clase An�nima con un Lambda
		Collections.sort(lista, (String o1, String o2) -> o1.compareTo(o2));
		
		for(String e: lista){
			System.out.println(e);
		}
		
	}
	
	
	
	public static void main(String[] args) {

		Principal p = new Principal();
		p.ordenar();
	}

}
