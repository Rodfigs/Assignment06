/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hanoitower2;
import java.io.*;
import java.math.*;
import java.util.*;
/**
 *
 * @author rodri
 */
public class Hanoitower2 {

    /**
     * @param args the command line arguments
     */
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod,char for_rod)
    {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod, for_rod);
        System.out.println("Move disk " + n + " from rod "
                           + from_rod + " to rod "
                           + to_rod + " for rod " + for_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod, for_rod);
    }
 
    // Driver code
    public static void main(String args[])
    {
        int N = 4;
 
        
        towerOfHanoi(N, 'A', 'C', 'B', 'D');
    }
}
    

