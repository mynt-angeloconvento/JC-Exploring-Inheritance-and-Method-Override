package org.example;

public class ArmoredCharacter extends GameCharacter {

    @Override
    public void takeDamage(int amount) {
        amount /= 2;
        super.takeDamage(amount);
    }

}
