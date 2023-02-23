package com.curso.ceat.controller;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// mi objeto 1 -> cta
		System.out.println("Ingrese Nombre :");
		String nombre = new Scanner(System.in).nextLine();
		System.out.println("Ingrese Dni :");
		String nidni = new Scanner(System.in).nextLine();
		
		CuentaCorriente miCta = new CuentaCorriente(nombre, nidni);
		System.out.println("Cuanto Quiere Ingresar");
		double miIngreso = new Scanner(System.in).nextDouble();
		miCta.ingreso(miIngreso);
//		miCta.mostrarInformacion();
		
		// pregunto el banco
		System.out.println("Ingrese Nombre Del Banco :");
		CuentaCorriente.setNombreBanco(new Scanner(System.in).nextLine());
		
		System.out.println("Cuanto Quieres Retirar :");
		double miEgreso = new Scanner(System.in).nextDouble();
		miCta.egreso(miEgreso);
		Gestor miGestor1=new Gestor("JOSE LUIS", "X1234567");
		miCta.miGestor = miGestor1;
		miCta.mostrarInformacion();
		
//*************************************************************
		
System.out.println("******* cta2***********");		
		
		
		System.out.println("Ingrese Dni :");
		 nidni = new Scanner(System.in).nextLine();
		
		System.out.println("Ingrese El Saldo Inicial :");
		double saldoInicial = new Scanner(System.in).nextDouble();
		
		CuentaCorriente miCta2 = new CuentaCorriente(nidni, saldoInicial);
		
		System.out.println("Ingrese Nombre :");
		 nombre = new Scanner(System.in).nextLine();
		
		 Gestor miGestor2=new Gestor("beatriz lopez", "X987654");
		 miCta2.miGestor = miGestor2;
		System.out.println("datos de la cuenta 1");
		miCta.mostrarInformacion();
		
		System.out.println("datos de la cuenta 2");
		miCta2.mostrarInformacion();
	
//		System.out.println("******* Gestor 1***********");
		
	}

}
