package Guia05;

import java.util.Calendar;

public class Alquiler extends Contrato{
    public Herramienta h= new Herramienta();
    private Calendar diaInicio= Calendar.getInstance();;
    private Calendar diaFinal= Calendar.getInstance();;
    private Calendar diaDevolucion = null;

    public Alquiler(Herramienta herramienta){
        if(h.buscarHerramienta(herramienta.getNombreHerramienta())){
            this.h.setNombreHerramienta(herramienta.getNombreHerramienta());
            this.h.setCostoPorDiaHerramienta(herramienta.getCostoPorDiaHerramienta());
        }
    }

    public Herramienta getH() {
        return h;
    }

    public void setH(Herramienta h) {
        this.h = h;
    }

    public Calendar getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(Calendar diaInicio) {
        this.diaInicio = diaInicio;
    }

    public Calendar getDiaFinal() {
        return diaFinal;
    }

    public void setDiaFinal(Calendar diaFinal) {
        this.diaFinal = diaFinal;
    }

    public Calendar getDiaDevolucion() {
        return diaDevolucion;
    }

    public void setDiaDevolucion(Calendar diaDevolucion) {
        this.diaDevolucion = diaDevolucion;
    }

}
