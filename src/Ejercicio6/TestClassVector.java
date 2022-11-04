package Ejercicio6;

import java.util.Scanner;
import java.util.Vector;

public class TestClassVector {
    public static void main(String[] args) {
        boolean escape=true;
        int cont = 0;
        Vector arrayOfNumbers = new Vector<>();
        while(escape==true){
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese un número");
            String numberSt = sc.nextLine();
            double number = Integer.parseInt(numberSt);
            arrayOfNumbers.add(number);
            try{
                catchException(arrayOfNumbers,cont);
                escape=true;
                //cont++;
            }catch(IllegalArgumentException e){
                System.out.println("Se ha mandado un número igual al " +
                        "anterior por eso se rompe el ciclo");
                for(int i=0; i< arrayOfNumbers.size(); i++){
                    System.out.println(arrayOfNumbers.get(i));
                }
                escape=false;
            }catch (IndexOutOfBoundsException e){

            }
            cont++;
        }



    }
    public static void catchException(Vector v, int c){

        if(v.get(c-1).equals(v.get(c))){
            throw new IllegalArgumentException();
        }
    }
}
