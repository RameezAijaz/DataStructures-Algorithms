package com.dsa;

public class Utility {

    public static int[] swap(int[] numbers, int i, int j){
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
        return numbers;
    }
    public static int[] deleteItemFromArray(int[] numbers, int i){
        int[] tmp = new int[numbers.length-1];
        int tmpCount =0;

        for(int j=0; j<numbers.length; j++){
            if(j==i) continue;

            tmp[tmpCount]=numbers[j];
            tmpCount++;
        }
        return tmp;
    }
    public static int[] subArray(int[] numbers, int low, int high){
        int[] tmp = new int[high-low];
        int tmpCount =0;

        for(int ind=low; ind<high; ind++){
            tmp[tmpCount++]=numbers[ind];
        }
        return tmp;
    }

    public static void shiftRight(int[] arr) {

        for(int i=arr.length-1; i>=0; i--){
            int dest;
            if(i-1<0){
                dest = 0;
            }else{
                dest = arr[i-1];
            }
            arr[i] = dest;
        }


    }

    public static void accumulate(int[] positionArray) {

        for(int i=1; i<positionArray.length; i++){

            positionArray[i]=positionArray[i]+positionArray[i-1];
        }
    }

    public static int[] concatArray(int[] arr1, int[] arr2) {

        int[] concatArray = new int[arr1.length + arr2.length];


        for(int i=0; i<arr1.length; i++){
            concatArray[i] = arr1[i];
        }

        for(int j=0; j<arr2.length; j++){
            concatArray[j+arr1.length] = arr2[j];
        }
        return concatArray;
    }
    public static int[] getDigits(int number, int maxDigits){
        int[] digits = new int [maxDigits];
        int i=maxDigits-1;
        while(number > 0){
            digits[i] = number%10;
            number /= 10;
            i--;
        }

        return digits;
    }
    public static int getMax(int a, int b){
        return a>b?a:b;
    }
}
