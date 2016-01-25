/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slickexample;

import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author Max_and_a_Mango
 */
public class Player {

    static boolean hasRedkey = false;
    static boolean hasYellowkey = false;
    static boolean hasPurplekey = false;
    static boolean hasBluekey = false;
    static boolean hasGreykey = false;
    public static float x = 545f;

    public static float y = 1320f;

    public static int health = 100000;

    public static float speed = .25f;

    static float hitboxX = x + 8f;

    static float hitboxY = y + 8f;

    private static int startX, startY, width = 30, height = 42;

    public static Shape rect = new Rectangle(getplayershitboxX(),
            getplayershitboxY(), width, height);

    public static float pdelta;

    public static Animation playeranime;

    public static void setpdelta(float somenum) {

        pdelta = somenum;

    }

    public static float getpdelta() {

        return pdelta;

    }

    public static float getplayersX() {

        return x;

    }

    public static float getplayersY() {

        return y;

    }

    public static float getplayershitboxX() {

        return x + 18f;

    }

    public static float getplayershitboxY() {

        return y + 18f;

    }

    public static void setplayershitboxX() {

        hitboxX = getplayershitboxX();

    }

    public static void setplayershitboxY() {

        hitboxY = getplayershitboxY();

    }

    public static void setRedkey() {
        hasRedkey = true;
    }

    public static void setYellowkey() {
        hasYellowkey = true;
    }

    public static void setPurplekey() {
        hasPurplekey = true;
    }

    public static void setBluekey() {
        hasBluekey = true;
    }

    public static void setGreykey() {
        hasGreykey = true;
    }
}
