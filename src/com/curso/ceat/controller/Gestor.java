package com.curso.ceat.controller;

public class Gestor {

	public String nombreGestor;
	private String telefono;
	double importeMax;
	
	public Gestor(String nombreGestor, String telefono) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = 10000;
	}

	public Gestor(String nombreGestor, String telefono, double importeMax) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = importeMax;
	}

	
// solo para consultar el telefono
	public String getTelefono() {
		return telefono;
	}

	void mostraInfoGestor()
	{
		System.out.println("Nombre ->" + this.nombreGestor);
		System.out.println("Telefono ->" + this.telefono);
		System.out.println("Importe Maximo ->" + this.importeMax);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
