package felipe;
//Pedir dos n�meros y mostrarlos ordenados de mayor a menor
public class Ejercicio9 {

	public static void main(String[] args) {
		int n1,n2;
		System.out.print("Introduce un n�mero: ");
		n1=Entrada.entero();
		
		System.out.print("Introduce otro n�mero: ");
		n2=Entrada.entero();
		
		if(n1>n2)
			System.out.println(n1 + " y " + n2);
		else
			System.out.println(n2 + " y " + n1);
				
	}

}
