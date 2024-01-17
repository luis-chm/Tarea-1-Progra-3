/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Trabajo en casa #2                                                   | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 
  
import java.util.Scanner;

public class Rompecocos
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int n1 = 0;
	int n2 = 0;
	int n3 = 0;
	
	//Entrada de datos
	System.out.println("Digite el primer número entero.");
	n1 = sc.nextInt();
	System.out.println("Digite el segundo número entero.");
	n2 = sc.nextInt();
	System.out.println("Digite el tercer número entero.");
	n3 = sc.nextInt();
	
	//Usando unidad logica condicional de la pc 
	if ((n1 > n2) && (n1 > n3))
	{
		// Respuesta verdadera
		{
			System.out.println("El número mayor es: " +n1);
		}
	
		if(n2 > n3)
		{
			System.out.println("El número intermedio es: " +n2);
			System.out.println("El número menor es: " +n3);
		}
		else{ 
			System.out.println("El número intermedio es: " +n3);
			System.out.println("El número menor es: " +n2);
			}
	}
	else if((n2 > n1) && (n2 > n3))
	{
		//Respuesta verdadera
		{
			System.out.println("El número mayor es: " +n2);
		}
		
		if(n1 > n3)
		{
			System.out.println("El número intermedio es: " +n1);
			System.out.println("El número menor es: " +n3);
		}
		else{ 
			System.out.println("El número intermedio es: " +n3);
			System.out.println("El número menor es: " +n1);
			}
	}	
	else if((n3 > n1) && (n3 > n2))
	{
		//Respuesta verdadera
		{
			System.out.println("El número mayor es: " +n3);
		}
		
		if(n1 > n2)
		{
			System.out.println("El número intermedio es: " +n1);
			System.out.print("El número menor es: " +n2);
		}
		else{
			System.out.println("El número intermedio es: " +n2);
			System.out.println("El número menor es: " +n1);
		}
	}	
	else
		{
		System.out.println("Error");
		}
	}
}
