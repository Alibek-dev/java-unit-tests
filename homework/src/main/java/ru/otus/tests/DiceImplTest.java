package ru.otus.tests;

import ru.otus.game.DiceImpl;

public class DiceImplTest {
    private final DiceImpl diceImpl = new DiceImpl();

    public void testDiceImplNotLessMinNumber() {
        String scenario = "Тест не меньше минимального числа - 1";
        final int expected = 1;

        try {
            int actual = diceImpl.roll();
            if (actual < expected) {
                throw new AssertionError(String.format("Заданное число %d должно быть больше %d", actual, expected));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testDiceImplNotLessMaxNumber() {
        String scenario = "Тест не больше максимального числа - 6";
        final int expected = 6;

        try {
            int actual = diceImpl.roll();
            if (actual > expected) {
                throw new AssertionError(String.format("Заданное число %d не должно быть больше %d", actual, expected));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
