package com.woobadeau.stickman;

import com.woobadeau.tinyengine.things.physics.Movement;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.sprites.Sprite;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Enemy extends Sprite {

    Enemy(int nextInt) throws IOException {
        super(ImageIO.read(StickMan.class.getResourceAsStream(Type.values()[nextInt].sprite)), 10);
        this.addBehavior(new Movement(new Vector2D(-15, 0)));

    }

    enum Type {
        SQUARE, CIRCLE, TRIANGLE;
        String sprite = "/e_"+this.name().toLowerCase()+".png";
    }

    @Override
    public void update() {
        super.update();
    }
}