package ClasesMotores;

/**
 * Clase que representa un motor común que hereda de la clase Motor.
 */
public class MotorComun extends Motor {

    /**
     * Constructor de la clase MotorComun.
     * Crea un nuevo motor común e imprime un mensaje.
     */
    public MotorComun(){
        super();
        System.out.println("Creando motor común...");
    }

    /**
     * Funcion la cual encinede el motor comun
     */
    
    public void encender() {
        System.out.println("Encendiendo motor común.");
    }

    /**
     * Funcion la cual acelera el motor comun
     */
    
    public void acelerar() {
        System.out.println("Acelerando motor común.");
    }

    /**
     * Funcion la cual apaga el motor comun
     */
    
    public void apagar() {
        System.out.println("Apagando motor común.");
    }
}

