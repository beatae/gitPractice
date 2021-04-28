package javalessons;

import java.util.Scanner;

public class OperadoresIgualdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(); 
		
		
	int a=3, b=5;
	/*boolean c= (a == b); //parentesis es lo primero que se evalua en java
	System.out.println(c);
	c = (a != b); /// diferente
	System.out.println(c);
		
	String cadena1 = "hola";
	String cadena2 = "adios";
	System.out.println(cadena1.equals(cadena2));// se debe aplicar equals para strings, no se puede usar ==
	boolean d = a<b;
	System.out.println("es menor? " + d);
	}
	*/
	Scanner scanner = new Scanner(System.in); //  leer en info de la consola
	
	System.out.println("Inserta un numero y presiona enter"); 
	int sh = scanner.nextInt();
	
	if(sh%2 == 0) {
		System.out.println("es par");
	}
	else {
		System.out.println("es impar ");
	}
		
 //  leer en info de la consola
	
	System.out.println("Inserta tu edad y presiona enter"); 
	int edad = scanner.nextInt();

	int adulto = 18;
	
	if(edad>=adulto) {
		System.out.println("es un adulto");
	}
	else {
		System.out.println("es un ninno");
	}
	}

}
