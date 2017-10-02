package model;

public enum Result {
    WIN("win"),
    LOST("lost"),
    TIE("tie");

    private final String result;

    Result(String result){
        this.result=result;
    }

    @Override
    public String toString() {
        return result;
    }
}