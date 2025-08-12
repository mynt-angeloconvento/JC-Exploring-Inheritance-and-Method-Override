package org.example;

public class GameCharacter {
    private int health;

    public GameCharacter() {
        health = 100;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public int getHealth() {
        return health;
    }
}
