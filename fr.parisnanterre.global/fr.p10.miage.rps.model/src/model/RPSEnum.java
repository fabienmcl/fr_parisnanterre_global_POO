package model;

import java.util.Random;

public enum  RPSEnum {
    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSORS("SCISSORS");

    private final String value;

    private static final RPSEnum[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static RPSEnum getRandomMouv()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    RPSEnum(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }
}
