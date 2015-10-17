package felipe;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Pedir dos números y decir si son iguales o no.
	int n1,n2;
	System.out.print("Introduce un numero: ");
	n1=Entrada.entero();
	System.out.print("Introduce otro número: ");
	n2=Entrada.entero();
	
	if (n1==n2)
		System.out.println("Son iguales");
	else
		System.out.println("No son Iguales");
	}

}
