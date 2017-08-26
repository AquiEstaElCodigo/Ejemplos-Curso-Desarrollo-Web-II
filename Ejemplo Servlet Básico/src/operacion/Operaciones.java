package operacion;

public class Operaciones 
{
	int resultado;
	
	
	public int determinarResultado(int opcion, int a, int b)
	{
		
		switch(opcion)
		{
		case 1:
			resultado = this.realizarSuma(a, b);
			return resultado;
			
			
		case 2:
			resultado = this.realizarResta(a, b);
			return resultado;
			
			
		case 3:
			resultado = this.realizarDivision(a, b);
			return resultado;
			
			
		case 4:
			resultado = this.realizarMultiplicacion(a, b);
			return resultado;
			
		default:
			return 0;
		}
		
		
	}
	
	public int realizarSuma(int a, int b)
	{
		resultado = a + b;
		return resultado;
	}
	
	public int realizarResta(int a, int b)
	{
		resultado = a - b;
		return resultado;
	}
	
	public int realizarDivision(int a, int b)
	{
		resultado  =  a / b;
		return resultado;
	}
	
	public int realizarMultiplicacion(int a, int b)
	{
		resultado  = a * b;
		return resultado;
	}
	
}//.
