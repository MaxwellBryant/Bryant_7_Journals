package slickexample;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Yellow_Bar {

    int x;
    public int y;
    public boolean isvisible = true;
    Image currentImage;
    Shape hitbox;
    Image healthpotion = new Image(
            "res/bars.png");

    Yellow_Bar(int a, int b) throws SlickException {
        this.x = a;
        this.y = b;
        this.hitbox = new Rectangle(a, b, 64, 100);// 64 is the width of the item
        this.currentImage = healthpotion;

    }
}
