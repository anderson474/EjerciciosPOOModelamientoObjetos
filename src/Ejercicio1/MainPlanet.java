package Ejercicio1;

public class MainPlanet {
    public static void main(String[] args) {
        Planet planetaTierra = new Planet("Tierra",5.972E24f,
                5.51f,5,149.6,12742f);
        Planet planetaMarte = new Planet("Marte",6.39E23f,3.93f,
                10,227.6804,12742f);

        System.out.println("La fuerza gravitacional entre "+planetaMarte.getName()+" y "+planetaTierra.getName()+
                "es "+planetaMarte.gravitacionalAtract(planetaMarte,planetaTierra)+" Newtons");

        System.out.println("La distancia entre ellos es "+
                planetaMarte.calculateDist(planetaMarte,planetaTierra)+" millones de kilometros");

        System.out.println("La distancia al sol de marte es: "+planetaMarte.distanceToSun(planetaMarte)
        +" millones de kilometros");

        System.out.println(planetaMarte);

    }
}
