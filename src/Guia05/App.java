package Guia05;

public class App {
    public static void main (String[] args){

        Herramienta cargador= new Herramienta();
        cargador.addHerramienta("pala",1.0);
        cargador.addHerramienta("pico",2.0);
        cargador.addHerramienta("azada",3.0);

        Usuario user= new Contrato();

        System.out.println(user.getContratos());

        try {
            user.contratarAlquiler(new Herramienta("pala"));
            //user.devolverAlquiler(user.getContratos().stream().filter(c->c instanceof Alquiler).findFirst().get());
            user.devolverAlquiler(user.getContratos());
            //user.contratarAlquiler(new Herramienta("pico",2.0));
            //user.contratarAlquiler(new Herramienta("azada",3.0));


        }catch (AlquilerNoEntregadoException alquilerNoEntregadoException){
            System.out.println(alquilerNoEntregadoException.descripcion);
            alquilerNoEntregadoException.printStackTrace();
        }

        System.out.println(user.getContratos());

    }
}
