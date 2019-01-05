package com.woobadeau.stickman;

import com.woobadeau.stickman.main.Main;
import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.Thing;
import com.woobadeau.tinyengine.things.physics.Collider;
import com.woobadeau.tinyengine.things.physics.Movement;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.sprites.Sprite;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Enemy extends Sprite implements Collider {

    final Type type;

    Enemy(int nextInt) throws IOException {
        super(ImageIO.read(StickMan.class.getResourceAsStream("/e_"+ Type.values()[nextInt].sprite)), 10);
        type = Type.values()[nextInt];
        this.addBehavior(new Movement(new Vector2D(-15, 0)));
    }

    @Override
    public void collides(Thing thing) {
        if (thing instanceof Bullet) {
            if (((Bullet) thing).type == this.type) {
                this.destroy();
                thing.destroy();
                return;
            }
        }
        Main.restart();
    }
}
