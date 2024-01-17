/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio Areglos Dinamicos                                          | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/

import java.util.ArrayList;

public class ArreglosDinamicos {
    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Agregar elementos al ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Mostrar los elementos del ArrayList
        System.out.println("Elementos del ArrayList: " + numeros);

        // Acceder y modificar elementos del ArrayList
        int primerElemento = numeros.get(0);
        numeros.set(1, 25);

        // Eliminar elementos del ArrayList
        numeros.remove(2);

        // Mostrar los elementos actualizados del ArrayList
        System.out.println("Elementos actualizados del ArrayList: " + numeros);
    }
}
