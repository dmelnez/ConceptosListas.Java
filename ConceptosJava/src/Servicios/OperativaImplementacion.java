package Servicios;

import java.util.List;

public class OperativaImplementacion implements OperativaInterfaz {

	
	public void mostrarLista(List<Object> listaNumes) {
		
		System.out.println("Contenido de la Lista");
		
		for(Object nom : listaNumes) {
			System.out.println(nom);
		}
		
		
	}
	
	public void interLista(List<Object> listaNumes) {
		System.out.println("Modificacion de la Lista");
		
	int segValor = (int) listaNumes.set(2,listaNumes.get(4));
	
	listaNumes.set(4, segValor);
		
		
	}
	
	public void listaNueva(List<Object> listaNumes) {
		System.out.println("Contenido de la Lista Modificada");
		
		for(int i=0;i<listaNumes.size();i++) {
			System.out.println(listaNumes.get(i));		
		}
		
	}
	
	
	
}
