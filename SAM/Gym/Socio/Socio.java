package com.SAM.Gym.Socio;

public abstract class Socio {

        //ATRIBUTOS
        private Integer nroSocio;
        private  String nombre;
        private Double cuotaMensual;
        private String actividad;

        //CONSTRUCTORES
        public Socio(Integer nroSocio, String nombre, Double cuotaMensual, String actividad) {
                this.nroSocio = nroSocio;
                this.nombre = nombre;
                this.cuotaMensual = cuotaMensual;
                this.actividad = actividad;
        }
        //GETTER AND SETTER


        public Integer getNroSocio() {
                return nroSocio;
        }

        public String getNombre() {
                return nombre;
        }

        public Double getCuotaMensual() {
                return cuotaMensual;
        }

        public String getActividad() {
                return actividad;
        }

        //METODOS
        public Double calcularCostoMensual(){
                return cuotaMensual;
        }

        @Override
        public String toString() {
                return "Socio{" +
                        "nroSocio=" + nroSocio +
                        ", nombre='" + nombre + '\'' +
                        ", cuotaMensual=" + cuotaMensual +
                        ", actividad='" + actividad + '\'' +
                        '}';
        }
}
