/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bryant_7_challenge;

public class Bryant_7_ChallengeREAL {

    public static void main(String[] args) {
        for(int i=0; i<550; i++) {
            if((isDiv2(i)) & (isDiv3(i)) & (isDiv5(i)) & (isDiv11(i)==false)) {
                System.out.println(i + " Team Building");
            }
            if((isDiv3(i)) & (isDiv5(i)) & (isDiv2(i)==false)) {
                System.out.println(i + " Old School");
            }
            if((isDiv2(i)) & (isDiv3(i)) & (isDiv5(i)==false)) {
                System.out.println(i + " chisme");
            }
            if((isDiv5(i)) & (isDiv11(i)) & (isDiv2(i)==false)) {
                System.out.println(i + " Animate this!");
            }
            if((isDiv3(i)) & (isDiv11(i)) & (isDiv5(i)==false)) {
                System.out.println(i + " Herr Direktor ");
            }
            if((isDiv2(i)) & (isDiv11(i)) & (isDiv3(i)==false)) {
                System.out.println(i + " ninja");
            }
            if((isDiv5(i)) & (isDiv3(i)==false)) {
                System.out.println(i + " Vidal");
            }
            if((isDiv3(i)) & (isDiv2(i)==false)) { 
                System.out.println(i + " Claughton");
            }
            if((isDiv2(i)) & (isDiv5(i)==false)) {
                System.out.println(i + " Davis");
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