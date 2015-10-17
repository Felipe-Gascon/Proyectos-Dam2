package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double a,r; //area y radio
		Scanner sc;
		
		sc = new Scanner(System.in);
		System.out.println("Introduce el radio de un circulo: ");
		r=sc.nextInt();
		
		a=Math.PI*(Math.pow(r, 2)); //eleva al cuadrado
		
		System.out.println("El área de una circunferencia de radio "+r+" es: "+a);
	}

}
