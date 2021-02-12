package com.niit.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int numOfElements = Integer.parseInt(reader.readLine());

        Integer[] array = new Integer[numOfElements] ;
        System.out.println("Enter the numbers");
        for (int i = 0; i<numOfElements; i++)
            array[i] = Integer.parseInt(reader.readLine());
        System.out.println("Provided Array");
        for(int i = 0; i<numOfElements; i++)
            System.out.print(array[i]+" ");
        int temp;
        for(int i = 0; i<numOfElements; i++)
        {

            for (int j = 0; j < numOfElements - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
        System.out.println("\nSorted Array");
        for(int i = 0; i<numOfElements; i++)
            System.out.print(array[i]+" ");

    }
}
