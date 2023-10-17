package com.SAM.Gym.Socio;

public class SocioHabilitado extends Socio{
    //ATRUBUTOS
    private Double costoPileta;
    private Boolean habilitado;

    //CONSTRUCTOR
    public SocioHabilitado(Integer nroSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta, Boolean habilitado) {
        super(nroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.habilitado = habilitado;
    }
    //METODOS


    @Override
    public Double calcularCostoMensual() {
        if (habilitado)
            return super.calcularCostoMensual() + this.costoPileta;
        else
            return super.calcularCostoMensual();
    }

    @Override
    public String toString() {
        return "Socio: " + super.toString()+
                "SocioHabilitado" +
                ", habilitado=" + habilitado + " Cuota mnsual: " + calcularCostoMensual() ;
    }
}
