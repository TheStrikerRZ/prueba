package parcial1;

import java.util.Scanner;

public class Parcial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;

        double salarioNeto, sueldoDevegado, sueldoTotal, sueldoBasico, ventas = 0, prestamos, auxilio = 0, comision, deducciones;
        int dias, cedula;
        
        System.out.println("Ingrese la cedula del vendedor: ");
        cedula=sc.nextInt();
        System.out.println("Ingrese el nombre del vendedor: ");
        nombre=sc.next();
        System.out.println("Ingrese el salario basico del vendedor:");
        sueldoBasico=sc.nextDouble();
         
        System.out.println("Ingrese numero de días laburados (entre 1 y 30):");
        dias = sc.nextInt();

        if (dias >= 1 && dias <= 30) {
            System.out.println("Ingrese el total de ventas realizadas por el vendedor en el mes:");
            ventas = sc.nextDouble();
            System.out.println("Ingrese los prestamos realizados");
            prestamos = sc.nextDouble();
            //operaciones  
            sueldoTotal = (sueldoBasico * dias) / 30;
            comision = ventas * 0.02;
            if (sueldoBasico <= 2600000) {
                auxilio = 162000 * (dias / 30);
            } else {

            }
            
            sueldoDevegado=auxilio+sueldoTotal+comision;
            
            
            salarioNeto=sueldoDevegado-prestamos;
            
            System.out.println("Cedula del empleado: "+cedula);
            System.out.println("Nombre del empleado: "+nombre);
            System.out.println("Salario basico: "+sueldoBasico);
            System.out.println("Dias laborados: "+dias);
            System.out.println("Prestamos: "+prestamos);
            System.out.println("Comision de venta: "+comision);
            System.out.println("Auxilio de transporte: "+auxilio);
            System.out.println("Total Devengado (COP): "+sueldoDevegado);
            System.out.println("Salario Neto: "+salarioNeto);
            
        } else {
            System.out.println("Error Ingrese un numero entre (1-30)");
        }

    }

}
