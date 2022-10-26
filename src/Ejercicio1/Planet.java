package Ejercicio1;

/**
 * Esta clase crea un objeto planeta que obtiene las caracteristicas de un planeta
 * Ej:
 * Planet planetaTierra = new Planet("Tierra",5.972E24f,
 *                 5.51f,5,149.6,12742f);
 * @author Jhon Anderson Galeano Santillana - jhon.galeano201@tau.usbmed.edu.co
 * @version 1.0.0
 */
public class Planet {
    private static final float UNIVGRAVICONST=6.672E-11f;//constante de gravitación universal
    private String name;
    private float mass;
    private float density;
    private double coordX;
    private double coordY;
    private double distance;
    private float diameter;
    private static int id=0;

    /**
     * Instanciar un nuevo planeta.
     *
     * @param name     el nombre del planeta
     * @param mass     la masa del planeta en Kg.
     * @param density  la dendidad del planeta en g/cm^3.
     * @param coordX   la coordenada x donde se encuenta el planeta en millones de kilometros.
     * @param coordY   la coordenada y donde se encuentra el planeta en millones de kilometros.
     * @param diameter el diámetro del planeta en Km.
     */
    public Planet(String name, float mass, float density, double coordX, double coordY, float diameter) {
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.coordX = coordX;
        this.coordY = coordY;
        this.diameter = diameter;
        id++;
        if(id>9){
            throw new IllegalArgumentException("No se pueden crear más de nueve planetas");
        }
    }

    /**
     * Seccion de Getters.
     */

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public float getMass() {return mass;}

    public String getName() {return name;}

    public float getDensity() {return density;}

    public double getDistance() {return distance;}

    public float getDiameter() {return diameter;}

    public static int getId() {return id;}

    /**
     * calcula la fuerza ravitacional.
     *
     * @param planet1 El planeta 1.
     * @param planet2 El planeta 2.
     * @return la fuerza gravitacional.
     */
    public double gravitacionalAtract(Planet planet1, Planet planet2){
        this.distance=calculateDist(planet1,planet2);
        var forceGravity= (UNIVGRAVICONST* planet1.getMass()* planet2.getMass())/Math.pow(this.distance,2);
        return forceGravity;

    }

    /**
     *
     * @param p1 El planeta 1.
     * @param p2 El planeta 2.
     * @return La distancia entre los dos planetas
     */
    public double calculateDist(Planet p1, Planet p2) {
        var rest1=(p1.getCoordX()- p2.getCoordX());
        var rest2=(p1.getCoordY()-p2.getCoordY());
        var calculate=Math.sqrt(Math.pow(rest1,2)+Math.pow(rest2,2));
        return calculate;
    }

    /**
     *
     * @param p1 el planeta que se desea hallar.
     * @return la distancia hacia al sol.
     */
    public double distanceToSun(Planet p1){
        var hypotenuseSquared = Math.pow(p1.getCoordX(),2)+Math.pow(p1.getCoordY(),2);
        var hypotenuse = Math.sqrt(hypotenuseSquared);
        return hypotenuse;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", density=" + density +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                ", diameter=" + diameter +
                ", identificador=" + id +
                '}';
    }
}
