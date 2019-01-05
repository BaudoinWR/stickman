package com.woobadeau.stickman.main;


import com.woobadeau.stickman.Enemy;
import com.woobadeau.stickman.EnemySupplier;
import com.woobadeau.stickman.StickMan;
import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.Spawner;
import com.woobadeau.tinyengine.things.physics.Vector2D;

import java.io.IOException;

public class Main {

    private static int spawnRate = 10;
    private static int spawn = 0;

    public static void main(String args[]) throws IOException {

        new StickMan();
        new Spawner<Enemy>(new EnemySupplier(), () -> spawn++ % spawnRate == 0).move(new Vector2D(800, 325));
        new TinyEngine(800, 600);

    }

}
