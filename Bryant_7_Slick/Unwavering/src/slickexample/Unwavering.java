package slickexample;

import java.util.ArrayList;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

import org.newdawn.slick.tiled.TiledMap;

public class Unwavering extends BasicGameState {

    //public Item healthpotion, healthpotion1;
    //public item1 speedpotion, speedpotion1;
    //public itemwin antidote;
    static boolean unlocked = false;

    public Purple_Bar bar3;
    public ArrayList<Purple_Bar> bar = new ArrayList();

    public Blue_Bar bar5;
    public ArrayList<Blue_Bar> rab2 = new ArrayList();

    public Grey_Bar bar4;
    public ArrayList<Grey_Bar> rab = new ArrayList();

    public Red_Bar bar2;
    public ArrayList<Red_Bar> bars = new ArrayList();

    public Yellow_Bar bar1;
    public ArrayList<Yellow_Bar> barz = new ArrayList();

    public Grey_Mark key5;
    public ArrayList<Grey_Mark> yek2 = new ArrayList();

    public Blue_Mark key4;
    public ArrayList<Blue_Mark> yek = new ArrayList();

    public Purple_Mark key3;
    public ArrayList<Purple_Mark> key = new ArrayList();

    public Yellow_Mark key2;
    public ArrayList<Yellow_Mark> keys = new ArrayList();

    public Red_Mark key1;
    public ArrayList<Red_Mark> keyz = new ArrayList();

//public ArrayList<Item> stuff = new ArrayList();
//    public ArrayList<Item1> stuff1 = new ArrayList();
    public ArrayList<ItemWin> stuffwin = new ArrayList();

    private boolean[][] hostiles;

    private static TiledMap grassMap;

    private static AppGameContainer app;

    private static Camera camera;

    public static int counter = 0;

    // Player stuff
    private Animation sprite, up, down, left, right, wait;

    /**
     *
     * The collision map indicating which tiles block movement - generated based
     *
     * on tile properties
     */
    // changed to match size of sprites & map
    private static final int SIZE = 64;

    // screen width and height won't change
    private static final int SCREEN_WIDTH = 1000;

    private static final int SCREEN_HEIGHT = 750;

    public Unwavering(int xSize, int ySize) {

    }

