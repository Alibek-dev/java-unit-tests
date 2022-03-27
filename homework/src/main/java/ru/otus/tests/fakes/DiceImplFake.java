package ru.otus.tests.fakes;

import ru.otus.game.Dice;

public class DiceImplFake implements Dice {

    private int counter;

    public DiceImplFake() {
        int counter = 0;
    }

    @Override
    public int roll() {
        this.counter++;
        if (counter > 1) {
            return 2;
        } else return 1;
    }
}
