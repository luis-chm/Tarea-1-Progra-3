

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Solicitar el código del empleado
        System.out.print("Ingrese el código del empleado: ");
        int codigoEmpleado = sc.nextInt();
        
        // 2. Solicitar las horas trabajadas en una semana
        System.out.print("Ingrese las horas trabajadas en una semana: ");
        int horasSemana = sc.nextInt();
        
        // 3. Solicitar el precio por hora trabajada
        System.out.print("Ingrese el precio por hora trabajada: $");
        double precioHora = sc.nextDouble();
        
        // 4. Calcular las horas ordinarias y las horas extras en un mes
        int horasOrdinarias = horasSemana * 4;
        int horasExtras = 0;
        if (horasSemana > 40) {
            horasExtras = (horasSemana - 40) * 4;
        }
        
        // 5. Calcular el salario bruto
        double salarioBruto = (horasOrdinarias * precioHora) + (horasExtras * precioHora * 1.5);
        
        // 6. Calcular el monto de las deducciones
        double deducciones = salarioBruto * 0.1067;
        
        // 7. Calcular el salario neto
        double salarioNeto = salarioBruto - deducciones;
        
        // 8. Imprimir los resultados
        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Horas trabajadas en una semana: " + horasSemana);
        System.out.println("Horas ordinarias trabajadas en un mes: " + horasOrdinarias);
        System.out.println("Horas extras trabajadas en un mes: " + horasExtras);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
        
        sc.close();
    }

}