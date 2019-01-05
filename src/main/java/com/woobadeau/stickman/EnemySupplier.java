package com.woobadeau.stickman;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class EnemySupplier implements Supplier<Enemy> {
    private static final int SPAWN_RATE = 10;
    private static int spawn = 0;

    public static Boolean shouldSpawn() {
        return spawn++ % SPAWN_RATE == 0;
    }

    @Override
    public Enemy get() {
        try {
            return new Enemy(ThreadLocalRandom.current().nextInt(Type.values().length));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
