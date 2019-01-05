package com.woobadeau.stickman;

import com.woobadeau.tinyengine.things.physics.Collider;
import com.woobadeau.tinyengine.things.physics.Movement;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.sprites.Sprite;

import javax.imageio.ImageIO;
import java.io.IOException;

class Bullet extends Sprite implements Collider {

    Type type;

    Bullet(Type type) throws IOException {
        super(ImageIO.read(StickMan.class.getResourceAsStream("/b_"+type.sprite)), 10);
        this.type = type;
        this.addBehavior(new Movement(new Vector2D(15, 0)));
    }

}
