package practica1;

import java.io.File;
import java.util.Scanner;

public class Mover {
	Scanner entrada = new Scanner(System.in);

	public void moverArchivo(){
	
		 String antiguo = entrada.nextLine();
		 System.out.print("$java Administrador mover " + antiguo + " ");
		 String nuevo = entrada.nextLine();
	     System.out.println("$java Administrador mover " + antiguo + " " + nuevo);
		 
	     File archivoAntiguo = new File(antiguo);
		 File archivoNuevo = new File(nuevo);
		 		 
		if(archivoAntiguo.renameTo(archivoNuevo)){
			System.out.println("El archivo se movio correctamente");
		}else{
			System.out.println("El archivo no se pudo mover");
		}
	}
}
