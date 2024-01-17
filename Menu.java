import java.util.Scanner;

public class Menu {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int opcion = 0;
      do {
         System.out.println("Menu:");
         System.out.println("1. Opcion 1");
         System.out.println("2. Opcion 2");
         System.out.println("3. Opcion 3");
         System.out.println("4. Salir");
         System.out.print("Seleccione una opcion: ");
         opcion = scanner.nextInt();
         switch(opcion) {
            case 1:
               System.out.println("\nSeleccionaste la opcion 1\n");
               break;
            case 2:
               System.out.println("\nSeleccionaste la opcion 2\n");
               break;
            case 3:
               System.out.println("\nSeleccionaste la opcion 3\n");
               break;
            case 4:
               System.out.println("\nAdios!\n");
               break;
            default:
               System.out.println("\nOpcion invalida\n");
         }
      } while(opcion != 4);
   }
}
