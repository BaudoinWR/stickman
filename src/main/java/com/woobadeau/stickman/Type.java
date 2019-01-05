package com.woobadeau.stickman;

enum Type {
    SQUARE, CIRCLE, TRIANGLE;
    String sprite = this.name().toLowerCase()+".png";
}