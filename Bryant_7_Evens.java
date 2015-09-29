/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bryant_7_evens;

/**
 *
 * @author Max_and_a_Mango
 */
public class Bryant_7_Evens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            //What happens in the loop will happen again and again until the loop exits.
            if (isEven(i)) {
                counter += 1;
                System.out.println("We have " + counter + " evens!");
                
                    }
                }
        System.out.println("We have " + counter + " total evens!");
            }
    /* A method is like a function. It is like a little program you want to repeat frequently.
    */
    static boolean isEven (int somenumber) {
        return (somenumber % 2 == 0);
    }    
}
  
