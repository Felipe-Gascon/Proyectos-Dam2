package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		double a,b,c; //coeficientes ax`2+bx+c=0
		double x1,x2,d; //soluciones y determinante
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Introduzca primer coeficiente (a): ");
		a = sc.nextDouble();
		System.out.println("Introduzca segundo coeficiente (b): ");
		b = sc.nextDouble();
		System.out.println("Introduzca tercer coeficiente (c): ");
		c = sc.nextDouble();
		
		
		//Calculamos el determinante
		
		d = ((b*b)-4*a*c);
		if(d<0){
			System.out.println("No existen soluciones reales");
		}
		else{
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Solucion: "+x1);
			System.out.println("Solucion: "+x2);
		}
	
	
	
	
	
	}

}
