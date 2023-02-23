package com.curso.ceat.controller;

public class CuentaCorriente {
	
	Gestor miGestor; //gestor que administra la cuenta
	public String nombre;
	String dni; // las clases vecinas la utilizan
	private double saldo;
	static private String nombreBanco = "International Java Bank";
	
	// metodos get y set del nombre del banco
	public static String getNombreBanco() {
		return nombreBanco;
	}

	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}

	public CuentaCorriente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = 0;
	}

	public CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
		this.nombre = "Sin Definir";
	}
	
	public CuentaCorriente(String nombre, String dni, double saldo, Gestor miGestor) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}
// asignar un nuevo objeto a la cuenta
	
	void setGestor(Gestor miGestor)
	{
		this.miGestor = miGestor;
	}
	
	boolean egreso(double cant)
	{
		boolean operacionPosible = false;
		if(saldo >= cant)
			{
			saldo -= cant;
			operacionPosible = true;
			System.out.println("Tu Saldo Es :" + saldo);
			}
			else 
				{
				System.out.println("Error.. Cantidad Insuficiente");
				operacionPosible = false;
				}
		
		return false;
	}

	void ingreso(double cant)
	{
		saldo += cant;
		System.out.println("Tu Nuevo Saldo Es :"+ saldo);
	}

	void mostrarInformacion()
	{
		if(miGestor == null)// la cta no tiene gestor
			System.out.println("la cta no tiene gestor asignado");
		else {
			System.out.println("Datos Del Gestor");
			miGestor.mostraInfoGestor();
		}	
		
			
		//muestra la informacion de la cta	
		System.out.println("Nombre -> \t" + nombre);
		System.out.println("DNI ->    \t" + dni);
		System.out.println("Saldo ->  \t" + saldo);
		System.out.println("Nombre Del Banco  \t" + nombreBanco);
		
	}
	







}
