package practica1;

import java.io.File;
import java.util.Scanner;

public class Borrar {

	Scanner entrada = new Scanner(System.in);

	public void borrarArchivo(){
		String eliminar = entrada.nextLine();
		System.out.println(" ");
		
		File fichero = new File(eliminar);

		if (fichero.delete())
			System.out.println("El fichero ha sido borrado satisfactoriamente");
		else
			System.out.println("El fichero no pudó ser borrado");
	}
}

