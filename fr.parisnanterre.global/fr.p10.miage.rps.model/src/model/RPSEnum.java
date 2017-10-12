package model;

public enum  RPSEnum {
    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSORS("SCISSORS");

    private final String value;

    RPSEnum(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }
}
