package ClasesMotores;

/**
 * Clase que representa un motor eléctrico, el cual no se puede adaptar a la clase motor debido a sus metodos.
 */
public class MotorElectrico {

    private boolean conectado = false;

    /**
     * Constructor de la clase MotorElectrico.
     * Crea un nuevo motor eléctrico y establece la propiedad "conectado" en falso.
     */
    public MotorElectrico() {
        System.out.println("Creando motor eléctrico...");
        this.conectado = false;
    }

    /**
     * Conecta el motor eléctrico.
     * Establece la propiedad "conectado" en verdadero.
     */
    public void conectar() {
        System.out.println("Conectando motor eléctrico.");
        this.conectado = true;
    }

    /**
     * Activa el motor eléctrico.
     * Si el motor no está conectado, imprime un mensaje de error. De lo contrario, imprime un mensaje de activación.
     */
    public void activar() {
        if (!this.conectado) {
            System.out.println("No se puede activar porque no está conectado el motor eléctrico.");
        } else {
            System.out.println("Está conectado, activando motor eléctrico.");
        }
    }

    /**
     * Mueve el motor eléctrico a una velocidad más rápida.
     * Si el motor no está conectado, imprime un mensaje de error. De lo contrario, imprime un mensaje de aumento de voltaje.
     */
    public void moverMasRapido() {
        if (!this.conectado) {
            System.out.println("No se puede mover rápido el motor eléctrico porque no está conectado.");
        } else {
            System.out.println("Moviendo más rápido, aumentando voltaje del motor eléctrico.");
        }
    }

    /**
     * Detiene el motor eléctrico.
     * Si el motor no está conectado, imprime un mensaje de error. De lo contrario, imprime un mensaje de detención.
     */
    public void detener() {
        if (!this.conectado) {
            System.out.println("No se puede detener motor eléctrico porque no está conectado.");
        } else {
            System.out.println("Deteniendo motor eléctrico.");
        }
    }

    /**
     * Desconecta el motor eléctrico.
     * Establece la propiedad "conectado" en falso.
     */
    public void desconectar() {
        System.out.println("Desconectando motor eléctrico.");
        this.conectado = false;
    }
}
