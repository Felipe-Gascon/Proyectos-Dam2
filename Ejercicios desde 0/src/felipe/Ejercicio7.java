package felipe;
//Pedir dos numeros y decir cual es el mayor
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		
		System.out.print("Introduce un n�mero: ");
		n1=Entrada.entero();
		System.out.print("Introduce otro n�mero: ");
		n2=Entrada.entero();
		
		if(n1>n2)
			System.out.println(n1 + " es mayor que " + n2);
		else
			System.out.println(n2 + " es mayor que " + n1);

	}

}
