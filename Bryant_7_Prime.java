/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bryant_7_prime.java;

/**
 *
 * @author Max_and_a_Mango
 */
public class Bryant_7_Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     for(int i=0; i<100; i++){
         int divisor = 0;
        for(int p=2; p<100; p++){
            if(i % p == 0){
                divisor++;
                }
            }
            if(divisor == 0){
                System.out.println(i + " is Prime")
            }
        }   
     }
}
