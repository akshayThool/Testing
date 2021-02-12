package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {

    public Integer[] sort(Integer[] array){
        for(int i = 1; i<array.length; i++)
        {
            for(int j = i; j>0; j--)
            {
                if(array[j] < array[j-1])
                {
                    array[j] = array[j]+array[j-1];
                    array[j-1] = array[j] - array[j-1];
                    array[j] = array[j] - array[j-1];
                }
            }
        }

        return array;
    }

    public void displayArray(Integer[] array)
    {
        //System.out.println("");
        for(int i = 0; i< array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println("");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int numOfElements = Integer.parseInt(reader.readLine());
        Integer[] array = new Integer[numOfElements];
        System.out.println("Enter the values of array");
        for (int i = 0; i< numOfElements; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Provided array");
        new InsertionSort().displayArray(array);
        array = new InsertionSort().sort(array);
        System.out.println("Sorted Array by Insertion Sort");
        new InsertionSort().displayArray(array);
    }
}
