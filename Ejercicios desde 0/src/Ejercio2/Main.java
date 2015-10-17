package Ejercio2;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,r; //area y radio
		
		System.out.print("Introduce el radio de un circulo: ");
		r=Entrada.real();
		a=Math.PI*(r*r);
		
		System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
	}

}
