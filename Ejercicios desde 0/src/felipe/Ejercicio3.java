package felipe;

public class Ejercicio3
{
// calcular a traves de un radio la longitud de un circulo
	public static void main(String[] args)
	{
		double l,r; //longitud y radio
		
		System.out.print("Introduce el radio de una cicunferencia: ");
		r=Entrada.real();
		
		l=2*Math.PI*r;
		
		System.out.println("La longitud de una circunferencia de radio " + r+ "es: " +l);
	}

}














