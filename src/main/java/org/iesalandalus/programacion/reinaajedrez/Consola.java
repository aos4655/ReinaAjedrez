package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;

import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;

public class Consola {
	private Consola() {
		
	}
	public void MostrarMenu() {
		System.out.println("Las opciones de nuestro menu son:");
		System.out.println("1) Crear reina por defecto");
		System.out.println("2) Crear reina eligiendo color");
		System.out.println("3) Mover ");
		System.out.println("4) Salir");

	}
	public int elegirOpcionMenu() {
		int opcion=0;
		switch (opcion) {
			case 1: 
				opcion =1;
				break;
			case 2:
				opcion =2;
				break;
			case 3:
				opcion =3;
				break;
			case 4:
				opcion =4;
				break;
		}
		return opcion;	
	}
	public Color elegirColor() {
		return null;
		
	}
	public void mostrarMenuDirecciones() {
		
	}
	public Direccion elegirDireccion() {
		return null;
		
	}
	public int elegirPasos() {
		return 0;
		
	}
	public void desperdirse() {
		System.out.println("Hasta luego Lucas!");
	}
}
