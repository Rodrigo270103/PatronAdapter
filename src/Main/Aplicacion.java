package Main;
/**
 * @author Adminutor: Rodrigo Ojeda Arce
 */

import java.util.Scanner;

import ClasesMotores.Motor;
import ClasesMotores.MotorComun;
import ClasesMotores.MotorEconomico;
import ClasesMotores.MotorElectricoAdapter;

/**
 * Clase principal que contiene la lógica de la aplicación.
 */
public class Aplicacion {
    
    private static Scanner S = new Scanner(System.in);
    private static Motor motor;
    
    /**
     * Método principal que inicia la ejecución de la aplicación.
     * Solicita al usuario una opción del menú y realiza las operaciones correspondientes.
     * El bucle continúa hasta que se seleccione la opción de salir.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("");
        int opcion;
        do {
            opcion = preguntarOpcion();
            switch(opcion) {
                case 1:
                    motor = new MotorComun();
                    usarMotor();
                    break;
                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;
                case 3:
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                    break;
                case 4:
                    System.out.println("¡Cerrando programa!");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida.");
            }
            System.out.print("\n\n");
        } while(opcion != 4);
    }

    /**
     * Pregunta al usuario por una opción del menú y devuelve el valor ingresado.
     *
     * @return La opción seleccionada por el usuario.
     */
    private static int preguntarOpcion() {
        System.out.print(
                "MENÚ DE OPCIONES\n"
               +"---- -- --------\n"
               +"1. Encender motor común.\n"
               +"2. Encender motor económico.\n"
               +"3. Encender motor eléctrico.\n"
               +"4. Salir.\n"
               +"Seleccione opción: "
        );
        return Integer.parseInt(S.nextLine());
    }

    /**
     * Utiliza el motor seleccionado por el usuario.
     * Enciende el motor, acelera y apaga el motor.
     */
    private static void usarMotor() {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
