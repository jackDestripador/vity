package practica1;

import java.util.Scanner;

public class Menu {
	Scanner entrada = new Scanner(System.in);
	
	public Menu(){
	}
	
	
	public void metodoMenu(){
		String op;
		
		do{
			System.out.print( "$java Administrador " );
			op = entrada.nextLine();
		
			switch(op){
			case "informacion":
				
				Informacion objeto1 = new Informacion();
				System.out.println("$java Administrador informacion ");
				objeto1.analizarRuta( entrada.nextLine() );
			break;
			
			case "renombrar":
			
				Renombrar objeto2 = new Renombrar();
				System.out.print("$java Administrador renombrar ");
				objeto2.renombrarArchivo();
			break;
		
			case "copiar":
				
				Copiar objeto3 = new Copiar();
				System.out.print("$java Administrador copiar ");
				objeto3.copiarArchivo();
			break;
			
			case "borrar":
				
				Borrar objeto4 = new Borrar();
				System.out.print("$java Administrador borrar ");
				objeto4.borrarArchivo();
			break;
			
			case "mover":
				
				Mover objeto5 = new Mover();
				System.out.print("$java Administrador mover ");
				objeto5.moverArchivo();
			break;
			
			case "comprimir":
				Comprimir objeto6=new Comprimir();
				System.out.print("$java Administrador comprimir ");
				objeto6.comprimirArchivo();
				
			
			case "salir":
				
			break;
			
			default:
				System.out.println("Comando No valido");
			break;
		}
		}while(op != "salir");	
	}
}
