package com.woobadeau.stickman.main;

import com.woobadeau.stickman.EnemySupplier;
import com.woobadeau.stickman.StickMan;
import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.Spawner;
import com.woobadeau.tinyengine.things.physics.Vector2D;

import java.io.IOException;

public class Main {

    private static TinyEngine tinyEngine;

    public static void main(String args[]) {
        tinyEngine = new TinyEngine(800, 600, Main::run);
        tinyEngine.start();
    }

    public static void restart() {
        tinyEngine.restart();
    }

    private static void run() {
        try {
            new StickMan();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new Spawner<>(new EnemySupplier(), EnemySupplier::shouldSpawn).move(new Vector2D(800, 325));
    }

}
