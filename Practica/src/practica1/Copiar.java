package practica1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Copiar {
	Scanner entrada = new Scanner(System.in);
	
	public void copiarArchivo(){
		
		 String antiguo = entrada.nextLine();
		 System.out.print("$java Administrador copiar " + antiguo + " ");
		 String nuevo = entrada.nextLine();
	     System.out.println("$java Administrador copiar " + antiguo + " " + nuevo);
		
		//File origen = new File("C:\\Users\\Montse\\Documents\\NetBeansProjects\\Copiar2\\hola.txt");
		//File destino = new File("C:\\Users\\Montse\\Documents\\NetBeansProjects\\Copiar2\\backupVisibles\\hola.txt");

	   File origen = new File(antiguo);
       File destino = new File(nuevo);

		try {
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
            }
            System.out.println("Se Copio Correctamente");
            in.close();
            out.close();
		} catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("No se Copio");
		}
	}
}
