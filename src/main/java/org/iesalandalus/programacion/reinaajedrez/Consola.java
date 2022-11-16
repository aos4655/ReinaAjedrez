package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;

import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private Consola() {
	}
	public static void MostrarMenu() {
		System.out.println("Las opciones de nuestro menu son:");
		System.out.println("1) Crear reina por defecto");
		System.out.println("2) Crear reina eligiendo color");
		System.out.println("3) Mover ");
		System.out.println("4) Salir");

	}
	public static int elegirOpcionMenu() {
		int opcion = 0;
		while (opcion<1 || opcion >4) {
			System.out.println("Elija la opcion");
			opcion = Entrada.entero();
		}
		
		return opcion;	
	}
	public static Color elegirColor() {
		System.out.println("Elija un color:");
		System.out.println("1) Blanco");
		System.out.println("2) Negro");
		Color color = null;
		int c = Entrada.entero();
		while (c<1 || c>2) {
			System.out.println("Elija el color");
			System.out.println("1) Blanco");
			System.out.println("2) Negro");
			c = Entrada.entero();
		}
		switch (c) {
		case 1: 
			color = Color.BLANCO;
			break;
		case 2:
			color = Color.NEGRO;
			break;
		}
		return color;
		
		
	}
	public static void mostrarMenuDirecciones() {
		System.out.println("Las posibles direcciones son:");
		System.out.println("1) Norte");
		System.out.println("2) Sur");
		System.out.println("3) Este");
		System.out.println("4) Oeste");
		System.out.println("5) Noreste");
		System.out.println("6) Noroeste");
		System.out.println("7) Sureste");
		System.out.println("8) Suroeste");
	}
	public static Direccion elegirDireccion() {
		System.out.println("Elija una direccion (numero): ");
		Direccion direccion = null;
		int d = Entrada.entero();
		while (d<1 && d>8) {
			System.out.println("Elija una direccion (numero): ");
			d = Entrada.entero();	
		}
		switch (d) {
		case 1: 
			direccion = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.SUR;
			break;
		case 3: 
			direccion = Direccion.ESTE;
			break;
		case 4:
			direccion = Direccion.OESTE;
			break;
		case 5: 
			direccion = Direccion.NORESTE;
			break;
		case 6:
			direccion = Direccion.NOROESTE;
			break;
		case 7: 
			direccion = Direccion.SURESTE;
			break;
		case 8:
			direccion = Direccion.SUROESTE;
			break;
		}
		return direccion;
	}
	public static int elegirPasos() {
		int pasos = 0;
		while (pasos<1 || pasos >8) {
			System.out.println("Introduzca el numero de pasos: ");
			pasos = Entrada.entero();
		}
		return pasos;
	}
	public static void desperdirse() {
		System.out.println("Hasta luego Lucas!");
	}
}
