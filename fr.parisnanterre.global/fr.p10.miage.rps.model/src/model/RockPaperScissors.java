package model;

public class RockPaperScissors {
    public RockPaperScissors() {
        super();
    }

    public Result play(RPSEnum p1, RPSEnum p2){
        return  Result.LOST;
    }

    public  Result play(Player player1, Player p2){
        return Result.LOST;
    }
}
