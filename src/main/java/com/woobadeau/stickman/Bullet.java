package com.woobadeau.stickman;

import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.physics.Collider;
import com.woobadeau.tinyengine.things.physics.Movement;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.sprites.Sprite;

class Bullet extends Sprite implements Collider {

    Type type;

    Bullet(Type type) {
        super(TinyEngine.uiInterfaceProvider.getImage("/b_"+type.sprite), 10);
        this.type = type;
        this.addBehavior(new Movement(new Vector2D(15, 0))::move);
    }

}
