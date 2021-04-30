package Guia05;

import java.util.ArrayList;

public class Herramienta extends Contrato{
    public static ArrayList<Herramienta> herramienta= new ArrayList<>();
    private String nombreHerramienta;
    private Double costoPorDiaHerramienta;

    public Herramienta(){
        this.nombreHerramienta= null;
        this.costoPorDiaHerramienta= null;
    }

    public Herramienta(String nombreHerramienta, Double costoPorDiaHerramienta){
        this.nombreHerramienta= nombreHerramienta;
        this.costoPorDiaHerramienta= costoPorDiaHerramienta;
    }

    public Boolean buscarHerramienta(String herramienta){
        for(Herramienta h : this.herramienta){
            if(h.nombreHerramienta.equalsIgnoreCase(herramienta)){
                return true;
            }
        }
        return false;
    }

    public void addHerramienta(String nombreHerramienta, Double costoPorDiaHerramienta){
        if(!buscarHerramienta(nombreHerramienta)){
            herramienta.add(new Herramienta(nombreHerramienta,costoPorDiaHerramienta));
        }
    }

    public void removeHerramienta(String nombreHerramienta){
        for(Herramienta h: herramienta){
            if(h.nombreHerramienta.equalsIgnoreCase(nombreHerramienta)){
                herramienta.remove(h);
            }
        }
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public Double getCostoPorDiaHerramienta() {
        return costoPorDiaHerramienta;
    }

    public void setCostoPorDiaHerramienta(Double costoPorDiaHerramienta) {
        this.costoPorDiaHerramienta = costoPorDiaHerramienta;
    }
}
