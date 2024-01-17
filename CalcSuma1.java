/* Universidad Politecnica Internacional
Ingeneria en Informatica
Intro a la progra
*/

//Importando Bibliotecas
import java.util.Scanner;

public class CalcSuma1
{

	// Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner teclado = new Scanner(System.in);
		
	//Declaracion de variables de memoria
	int A = 0;
	int B = 0;
	int S = 0, P = 0;
	
	//Seccion de entrada de datos por teclado
	System.out.println("Digite un numero entero");
	A = teclado.nextInt();
	System.out.println("Digite otro numero entero");
	B = teclado.nextInt();
	
	
	//Seccion de procesamiento de datos
	S=A+B;
	P=A*B;
	
	//Seccion de salida de datos (Resultados)
	System.out.println("El resultado de la suma " +A+ " mas " +B+ ", es igual: "+S);
	System.out.println("El resultado de la Multiplacion " + A + " por " +B+ ", es igual: "+P);
	
	}
	
}