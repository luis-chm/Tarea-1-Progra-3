/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Trabajo en casa                                                      | |
|                                                                     | |
|Luis Angel Chaves Mora                                               |_|
|_____________________________________________________________________|/|
 
*/ 
  
import java.util.Scanner;

public class TrabajoEnCasa
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner teclado = new Scanner(System.in);
		
	/*Declaracion de variables de memoria
	Float o Double: se usan para guardar números en memoria que tienen parte entera y parte decimal.*/
	int CodigoEmpleado = 0;
	int HorasSemana = 0;
	int PrecioHora = 0;
	int HorasOrdinarias = 0;
	int HorasExtras = 0;
	double SalarioBruto = 0;
	double Deducciones = 0;
	double SalarioNeto = 0;
		
	//Seccion de entrada de datos por teclado
	System.out.println("Digite el código del empleado: ");
	CodigoEmpleado = teclado.nextInt();
	System.out.println("Digite las horas trabajadas en una semana: ");
	HorasSemana = teclado.nextInt();
	System.out.println("Digite el precio por horas trabajadas: ");
	PrecioHora = teclado.nextInt();
		
	//Cantidad horas ordinarias y horas extras
	
	/*Si horas trabajadas en una semana son menores o iguales a 40 son horas ordinarias, se calcula multiplicando *4 */
	 if (HorasSemana <= 40) {
         HorasOrdinarias = HorasSemana * 4;
        } 
    /*Si horas trabajadas en una semana son mayores a 40, el resto son horas extras.
    se calculan cantidad horas extras restando 40 horas a las trabajadas en una semana y multiplicando el resultado por 4*/
	else {HorasOrdinarias = 40 * 4;
          HorasExtras = (HorasSemana - 40) * 4;
        }
		
	//Calculo de Salario Bruto
	SalarioBruto = (HorasOrdinarias * PrecioHora) + (HorasExtras * PrecioHora * 1.5);
	
	//Deducciones del 10.67% 
	Deducciones = SalarioBruto * 0.1067;
	
	//Calculo Salario Neto
	SalarioNeto = SalarioBruto - Deducciones;
		
	 //Impresión de resultados
        System.out.println("Código del empleado: " + CodigoEmpleado);
        System.out.println("Horas trabajadas en una semana: " + HorasSemana);
        System.out.println("Horas ordinarias trabajadas en un mes: " + HorasOrdinarias);
        System.out.println("Horas extras trabajadas en un mes: " + HorasExtras);
		System.out.println("El Salario bruto es: C " + SalarioBruto);
        System.out.println("Monto de las deducciones al salario: C " + Deducciones);
        System.out.println("Salario neto: C " + SalarioNeto);
		
		 		
	}
	
}