package com.woobadeau.stickman;

import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.physics.Collider;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.sprites.Sprite;

public class StickMan extends Sprite implements Collider {

    public StickMan() {
        super(TinyEngine.uiInterfaceProvider.getImage("/dude.png"), 10);
        move(new Vector2D(100, 300));
        TinyEngine.addKeyBinding("Q", () -> spawn(Type.SQUARE));
        TinyEngine.addKeyBinding("W", () -> spawn(Type.CIRCLE));
        TinyEngine.addKeyBinding("E", () -> spawn(Type.TRIANGLE));
    }

    private void spawn(Type type) {
        TinyEngine.spawn(() -> new Bullet(type), bullet -> bullet.move(this.getPosition().add(new Vector2D(0,25))));
    }
}
