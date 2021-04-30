package Guia05;

import java.util.List;

public interface Usuario{
    public void contratarAlquiler(Herramienta herramienta) throws AlquilerNoEntregadoException;
    public void devolverAlquiler(List<Contrato> contrato);
    public List<Contrato> getContratos();

}
