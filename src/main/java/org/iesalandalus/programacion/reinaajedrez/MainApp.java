package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	private static Reina reina1;
	
	public static void main(String[] args) throws OperationNotSupportedException {
		int op;
		boolean avanza = false;
		Consola.MostrarMenu();
		op = Consola.elegirOpcionMenu();
		if(op == 3 && reina1 == null) {
			System.out.println("Error: debes crear una reina antes de poder mover");
		}
		else if((op<1 || op>4) && reina1 != null) {
			avanza = true;
			ejecutarOpcion(op);
		}
		do {
			Consola.MostrarMenu();
			op= Consola.elegirOpcionMenu();
			if(op == 3 && reina1 == null) {
				System.out.println("Error: debes crear una reina antes de poder mover");
			}
			else {
				ejecutarOpcion(op);
			}
		}
		while(avanza == false);
	}
	public static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {
		switch (opcion) {
		case 1: 
			crearReinaDefecto();
			mostrarReina();
			break;
		case 2:
			Color c = Consola.elegirColor();
			crearReinaColor(c);
			mostrarReina();
			break;
		case 3:
			mover();
			mostrarReina();
			break;
		case 4:
			Consola.desperdirse();
			break;
		}
	}
	public static void crearReinaDefecto() {
		reina1 = new Reina();
	}
	public static void crearReinaColor(Color color) {
		reina1 = new Reina(color);
	}
	public static void mover() throws OperationNotSupportedException  {
		if(reina1==null) {
			System.out.println("ERROR: Debes crear primero una reina");
		}
		else {
			Consola.mostrarMenuDirecciones();
			Direccion d = Consola.elegirDireccion();
			int p = Consola.elegirPasos();
			try {
				reina1.mover(d, p);
			}catch(IllegalArgumentException|OperationNotSupportedException e) {
				System.out.println(e.getMessage()+"\n");
			}
		}
		
	}
	public static void mostrarReina() {
		System.out.println(reina1.toString());
	}
}
