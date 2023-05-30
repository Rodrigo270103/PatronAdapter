package ClasesMotores;

/**
 * Clase que representa un adaptador de motor eléctrico que hereda de la clase Motor.
 */
public class MotorElectricoAdapter extends Motor {
    private MotorElectrico motorElectrico;

    /**
     * Constructor de la clase MotorElectricoAdapter.
     * Crea un nuevo adaptador de motor eléctrico e imprime un mensaje.
     * También crea una instancia de MotorElectrico.
     */
    public MotorElectricoAdapter(){
        super();
        System.out.println("Creando motor eléctrico adapter...");
        this.motorElectrico = new MotorElectrico();        
    }
    
    /**
     * Funcion que va a adaptar los metodos del motor electrico "conectar" y "activar" al metodo "encender" de la clase Motor 
     */
    public void encender() {
        System.out.println("Encendiendo motor eléctrico adapter.");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    /**
     * Funcion que va a adaptar el metodo del motor electrico "moverMasRapido" al metodo "acelerar" de la clase Motor 
     */
    public void acelerar() {
        System.out.println("Acelerando motor eléctrico adapter.");
        this.motorElectrico.moverMasRapido();
    }

    /**
     * Funcion que va a adaptar los metodos "detener" y "desconectar" del motor electrico al metodo "apagar" de la clase Motor 
     */
    public void apagar() {
        System.out.println("Apagando motor eléctrico adapter.");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}


