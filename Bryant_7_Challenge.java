/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bryant_7_challenge;

/**
 *
 * @author Max_and_a_Mango
 */
public class Bryant_7_Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<550; i++) {
            if(i % 2 + 3 + 5 == 0) {
                System.out.println("Team Building");
            } else if(i % 3 + 5 == 0) {
                System.out.println("Old School");
            } else if(i % 2 + 3 == 0) {
                System.out.println("chisme");
            } else if(i % 55 == 0) {
                System.out.println("Animate this!");
            } else if(i % 33 == 0) {
                System.out.println("Herr Direktor ");
            } else if(i % 22 == 0) {
                System.out.println("ninja");
            } else if(i % 5 == 0) {
                System.out.println("Vidal");
            } else if(i % 3 == 0) {
                System.out.println("Claughton");
            } else if(i % 2 == 0) {
                System.out.println("Davis");
            }
        }
    }
}
