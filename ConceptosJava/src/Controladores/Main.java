package Controladores;

import java.util.ArrayList;
import java.util.List;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz me = new MenuImplementacion();
		
		OperativaInterfaz op = new OperativaImplementacion();
		
		List<Object> listaNumes = new ArrayList<>();
		
		
		boolean cerrarMenu = false;
		
		while (!cerrarMenu) {
			
			int seleccMenu = me.MenuPrin();
			
			switch(seleccMenu) {
				
				case 0: 
					System.out.println("[INFO] -> Se cerrara la Aplicacion ");
					cerrarMenu = true;
				break;
					
				case 1:
				
					System.out.println("[INFO] -> Debera Introducir un Valor");
					me.solNum(listaNumes);
				break;
				
				case 2:
					
					System.out.println("[INFO] -> Se mostrara la Lista");
					op.mostrarLista(listaNumes);
					
				break;
				
				
				case 3:
					
					System.out.println("[INFO] -> Se Realizara toda la Operativa");					
					op.interLista(listaNumes);
					op.listaNueva(listaNumes);
				break;
				
				
				default:
					System.out.println("Seleccion no Valida");
				break;
			
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
