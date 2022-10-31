package Ejercicio3;

import java.util.Arrays;

/**
 * Clase que organiza un array en un orden ascendente
 * Donde al inicializar la clase se le tiene que mandar dos parametros
 * el primer parametro es el array que se quiere ordenar, y en segundo se debe de mandar
 * true si se desea utilizar el método quick sort, si quiero utilizar el algoritmo de burbuja
 * se debe de mandar false.
 * Ej:
 * int[] prueba={4,5,2,3,6,1};
 *         Sort s1 = new Sort(prueba,true);
 *         System.out.println(s1);
 * @author Jhon Anderson Galeano Santillana
 * @version 1.0.0
 *
 */
public class Sort {
    private double[] array;
    public Sort(double[] numbers, boolean sw) {
        if(sw){
            this.array = quickSort(numbers,0, numbers.length-1);
        }else{
            this.array = algorithmBubble(numbers);
        }

    }

    /**
     * Metodo que utiliza el algoritmo de quick sort
     *Ej:
     * var array = quickSort(nombre_array,0, nombre_array.length-1);
     *
     *
     * @param numbers el array que se desea ordenar.
     * @param l el selector de izquierda.
     * @param r el selector de derecha.
     * @return el array ordenado.
     */
    public double[] quickSort(double[] numbers,int l,int r){
        int iniLeft=l;
        int iniRight=r;
        double p=numbers[l];// pivot pivote
        do{
            if(l!=r && l<r){
                while(numbers[r]>p && l<r){r--;}
                while (numbers[l]<p && l<r){l++;}
                if(l!=r){
                    if(numbers[r]<p){
                        numbers[l]=numbers[r];
                        l++;
                    }
                    if(numbers[l]>p){
                        numbers[r]=numbers[l];
                        r--;
                    }
                }
                if(l==r){
                    numbers[l]=p;
                    if(r!=0){
                        quickSort(numbers,iniLeft,r-1);
                    }
                    if(l!= numbers.length-1){
                        quickSort(numbers,l+1,iniRight);
                    }
                }
            }
        }while (l!=r && l<r);

        return numbers;
    }

    /**
     * Este algoritmo ordena una cadena de números reales
     * por el método del algoritmo de la burbuja.
     * @param numbers el arreglo que queremos ordenar.
     *Ej.
     *         int[] prueba1 = { 10, 1, 5, 40, 12, 34, 44, 12, 11, 9 };
     *         Sort s2=new Sort(prueba1,false);
     *         System.out.println(s2);
     * @return el arreglo ordenado de menor a mayor
     */
    public double[] algorithmBubble(double[] numbers){
        for(int i= numbers.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if(numbers[j]>numbers[j+1]){
                    double aux=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=aux;
                }
            }
        }
        return numbers;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
