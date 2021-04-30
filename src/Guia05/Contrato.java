package Guia05;

import java.util.ArrayList;
import java.util.Collection;

public class Contrato implements Usuario{

    public Collection<Contrato> contratos= new ArrayList<>();

    public void contratarAlquiler(Herramienta herramienta) throws AlquilerNoEntregadoException{

        if(muchosAlquileres(contratos)) {
            throw new AlquilerNoEntregadoException();

        }else if(herramienta.buscarHerramienta(herramienta.getNombreHerramienta())){
            this.contratos.add(new Alquiler(herramienta));
        }else{
            System.out.println("La herramienta solicitada no se encuentra en el catalogo");
        }
    }

    public Collection<Contrato> getContratos() {
        return this.contratos;
    }

    public Boolean muchosAlquileres(Collection<Contrato> contratos){
        int aux= 0;
        for(Contrato c : contratos){
            if(c instanceof Alquiler)
                ++aux;
        }
        return (aux>=2);
    }
}
