package felipe;

public class Ejercicio5 {

	public static void main(String[] args) {
			//Pedir un n�mero e indicar si es positivo o negativo.
		
		int num;
		System.out.print("Introduce un numero: ");
		num=Entrada.entero();
		
		if(num < 0)
			System.out.println("El n�mero es negativo");
		else
			System.out.println("El numero es positivo");
	}

}
