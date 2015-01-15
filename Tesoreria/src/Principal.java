
public class Principal
{

	public static void main(String[] args) 
	{
		// Variables
		
		int miDinero=0;
		int dineroQuePierdo=0;
		int ingresos []={10,30,5,15,25};
		int gastos[]= {-10,-50,-70};
		//Codigo
		for (int i=0;i<ingresos.length;i++)
		{
			miDinero += ingresos[i];
		}
		
		for (int i=0;i<gastos.length;i++)
		{
			dineroQuePierdo += gastos[i];
		}
		/*Calcula el Total*/
		int Total=miDinero+dineroQuePierdo;
		
		//Por pantalla
		
		System.out.println("Subtotal ingresos: "+miDinero);
		System.out.println("Subtotal gastos: "+dineroQuePierdo);
		System.out.println("El Total es: "+ Total);
	}

}
