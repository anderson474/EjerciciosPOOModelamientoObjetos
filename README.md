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

## Ejercicio 2:
No porque el compilador de Java busca una clase estatica que se llame main para ejecutarla, el IDE de Intellij me deja mostrar cual main correr
pero como podemos evidenciar en la siguiente imagen no se puede correr porque ya hay otra definición por ende el compilador entra en un conflicto

![image](https://user-images.githubusercontent.com/113210248/198129319-d6283c0e-eb3c-4deb-8e52-d5fb883a166a.png)

La otra cosa es que se tenga dos archivos main pero en diferentes archivos o paquetes como eneste caso de que cada ejercicio esta por separado en carpetas
con diferentes main, pero esto hace parte de las malas practicas de programación, la idea es que por cada proyecto se tenga un solo main

## Ejercicio 3:
Para poder utilizar la clase Sort se utilizo una clas MainSort, que lo que hace es que instancia los objetos.
Cuando creo una variable de tipo Sort el constructor pide dos cosas: el array que deseemos organizar y un variable
de tipo booleana que me conmuta su quiero el metodo quicksort o el algoritmo de la burbuja, siendo true quick sort y false
el algoritmo de la burbuja.
Ej:

        int[] prueba={4,5,2,3,6,1};
        Sort s1 = new Sort(prueba,true);
        
        
### Método Quick sort:
El método consiste en escojer un selector izquierdo, un selector derecho y un pivote, por lo general se inicia el pivote y el selector izquierdo
como la posición cero y el selector derecho en el último elemento del arreglo(al inicio de la iteración) así.

![image](https://user-images.githubusercontent.com/113210248/198739732-b8541d42-ee61-4d70-a6cd-e86161b7d125.png)

luego guardamos estos límites en unas variables que no se van a modificar para una posterior utilización:

![image](https://user-images.githubusercontent.com/113210248/198739909-b386d45d-2e64-4596-bcd4-607b523a5580.png)

luego para la ubicación de los números, se tiene en cuenta que se toma el pivote como punto central, luego de ahí se empieza a organizar los números que
sean mayores a el pivote se organizan en el lado derecho, y los menores en el lado izquierdo:

![image](https://user-images.githubusercontent.com/113210248/198740287-c7e55b5b-52d8-4e4b-aec3-14923af5ace7.png)

 Y cuando los dos selectores se encuentren en la misma posición es porque ese es el espacio para el pivote; como ya
 se separaron se hace un llamado de nuevo al metodo pero para que ajuste el rango debajo del pivote, y el rango por encima del pivote
 y si sucede lo mismo se vulve y se anida, hasta que regrese al último llamado, ordenando el arreglo de números.
Nota: el while es por si el número esta en el lugar que es el selector se mueve.











Mucha gracias y espero te haya gustado es con todo el  💖

### Bibliografias
Barreto, J. C. (2014). Solución geométrica de ecuaciones de segundo grado usando el Teorema de Pitágoras en la diferencia de cuadrados o gnómones. Premisa, 63, 29-46.
