package javalessons;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(); 
		
		
		int a = 3;
		int b = 2;
		
		int resultado = a*b;
		
		System.out.println(resultado); 
		
		int f = ++b; // incrementa en 1
		
		
		
		System.out.println(f); 
		
		
		///decremento
		//posdecremento
		
		
		int j= 2;
		int i= --j;// predecremento afecta la variable, primero se decrementa y luego se asigna el valor a la variable
		System.out.println(j);
		System.out.println(i);
		
		int k= 4;
		int l= k--;// predecremento afecta la variable, primero toma la variable k y luego se llena cuando se vuelve a utilizar
		System.out.println(k);
		System.out.println(l);
		
		
		
		
		
	}

}
