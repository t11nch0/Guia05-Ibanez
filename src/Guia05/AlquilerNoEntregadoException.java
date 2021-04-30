package Guia05;

public class AlquilerNoEntregadoException extends Exception{
    public String descripcion;

    public AlquilerNoEntregadoException(){
        this.descripcion= "Hay mas de dos herramientas en deuda";
    }

    public String getDescripcion() {
        return descripcion;
    }
}
