package com.woobadeau.stickman;

import com.woobadeau.tinyengine.TinyEngine;
import com.woobadeau.tinyengine.things.physics.Vector2D;
import com.woobadeau.tinyengine.things.ui.Text;

import java.awt.*;

public class Score extends Text {
    public static int currentScore = 0;

    public Score() {
        super("Score: ", TinyEngine.uiInterfaceProvider.getFont("Arial", Font.BOLD, 18), TinyEngine.uiInterfaceProvider.getGreen(), new Vector2D(500, 20));
    }

    @Override
    public void beforeUpdate() {
        this.string = "Score: " + currentScore;
    }
}
