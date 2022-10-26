# EjerciciosPOOModelamientoObjetos
Taller de sofka de modelamiento de objetos.
## Ejercicio 1:
El ejercicio uno se encuentra en el paquete o carpeta Ejercicio 1, donde se pueden encontar dos archivos
el primero de MainPlanet es la clase instanciadora de la clase Planet, la clase Planet cuenta con metodos sencillos
de caluclo como gravitacional attract, calculate distance, y distance to sun. Para poder entender como funciona empecemos
con la inicializacion de un objeto de tipo planet:

![image](https://user-images.githubusercontent.com/113210248/198083504-0d7f4497-4402-4ded-80f6-150456132195.png)

En el main lo inicialize de esta manera teniendo en cuenta los datos reales de la tierra y de marte
La idealización de la ubicación de los planetas se representa en la siguiente imagen:

![image](https://user-images.githubusercontent.com/113210248/198122129-eeb8e947-c442-4a6f-8acc-aeff59116c59.png)

Donde las bases de 5 millones de kilometros y de 10 millones de kilometros, las escogi, para poder obtener una solución
de la ecuación del teorema de Pitagoras, entonces en el caso de la tierra se sabe que esta a una distancia de 149.6 
millones de kilometros, entonces esa distancia es la hipotenusa, y con la base se aplica el metodo de pitagoras
y se haya la componente en "y" del objeto tierra, y así mismo para marte (Barreto, J. C. (2014))
con eso designo los valores para los atributos de coordX y coordY, entonces el metodo para hayar la distancia
al sol simplemente es hayando la hipotenusa en la ecuación que es la raiz cuadrada de la sumatoria de los dos
catetos al cuadrado.
Para el método de la atracción gravitacional se necesita utilizar el otro metodo para hallar la distancia entre dos objetos

![image](https://user-images.githubusercontent.com/113210248/198124595-65d55ff0-f0d7-48b0-b379-fe20084aaff9.png)

Tomado de:

![image](https://user-images.githubusercontent.com/113210248/198125365-ce5b58a9-21f3-4fc6-b912-626e5a170f07.png)

Según la ecuación donde G es la constante de gravitación universal de Newton, que en el codigo esta representada como una constante

![image](https://user-images.githubusercontent.com/113210248/198126018-fb7897dc-dab0-43a7-b225-10b37d2923de.png)

m es la masa de un planeta y M es la masa del otro planeta, y r es la distancia entre ellos, y a este metodo se le mandan dos parametros
de tipo Planet,como ya tenemos la constante y las masas, porque se inicializan en el constructor, solo necesitamos mandarle tambien
esos dos planetas al metodo de calcular la distncia, que lo hace por medio de la definición de distancia euclidiana.
Y para la distancia hacia el sol el metodo solo hace el calculo de la hipotenusa y ya, pero en teoria, se puede hacer creando un nuevo objeto
que se llame sol y dandole las coordenadas (0,0), y mandandolo como parametro en la función de hallar la distancía.
Por ultimo se aclara que solo se pueden agregar mas de nueve planetas.













Mucha gracias y espero te haya gustado es con todo el  💖

### Bibliografias
Barreto, J. C. (2014). Solución geométrica de ecuaciones de segundo grado usando el Teorema de Pitágoras en la diferencia de cuadrados o gnómones. Premisa, 63, 29-46.
