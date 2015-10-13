/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bryant_7_challenge;

public class Bryant_7_ChallengeREAL {

    public static void main(String[] args) {
        for(int i=0; i<550; i++) {
            if((isDiv2(i)) & (isDiv3(i)) & (isDiv5(i)) & !(isDiv11(i)) {
                System.out.println(i + " Team Building");
            }
            else if((isDiv3(i)) & (isDiv5(i)) & !(isDiv2(i)) {
                System.out.println(i + " Old School");
            }
            else if((isDiv2(i)) & (isDiv3(i)) & !(isDiv5(i)) {
                System.out.println(i + " chisme");
            }
            else if((isDiv5(i)) & (isDiv11(i)) & !(isDiv2(i)) {
                System.out.println(i + " Animate this!");
            }
            else if((isDiv3(i)) & (isDiv11(i)) & !(isDiv5(i)) {
                System.out.println(i + " Herr Direktor ");
            }
            else if((isDiv2(i)) & (isDiv11(i)) & !(isDiv3(i)) {
                System.out.println(i + " ninja");
            }
            else if((isDiv5(i)) {
                System.out.println(i + " Vidal");
            }
            else if((isDiv3(i)) { 
                System.out.println(i + " Claughton");
            }
            else if((isDiv2(i)) {
                System.out.println(i + " Davis");
            }
            else
                System.out.println(i);
            }
        }
    }
static boolean isDiv2(int i) {
    return (i % 2 == 0);
}
static boolean isDiv3(int i) {
    return (i % 3 == 0);
}
static boolean isDiv5(int i) {
    return (i % 5 == 0);
}
static boolean isDiv11(int i) {
    return (i % 11 == 0);
}
}
