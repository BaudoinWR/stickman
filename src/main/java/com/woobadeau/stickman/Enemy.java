package com.woobadeau.stickman;

import com.woobadeau.stickman.main.Main;
import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.Thing;
import com.woobadeau.tinyengine.things.physics.Collider;
import com.woobadeau.tinyengine.things.physics.Movement;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.sprites.Sprite;

public class Enemy extends Sprite implements Collider {

    final Type type;

    Enemy(int nextInt) {
        super(TinyEngine.uiInterfaceProvider.getImage("/e_"+ Type.values()[nextInt].sprite), 10);
        type = Type.values()[nextInt];
        this.addBehavior(new Movement(new Vector2D(-15, 0))::move);
    }

    @Override
    public void collides(Thing thing) {
        if (thing instanceof Bullet) {
            if (((Bullet) thing).type == this.type) {
                this.destroy();
                thing.destroy();
                Score.currentScore++;
                return;
            }
        }
        Main.restart();
    }
}
