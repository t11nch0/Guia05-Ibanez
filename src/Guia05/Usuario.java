package Guia05;

import java.util.Collection;

public interface Usuario{
    public void contratarAlquiler(Herramienta herramienta) throws AlquilerNoEntregadoException;
    public Collection<Contrato> getContratos();

}
