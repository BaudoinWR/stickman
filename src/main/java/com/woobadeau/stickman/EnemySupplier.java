package com.woobadeau.stickman;

import java.util.concurrent.ThreadLocalRandom;

public class EnemySupplier {
    private static final int SPAWN_RATE = 10;
    private static int spawn = 0;

    public static Boolean shouldSpawn() {
        return spawn++ % SPAWN_RATE == 0;
    }

    public static Enemy spawnEnemy() {
        return new Enemy(ThreadLocalRandom.current().nextInt(Type.values().length));
    }
}
