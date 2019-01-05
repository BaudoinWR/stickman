package com.woobadeau.stickman;

import com.woobadeau.tinyengine.things.physics.Movement;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.sprites.Sprite;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Bullet extends Sprite {
    Bullet(Bullet.Type type) throws IOException {
        super(ImageIO.read(StickMan.class.getResourceAsStream(type.sprite)), 10);
        Movement e = new Movement(this);
        e.speed = new Vector2D(15, 0);
        this.getThings().add(e);

    }

    enum Type {
        SQUARE, CIRCLE, TRIANGLE;
        String sprite = "/b_"+this.name().toLowerCase()+".png";
    }
}
