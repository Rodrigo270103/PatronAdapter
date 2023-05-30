package ClasesMotores;

/**
 * Clase que representa un motor económico que hereda de la clase Motor.
 */
public class MotorEconomico extends Motor {

    /**
     * Constructor de la clase MotorEconomico.
     * Crea un nuevo motor económico e imprime un mensaje.
     */
    public MotorEconomico(){
        super();
        System.out.println("Creando motor económico...");
    }

    /**
     * Funcion la cual encinede el motor economico
     */
    
    public void encender() {
        System.out.println("Encendiendo motor económico.");
    }

    /**
     * Funcion la cual acelera el motor economico
     */
   
    public void acelerar() {
        System.out.println("Acelerando el motor económico.");
    }

    /**
     * Funcion la cual apaga el motor economico
     */
    
    public void apagar() {
        System.out.println("Apagando motor económico.");
    }
}