

class VerificarEdad

{
	
 public static void main(String[] args)
	
	
	// ZONA PARA DEFINIR VARIABLES
	{ 
	String nombre =""; 
	int edad, anio = 0;
	
	// ASIGNACION DE VALORES A LAS VARIABLES
	nombre ="Luis";
	anio = 1994;
	
	//zona de procesamiento de datos	
	edad = 2023 - anio;
	
	//uso de la unidad aritmetica logica
	if( edad > 18)
	{
		//Respuesta verdadera y Muestra en pantalla el resultado
	System.out.println ("Nombre: " +nombre);
	System.out.println ("Año Nacimiento: " +anio);
	System.out.println ("Edad es igual a " + edad + ". Por lo tanto, es mayor de edad");
	
	}
	else
	{
		//Respuesta Falsa y Muestra en pantalla el resultado
	System.out.println ("Nombre: " +nombre);
	System.out.println ("Año Nacimiento: " +anio);
	System.out.println ("Edad es igual a " + edad + ". Por lo tanto, es menor de edad");
	}
		
	}
	
}

