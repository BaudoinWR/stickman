package com.woobadeau.stickman;

import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.sprites.Sprite;

import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class StickMan extends Sprite {

    public StickMan() throws IOException {
        super(ImageIO.read(StickMan.class.getResourceAsStream("/dude.png")), 10);
        move(new Vector2D(100, 300));
    }

    @Override
    public void update() {
        super.update();
        if (TinyEngine.keysDown.contains(KeyEvent.VK_Q)) {
            try {
                Bullet bullet = new Bullet(Bullet.Type.SQUARE);
                bullet.move(this.getPosition());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
