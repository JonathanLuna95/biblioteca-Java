package com.biblioteca.test;

import java.util.ArrayList;

import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;

public class BibliotecaTest2 {

	public static void main(String[] args) {

		Libro l1 = new Libro(
				"Gabriel Garcia Marquez",
				"Cien años de soledad",
				"Novela",
				1967,
				18.50
		);

		Libro l2 = new Libro(
				2,
				"George Orwell",
				"1984",
				"Ficcion",
				1949,
				22.00
		);

		Libro l3 = new Libro(
				"Isabel Allende",
				"La casa de los espiritus",
				"Novela",
				1982,
				25.50
		);

		Libro l4 = new Libro(
				4,
				"Miguel de Cervantes",
				"Don Quijote de la Mancha",
				"Novela",
				1605,
				30.00
		);

		Libro l5 = new Libro(
				"Gabriel Garcia Marquez",
				"El amor en los tiempos del colera",
				"Novela",
				1985,
				20.00
		);

		Biblioteca b1 = new Biblioteca();

		b1.agregarLibro(l1);
		b1.agregarLibro(l2);
		b1.agregarLibro(l3);
		b1.agregarLibro(l4);
		b1.agregarLibro(l5);

		System.out.println("Libros: " + b1.getLibros());

		ArrayList<Libro> libros = b1.buscarPorCadena("Gabriel");

		System.out.println("Libros encontrados: " + libros);

		System.out.println();

		System.out.println("Eliminar registro");

		System.out.println("Cantidad de libros: " + b1.getLibros().size());

		b1.eliminarLibro(new Libro());

		System.out.println("Cantidad de libros con new Libro: "
				+ b1.getLibros().size());

		b1.eliminarLibro(null);

		System.out.println("Cantidad de libros con null: "
				+ b1.getLibros().size());

		// Eliminar con indice
		Libro libro = b1.eliminarLibro(2);

		System.out.println("Cantidad de libros con indice: "
				+ b1.getLibros().size());

		System.out.println("Libro eliminado: " + libro);
	}

}