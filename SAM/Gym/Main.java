package com.SAM.Gym;

import com.SAM.Gym.Socio.Socio;
import com.SAM.Gym.Socio.SocioHabilitado;

public class Main {
    public static void main(String[] args) {

        SocioHabilitado socio1 = new SocioHabilitado(154, "Lucas", 55000.0, "Pesas", 15000.0, true);

        System.out.println(socio1.toString());

        System.out.println("Hello world!");
    }
}