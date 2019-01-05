package com.woobadeau.stickman;

import com.woobadeau.tinyengine.things.physics.Vector2D;

public class HighScore extends Score {
    private static int highScore = 0;

    public HighScore(){
        super();
        this.move(new Vector2D(200, 20));
    }

    @Override
    public void afterUpdate() {
        if (Score.currentScore > highScore) {
            highScore = Score.currentScore;
        }
        this.string = "HighScore: " + highScore;
    }
}