    public void init(GameContainer gc, StateBasedGame sbg)
            throws SlickException {

        gc.setTargetFrameRate(60);

        gc.setShowFPS(false);

        // *******************
        // Scenerey Stuff
        // ****************
        grassMap = new TiledMap("res/Bryant_7_Map.tmx");

        // Ongoing checks are useful
        System.out.println("Tile map is this wide: " + grassMap.getWidth());

        camera = new Camera(gc, grassMap);

        // *********************************************************************************
        // Player stuff --- these things should probably be chunked into methods
        // and classes
        // *********************************************************************************
        SpriteSheet runningSS = new SpriteSheet(
                "res/Prisoner1.png", 64, 64, 0);

        // System.out.println("Horizontal count: "
        // +runningSS.getHorizontalCount());
        // System.out.println("Vertical count: " +runningSS.getVerticalCount());
        up = new Animation();

        up.setAutoUpdate(true);

        up.addFrame(runningSS.getSprite(0, 8), 330);

        up.addFrame(runningSS.getSprite(1, 8), 330);

        up.addFrame(runningSS.getSprite(2, 8), 330);

        up.addFrame(runningSS.getSprite(3, 8), 330);

        up.addFrame(runningSS.getSprite(4, 8), 330);

        up.addFrame(runningSS.getSprite(5, 8), 330);

        up.addFrame(runningSS.getSprite(6, 8), 330);

        up.addFrame(runningSS.getSprite(7, 8), 330);

        up.addFrame(runningSS.getSprite(8, 8), 330);

        down = new Animation();

        down.setAutoUpdate(false);

        down.addFrame(runningSS.getSprite(0, 10), 330);

        down.addFrame(runningSS.getSprite(1, 10), 330);

        down.addFrame(runningSS.getSprite(2, 10), 330);

        down.addFrame(runningSS.getSprite(3, 10), 330);

        down.addFrame(runningSS.getSprite(4, 10), 330);

        down.addFrame(runningSS.getSprite(5, 10), 330);

        down.addFrame(runningSS.getSprite(6, 10), 330);

        down.addFrame(runningSS.getSprite(7, 10), 330);

        down.addFrame(runningSS.getSprite(8, 10), 330);

        left = new Animation();

        left.setAutoUpdate(false);

        left.addFrame(runningSS.getSprite(0, 9), 330);

        left.addFrame(runningSS.getSprite(1, 9), 330);

        left.addFrame(runningSS.getSprite(2, 9), 330);

        left.addFrame(runningSS.getSprite(3, 9), 330);

        left.addFrame(runningSS.getSprite(4, 9), 330);

        left.addFrame(runningSS.getSprite(5, 9), 330);

        left.addFrame(runningSS.getSprite(6, 9), 330);

        left.addFrame(runningSS.getSprite(7, 9), 330);

        left.addFrame(runningSS.getSprite(8, 9), 330);

        right = new Animation();

        right.setAutoUpdate(false);

        right.addFrame(runningSS.getSprite(0, 11), 330);

        right.addFrame(runningSS.getSprite(1, 11), 330);

        right.addFrame(runningSS.getSprite(2, 11), 330);

        right.addFrame(runningSS.getSprite(3, 11), 330);

        right.addFrame(runningSS.getSprite(4, 11), 330);

        right.addFrame(runningSS.getSprite(5, 11), 330);

        right.addFrame(runningSS.getSprite(6, 11), 330);

        right.addFrame(runningSS.getSprite(7, 11), 330);

        right.addFrame(runningSS.getSprite(8, 11), 330);

        wait = new Animation();

        wait.setAutoUpdate(true);

        wait.addFrame(runningSS.getSprite(0, 14), 733);

        wait.addFrame(runningSS.getSprite(1, 14), 733);

        wait.addFrame(runningSS.getSprite(2, 14), 733);

        wait.addFrame(runningSS.getSprite(3, 14), 733);

        // wait.addFrame(runningSS.getSprite(2, 14), 733);
        // wait.addFrame(runningSS.getSprite(5, 14), 333);
        sprite = wait;

        // *****************************************************************
        // Obstacles etc.
        // build a collision map based on tile properties in the TileD map
        Blocked.blocked = new boolean[grassMap.getWidth()][grassMap.getHeight()];

        // System.out.println("Map height:" + grassMap.getHeight());
        // System.out.println("Map width:" + grassMap.getWidth());
        // There can be more than 1 layer. You'll check whatever layer has the
        // obstacles.
        // You could also use this for planning traps, etc.
        // System.out.println("Number of tile layers: "
        // +grassMap.getLayerCount());
        System.out.println("The grassmap is " + grassMap.getWidth() + "by "
                + grassMap.getHeight());

        for (int xAxis = 0; xAxis < grassMap.getWidth(); xAxis++) {

            for (int yAxis = 0; yAxis < grassMap.getHeight(); yAxis++) {

                // int tileID = grassMap.getTileId(xAxis, yAxis, 0);
                // Why was this changed?
                // It's a Different Layer.
                // You should read the TMX file. It's xml, i.e.,human-readable
                // for a reason
                int tileID = grassMap.getTileId(xAxis, yAxis, 1);

                String value = grassMap.getTileProperty(tileID,
                        "blocked", "false");

                if ("true".equals(value)) {

                    System.out.println("The tile at x " + xAxis + " andy axis "
                            + yAxis + " is blocked.");
                    Blocked.blocked[xAxis][yAxis] = true;

                }

            }

        }

        System.out.println("Array length" + Blocked.blocked[0].length);

        // A remarkably similar process for finding hostiles
        hostiles = new boolean[grassMap.getWidth()][grassMap.getHeight()];

        for (int xAxis = 0; xAxis < grassMap.getWidth(); xAxis++) {
            for (int yAxis = 0; yAxis < grassMap.getHeight(); yAxis++) {
                int xBlock = (int) xAxis;
                int yBlock = (int) yAxis;
                if (!Blocked.blocked[xBlock][yBlock]) {
                    if (yBlock % 7 == 0 && xBlock % 15 == 0) {
                        //Item i = new Item(xAxis * SIZE, yAxis * SIZE);
                        //stuff.add(i);
                        //stuff1.add(h);
                        hostiles[xAxis][yAxis] = true;
                    }
                }
            }
        }

        for (int xAxis = 0; xAxis < grassMap.getWidth(); xAxis++) {
            for (int yAxis = 0; yAxis < grassMap.getHeight(); yAxis++) {
                int xBlock = (int) xAxis;
                int yBlock = (int) yAxis;
                if (!Blocked.blocked[xBlock][yBlock]) {
                    //if (xBlock % 9 == 0 && yBlock % 25 == 0) {
//                        //Item1 h = new Item1(xAxis * SIZE, yAxis * SIZE);
//                        //	stuff.add(i);
//                        stuff1.add(h);
//                        hostiles[xAxis][yAxis] = true;
//                    }
                }
            }
        }

        //healthpotion = new Item(100, 100);
        //healthpotion1 = new Item(450, 400);
        //stuff.add(healthpotion);
        //stuff.add(healthpotion1);
        //speedpotion = new item1(100,150);
        //speedpotion1 = new item1(450,100);	
        //stuff1.add(speedpotion);
        //stuff1.add(speedpotion1);
        //antidote = new itemwin(3004,92);
        //stuffwin.add(antidote);
        key1 = new Red_Mark(385, 380);
        keyz.add(key1);

        key2 = new Yellow_Mark(1470, 1595);
        keys.add(key2);

        key3 = new Purple_Mark(2560, 1300);
        key.add(key3);

        key4 = new Blue_Mark(1670, 1530);
        yek.add(key4);

        key5 = new Grey_Mark(1220, 2675);
        yek2.add(key5);

        bar1 = new Yellow_Bar(640, 415);
        barz.add(bar1);

        bar2 = new Red_Bar(2335, 1400);
        bars.add(bar2);

        bar3 = new Purple_Bar(1565, 2425);
        bar.add(bar3);

        bar4 = new Grey_Bar(1565, 2865);
        rab.add(bar4);

        bar5 = new Blue_Bar(0, 1550);
        rab2.add(bar5);
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
            throws SlickException {

        camera.centerOn((int) Player.x, (int) Player.y);

        camera.drawMap();

        camera.translateGraphics();

        // it helps to add status reports to see what's going on
        // but it gets old quickly
        // System.out.println("Current X: " +player.x + " \n Current Y: "+ y);
        sprite.draw((int) Player.x, (int) Player.y);

        //g.drawString("x: " + (int) Player.x + "  y: " + (int) Player.y, Player.x, Player.y - 10);
        //g.drawString("Health: " + player.health / 1000, camera.cameraX + 10,
        //camera.cameraY + 10);
        //g.drawString("speed: " + (int) (player.speed * 10), camera.cameraX + 10,
        //camera.cameraY + 25);
        //g.draw(Player.rect);
        g.drawString("Time: " + counter / 1000, camera.cameraX + 50, camera.cameraY);
        // moveenemies();
        for (Purple_Bar pb : bar) {
            if (pb.isvisible) {
                pb.currentImage.draw(pb.x, pb.y);
                // draw the hitbox
                //g.draw(yb.hitbox);

            }
        }

        for (Grey_Bar gb : rab) {
            if (gb.isvisible) {
                gb.currentImage.draw(gb.x, gb.y);
                // draw the hitbox
                //g.draw(yb.hitbox);

            }
        }

        for (Red_Bar rb : bars) {
            if (rb.isvisible) {
                rb.currentImage.draw(rb.x, rb.y);
                // draw the hitbox
                //g.draw(yb.hitbox);

            }
        }

        for (Yellow_Bar yb : barz) {
            if (yb.isvisible) {
                yb.currentImage.draw(yb.x, yb.y);
                // draw the hitbox
                //g.draw(yb.hitbox);

            }
        }

        for (Blue_Bar bb : rab2) {
            if (bb.isvisible) {
                bb.currentImage.draw(bb.x, bb.y);
                // draw the hitbox
                //g.draw(yb.hitbox);

            }
        }

        for (Grey_Mark gk : yek2) {
            if (gk.isvisible) {
                gk.currentImage.draw(gk.x, gk.y);
                // draw the hitbox
                //g.draw(yk.hitbox);

            }
        }

        for (Blue_Mark bk : yek) {
            if (bk.isvisible) {
                bk.currentImage.draw(bk.x, bk.y);
                // draw the hitbox
                //g.draw(yk.hitbox);

            }
        }

        for (Purple_Mark pk : key) {
            if (pk.isvisible) {
                pk.currentImage.draw(pk.x, pk.y);
                // draw the hitbox
                //g.draw(yk.hitbox);

            }
        }

        for (Yellow_Mark yk : keys) {
            if (yk.isvisible) {
                yk.currentImage.draw(yk.x, yk.y);
                // draw the hitbox
                //g.draw(yk.hitbox);

            }
        }
        for (Red_Mark rk : keyz) {
            if (rk.isvisible) {
                rk.currentImage.draw(rk.x, rk.y);
                //draw the hitbox
                //g.draw(rk.hitbox);

            }
        }

        for (ItemWin w : stuffwin) {
            if (w.isvisible) {
                w.currentImage.draw(w.x, w.y);
                // draw the hitbox
                //g.draw(w.hitbox);

            }
        }

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta)
            throws SlickException {

        counter += delta;

        Input input = gc.getInput();

        float fdelta = delta * Player.speed;

        Player.setpdelta(fdelta);

        double rightlimit = (grassMap.getWidth() * SIZE) - (SIZE * 0.75);

        // System.out.println("Right limit: " + rightlimit);
        float projectedright = Player.x + fdelta + SIZE;

        boolean cangoright = projectedright < rightlimit;

        // there are two types of fixes. A kludge and a hack. This is a kludge.
        if (input.isKeyDown(Input.KEY_UP)) {

            sprite = up;

            float fdsc = (float) (fdelta - (SIZE * .15));

            if (!(isBlocked(Player.x, Player.y - fdelta) || isBlocked((float) (Player.x + SIZE + 1.5), Player.y - fdelta))) {

                sprite.update(delta);

                // The lower the delta the slower the sprite will animate.
                Player.y -= fdelta;

            }

        } else if (input.isKeyDown(Input.KEY_DOWN)) {

            sprite = down;

            if (!isBlocked(Player.x, Player.y + SIZE + fdelta)
                    || !isBlocked(Player.x + SIZE - 1, Player.y + SIZE + fdelta)) {

                sprite.update(delta);

                Player.y += fdelta;

            }

        } else if (input.isKeyDown(Input.KEY_LEFT)) {

            sprite = left;

            if (!(isBlocked(Player.x - fdelta, Player.y) || isBlocked(Player.x
                    - fdelta, Player.y + SIZE - 1))) {

                sprite.update(delta);

                Player.x -= fdelta;

            }

        } else if (input.isKeyDown(Input.KEY_RIGHT)) {

            sprite = right;

            // the boolean-kludge-implementation
            if (cangoright
                    && (!(isBlocked(Player.x + SIZE + fdelta,
                            Player.y) || isBlocked(Player.x + SIZE + fdelta, Player.y
                            + SIZE - 1)))) {

                sprite.update(delta);

                Player.x += fdelta;

            } // else { System.out.println("Right limit reached: " +
            // rightlimit);}

        }

        Player.rect.setLocation(Player.getplayershitboxX(),
                Player.getplayershitboxY());
        for (Purple_Bar pb : bar) {

            if (Player.hasPurplekey && Player.rect.intersects(pb.hitbox)) {
                //System.out.println("yay RED");
                if (pb.isvisible) {
                    // Player.health += 10000;
                    pb.isvisible = false;
                }

            } else if (!Player.hasPurplekey && Player.rect.intersects(pb.hitbox)) {
                Player.y += -10;
            }

            for (Grey_Bar gb : rab) {

                if (Player.hasGreykey && Player.rect.intersects(gb.hitbox)) {
                    //System.out.println("yay RED");
                    if (gb.isvisible) {
                        // Player.health += 10000;
                        gb.isvisible = false;
                    }

                } else if (!Player.hasGreykey && Player.rect.intersects(gb.hitbox)) {
                    Player.y += -10;
                }

                for (Red_Bar rb : bars) {

                    if (Player.hasRedkey && Player.rect.intersects(rb.hitbox)) {
                        //System.out.println("yay RED");
                        if (rb.isvisible) {
                            // Player.health += 10000;
                            rb.isvisible = false;
                        }

                    } else if (!Player.hasRedkey && Player.rect.intersects(rb.hitbox)) {
                        Player.y += 10;
                    }

                    for (Yellow_Bar yb : barz) {

                        if (Player.hasYellowkey && Player.rect.intersects(yb.hitbox)) {
                            //System.out.println("yay RED");
                            Player.x -= 10;
                            if (yb.isvisible) {
                                // Player.health += 10000;
                                yb.isvisible = false;
                            }

                        } else if ((!Player.hasYellowkey) && Player.rect.intersects(yb.hitbox)) {
                            Player.x += 10;
                        }

                        for (Blue_Bar bb : rab2) {

                            if (Player.hasBluekey && Player.rect.intersects(bb.hitbox)) {
                                //System.out.println("yay RED");
                                if (bb.isvisible) {
                                    // Player.health += 10000;
                                    bb.isvisible = false;
                                    unlocked = true;
                                }

                            } else if (!Player.hasBluekey && Player.rect.intersects(yb.hitbox)) {
                                Player.x += 10;
                            }
                            for (Grey_Mark gk : yek2) {

                                if (Player.hasPurplekey && Player.rect.intersects(gk.hitbox)) {
                                    //System.out.println("yay RED");
                                    if (gk.isvisible) {

                                        // Player.health += 10000;
                                        Player.setGreykey();
                                        gk.isvisible = false;
                                    }

                                }

                                for (Blue_Mark bk : yek) {

                                    if (Player.hasGreykey && Player.rect.intersects(bk.hitbox)) {
                                        //System.out.println("yay RED");
                                        if (bk.isvisible) {

                                            // Player.health += 10000;
                                            Player.setBluekey();
                                            bk.isvisible = false;
                                        }

                                    }

                                    for (Purple_Mark pk : key) {

                                        if (Player.hasRedkey && Player.rect.intersects(pk.hitbox)) {
                                            //System.out.println("yay RED");
                                            if (pk.isvisible) {

                                                // Player.health += 10000;
                                                Player.setPurplekey();
                                                pk.isvisible = false;
                                            }

                                        }

                                        for (Red_Mark rk : keyz) {

                                            if (Player.hasYellowkey && Player.rect.intersects(rk.hitbox)) {
                                                //System.out.println("yay RED");
                                                if (rk.isvisible) {

                                                    // Player.health += 10000;
                                                    Player.setRedkey();
                                                    rk.isvisible = false;
                                                }

                                            }
                                        }

                                        for (Yellow_Mark yk : keys) {

                                            if (Player.rect.intersects(yk.hitbox)) {
                                                //System.out.println("yay YELLOW");
                                                if (yk.isvisible) {
                                                    Player.setYellowkey();
                                                    // Player.health += 10000;
                                                    yk.isvisible = false;
                                                }
                                            }
                                        }
//                                        for (Item1 h : stuff1) {
//                                            if (Player.rect.intersects(h.hitbox)) {
//                                                System.out.println("yay");
//                                                if (h.isvisible) {
//
//                                                    Player.speed += .1f;
//                                                    h.isvisible = false;
//                                                }
//
//                                            }
//                                        }

                                        for (ItemWin w : stuffwin) {

                                            if (Player.rect.intersects(w.hitbox)) {
                                                //System.out.println("yay");
                                                if (w.isvisible) {
                                                    w.isvisible = false;
                                                    //   makevisible();
                                                    sbg.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));

                                                }
                                            }
                                        }

                                        //Player.health -= counter / 1000;
                                        if (Player.health <= 0) {
                                            //  makevisible();
                                            sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                                        }
                                        if (unlocked) {
                                            sbg.enterState(3, new FadeOutTransition(Color.white), new FadeInTransition(Color.white));
                                        }

                                        if (counter == 20) {
                                            sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int getID() {

        return 1;

    }

    public void makevisible() {

//        for (Item1 h : stuff1) {
//
//            h.isvisible = true;
//        }
        //for (Item i : stuff) {
        //i.isvisible = true;}
    }

    private boolean isBlocked(float tx, float ty) {

        int xBlock = (int) tx / SIZE;

        int yBlock = (int) ty / SIZE;

        return Blocked.blocked[xBlock][yBlock];

        // this could make a better kludge
    }

}
