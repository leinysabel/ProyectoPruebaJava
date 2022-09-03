import java.util.Scanner;

public class CiclosAnidados {
    public static void main(String[] args) throws Exception {
        
        String nombre_empleado = "";
        int clave_departamento = 0;
        int antiguedad = 0;
        int dias_vacaciones = 0;
        
        System.out.println("************************************************************************");
        System.out.println("*******Bienvenido al sistema de vacaciones de Cocacola Company**********");
        System.out.println("************************************************************************");

        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingresa tu nombre: " );
        nombre_empleado = entrada.nextLine();

        System.out.println("Ingresa tu clave así: \n 1. Atención al cliente \n 2. Logística \n 3. Gerencia");
        clave_departamento = entrada.nextInt();

        System.out.println("Ingresa tu antiguedad en años: " );
        antiguedad = entrada.nextInt();

        if (clave_departamento == 1) {
            if (antiguedad > 0 && antiguedad < 2) {
                dias_vacaciones = 6;
            } else if(antiguedad >= 2 && antiguedad < 7) {
                dias_vacaciones = 14;
            } else if(antiguedad >= 7) {
                dias_vacaciones = 20;
            }
        } else if(clave_departamento == 2) {
            if (antiguedad > 0 && antiguedad < 2) {
                dias_vacaciones = 7;
            } else if(antiguedad >= 2 && antiguedad < 7) {
                dias_vacaciones = 15;
            } else if(antiguedad >= 7) {
                dias_vacaciones = 22;
            }
        } else if(clave_departamento == 3) {
            if (antiguedad > 0 && antiguedad < 2) {
                dias_vacaciones = 10;
            } else if(antiguedad >= 2 && antiguedad < 7) {
                dias_vacaciones = 20;
            } else if(antiguedad >= 7) {
                dias_vacaciones = 30;
            }
        } else{
            System.out.println("El departamento no existe");
        }

        System.out.println(nombre_empleado + " tienes derecho a " + dias_vacaciones + " días de vacaciones");
        entrada.close();
    }
}
