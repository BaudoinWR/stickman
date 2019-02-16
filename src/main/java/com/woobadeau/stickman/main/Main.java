package com.woobadeau.stickman.main;

import com.woobadeau.stickman.EnemySupplier;
import com.woobadeau.stickman.HighScore;
import com.woobadeau.stickman.Score;
import com.woobadeau.stickman.StickMan;
import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.Spawner;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.ui.swing.SwingUIInterfaceProvider;

public class Main {

    public static void main(String args[]) {
        TinyEngine.setup(800, 600, Main::run, new SwingUIInterfaceProvider());
        TinyEngine.start();
    }

    public static void restart() {
        TinyEngine.restart();
    }

    private static void run() {
        TinyEngine.spawn(StickMan::new);
        TinyEngine.spawn(() -> new Spawner<>(EnemySupplier::spawnEnemy, EnemySupplier::shouldSpawn), s -> s.move(new Vector2D(800, 325)));
        TinyEngine.spawn(Score::new);
        TinyEngine.spawn(HighScore::new);
        Score.currentScore = 0;
    }

}
