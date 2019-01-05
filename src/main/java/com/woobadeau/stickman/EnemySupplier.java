package com.woobadeau.stickman;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class EnemySupplier implements Supplier<Enemy> {
    @Override
    public Enemy get() {
        try {
            return new Enemy(ThreadLocalRandom.current().nextInt(Type.values().length));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
