package Ejercicio3;

public class MainSort {
    public static void main(String[] args) {
        double [] prueba=new double[6];
        double [] prueba1=new double[6];
        for(int i=0; i<=5; i++){
            prueba[i]=Math.random();
            System.out.println("prueba = " + prueba[i]);
        }
        for(int i=0; i<=5; i++){
            prueba1[i]=Math.random();
            System.out.println("prueba1 = " + prueba1[i]);
        }
        Sort s1 = new Sort(prueba,true);
        System.out.println(s1);
        Sort s2=new Sort(prueba1,false);
        System.out.println(s2);

    }
}
