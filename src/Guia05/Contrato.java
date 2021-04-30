package Guia05;

import java.util.ArrayList;
import java.util.List;

public class Contrato implements Usuario{

    public List<Contrato> contratos= new ArrayList<>();

    public void contratarAlquiler(Herramienta herramienta) throws AlquilerNoEntregadoException{

        if(muchosAlquileres(contratos)) {
            throw new AlquilerNoEntregadoException();

        }else if(herramienta.buscarHerramienta(herramienta.getNombreHerramienta())){
            this.contratos.add(new Alquiler(herramienta));
        }else{
            System.out.println("La herramienta solicitada no se encuentra en el catalogo");
        }
    }

    public void devolverAlquiler(List<Contrato> contrato){
        for(Contrato c: contratos){
            if(c.equals(contrato))
                this.contratos.remove(c.contratos);
        }
    }

    public List<Contrato> getContratos() {
        return this.contratos;
    }

    public Boolean muchosAlquileres(List<Contrato> contratos){
        int aux= 0;
        for(Contrato c : contratos){
            if(c instanceof Alquiler)
                ++aux;
        }
        return (aux>=2);
    }
}
