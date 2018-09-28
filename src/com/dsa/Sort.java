package com.dsa;

import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] numbers){

        for(int i=0; i<numbers.length; i++){
            boolean isSwap=false;
            for(int j=0; j<numbers.length-1; j++){
                if(numbers[j]>numbers[j+1]){
                    Utility.swap(numbers, j, j+1);
                    isSwap = true;
                }
            }
            if(!isSwap)break;

        }
        return numbers;

    }

    public static int[] insertionSort(int[] numbers){

        for(int i =0; i<numbers.length; i++){
            for(int j = i; j>0; j--){
                if(numbers[j]<numbers[j-1]){
                    Utility.swap(numbers, j, j-1);
                }
                else {
                    break;
                }
            }
        }
        return numbers;
    }

    public static int[] mergeSortCombine(int[] left, int[] right){
        int[] tmp = new int[left.length+right.length];
        int count =0;
        while (left.length>0 && right.length>0){
            if(left[0]>right[0]){
                tmp[count] = right[0];
                right=Utility.deleteItemFromArray(right,0);
            }
            else {
                tmp[count] = left[0];
                left=Utility.deleteItemFromArray(left,0);
            }
            count++;
        }

        while (left.length>0){
            tmp[count] = left[0];
            left=Utility.deleteItemFromArray(left,0);
            count++;
        }
        while (right.length>0){
            tmp[count] = right[0];
            right=Utility.deleteItemFromArray(right,0);
            count++;
        }

        return tmp;

    }
    public static int[] mergerSortSplit(int[] numbers){
        if(numbers.length<=1){
            return numbers;
        }

        int mid = numbers.length/2;

        int[] left = mergerSortSplit(Utility.subArray(numbers, 0, mid));
        int[] right = mergerSortSplit(Utility.subArray(numbers, mid, numbers.length));

        return mergeSortCombine(left,right);

    }
    public static int[] mergeSort(int[] numbers){

        return mergerSortSplit(numbers);
    }


    private static void qsSort(int[] numbers, int left, int right){
        if(left>=right)
            return;

        int pivot = numbers[(left+right)/2];
        int index = qsPartition(numbers, left, right, pivot);

        qsSort(numbers, left, index-1);
        qsSort(numbers, index, right);
    }
    private static int qsPartition(int[] numbers, int i, int j , int pivot){
        while (i<=j){

            while (numbers[i] < pivot){
                i++;
            }
            while (numbers[j] > pivot){
                j--;
            }
            if(i<=j){
                Utility.swap(numbers, i, j);
                i++;
                j--;
            }


        }
        return i;
    }
    public static int[] quickSort(int[] numbers){
        qsSort(numbers, 0, numbers.length-1);
        return numbers;
    }
    public static int[] countingSort(int[] numbers){

        int[] positionArray = new int[10];
        int[] outputArray = new int[numbers.length];

        for(int i=0; i<numbers.length; i++){

            int number = numbers[i];
            positionArray[number]++;

        }

        Utility.accumulate(positionArray);
        Utility.shiftRight(positionArray);

        for(int i=0; i<numbers.length; i++){

            int number = numbers[i];

            outputArray[positionArray[number]] = number;

            positionArray[number]++;

        }
        
        return outputArray;
    }

    public static int[] bucketSort(int[] numbers){
       int[][]  buckets = new int[10][];
       int[] output = new int[numbers.length];

       for(int i=0; i<numbers.length; i++){
           int number = numbers[i];
           int index = number/10;

           if(buckets[index] == null){
               buckets[index] = new int[]{number};
           }
           else {
                buckets[index] = Utility.concatArray(buckets[index], new int[]{number});
           }
       }

       for(int i=0; i<buckets.length; i++){
           insertionSort(buckets[i]);
       }

       int index=0;
       for(int[] bucket: buckets){
           for(int num : bucket){
               output[index] = num;
               index++;
           }
       }

       return output;
    }


    public static int[] radixSort(int[] numbers){
       int maxDigits =3;

       for(int i=maxDigits-1; i>=0; i--){
           int [] positionArray = new int[10];
           for(int j=0; j<numbers.length; j++){
               int number = numbers[j];
               int[] digits = Utility.getDigits(number, maxDigits);
               positionArray[digits[i]]++;
           }

           Utility.accumulate(positionArray);
           Utility.shiftRight(positionArray);

           int[] output = new int[numbers.length];

           for(int j=0; j<numbers.length; j++){
               int number = numbers[j];
               int[] digits = Utility.getDigits(number, maxDigits);
               int digit = digits[i];
               output[positionArray[digit]] = numbers[j];
               positionArray[digit]++;
           }

           numbers = output;

       }



       return numbers;
    }
}
