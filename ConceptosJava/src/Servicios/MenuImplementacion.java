package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	
	public int MenuPrin() {
		
		System.out.println("##############################");
		System.out.println("# 0 -> Finalizar el Programa #");
		System.out.println("# 1 -> Introducir un Numero  #");
		System.out.println("# 2 -> Mostrar Lista  #");
		System.out.println("# 3 -> Realizar la Operativa #");
		System.out.println("##############################");
		
		int selecMenu = sc.nextInt();
		return selecMenu;
		

		
		
	}
	
	
	
	
	public int solNum (List<Object> listaNumes) {
		

		
		System.out.println("Introduce un Numero");
		int numIntro = sc.nextInt();
		
		listaNumes.add(numIntro);
		return numIntro;
		
		
		
	}
	
}
