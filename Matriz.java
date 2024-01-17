
class Matriz
{     
	public static void main(String[] args)
        {   
      
		int n, m,i,j;
        int A [] [] = new int [50] [50];
        System.out.println ("INTRODUZCA EL NUMERO DE FILAS :");
        n = Leer.datoInt ();
        System.out.println ("INTRODUZCA EL NUMERO DE COLUMNAS :");
        m = Leer.datoInt ();
        for (i = 1 ; i <= n ; i++)
            for (j = 1 ; j <= m ; j++)                
				{
					System.out.println ("A[" + i + "] [" + j + "]= ");
      				A [i] [j] = Leer.datoInt ();
                }     
		for (i = 1 ; i <= n ; i++)
     			{
					System.out.println ();
        for (j = 1 ; j <= m ; j++)
            System.out.print (A [i] [j] + " ");
        		}
    } 
}



