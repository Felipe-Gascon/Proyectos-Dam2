package felipe;

public class Main {

	public static void main(String[] args) {
		// Pedir los coeficientes de una ecuacion de 2º grado y que muestre
		//sus soluciones reales sino existe, debe indicarlo
		
		double a,b,c; //coeficientes ax^2+bx+c=0
		double x1,x2,d; //soluciones y determinante
		
		System.out.println("Introduzca primer coeficiente (a):");
		a= Entrada.entero();
		System.out.println("Introduzca segundo coeficiente (b):");
		b=Entrada.entero();
		System.out.println("Introduzca tercer coeficiente (c):");
		c=Entrada.entero();
		
		// calcular determinante
		d=((b*b)-4*a*c);
		if(d<0)
			System.out.println("No existen soluciones reales");
		else
		{
			//confirmar que sea distinto a 0
			// si a=0 encontramso una divison por 0
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Solución: " +x1);
			System.out.println("Solución: " +x2);

		}

	}

}
