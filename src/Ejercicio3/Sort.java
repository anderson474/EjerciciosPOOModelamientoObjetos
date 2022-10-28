package Ejercicio3;

import java.util.Arrays;

public class Sort {
    private int[] array;
    public Sort(int[] numbers, boolean sw) {
        if(sw){
            this.array = quickSort(numbers,0, numbers.length-1);
        }else{
            this.array = algorithmBubble(numbers);
        }

    }
    public int[] quickSort(int[] numbers,int l,int r){
        int iniLeft=l;
        int iniRight=r;
        int p=numbers[l];// pivot pivote
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
    public int[] algorithmBubble(int[] numbers){
        return numbers;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
