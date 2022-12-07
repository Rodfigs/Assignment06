/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;
import java.util.Scanner;  
import java.util.stream.*;
/**
 *
 * @author rodri
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
   
        void merge(int arr[], int X, int Y, int Z)
    {
        
        int n1 = Y - X + 1;
        int n2 = Z - Y;
 
       
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        
        for (int i=0; i<n1; ++i)
            L[i] = arr[X + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[Y + 1+ j];
 
 
        
 
        
        int i = 0, j = 0;
 
      
        int k = X;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
  
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
   
    
   
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    void sort(int arr[], int X, int Z)
    {
        if (X < Z)
        {
            
            int Y = (X+Z)/2;
 
            
            sort(arr, X, Y);
            sort(arr , Y+1, Z);
 
           
            merge(arr, X, Y, Z);
        }
    }
 
    
    public static void main(String args[])
    {
        
        Scanner arrayScanner = new Scanner(System.in);  
        int n;
        
        
        System.out.println("Enter how long you want your array to be: ");
        
        int[] yourArray = new int[10];  
        
        n = arrayScanner.nextInt();  
        
        System.out.println("Enter Array numbers: ");
        
        for(int i=0; i<n; i++)  
                {  

        yourArray[i] = arrayScanner.nextInt();  
         }         
System.out.println("Array elements are: ");  
        
        System.out.println("Given Array");
        printArray(yourArray);
 
        MergeSort ob = new MergeSort();
        ob.sort(yourArray, 0, yourArray.length-1);
 
        System.out.println("Sorted array");
        printArray(yourArray);
        
        int sum = IntStream.of(yourArray).sum();
        System.out.println("The sum is " + sum);
    }
}
    
    

