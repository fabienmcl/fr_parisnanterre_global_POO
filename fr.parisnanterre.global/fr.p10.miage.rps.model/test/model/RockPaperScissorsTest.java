package model;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {
    RockPaperScissors rock;

    //initialisation RockPaperScissors
    @BeforeClass
    public void init(){
        rock = new RockPaperScissors();
    }

    @Test
    public void testPlay() throws Exception {
        assertEquals(rock.play(RPSEnum.PAPER,RPSEnum.SCISSORS),Result.LOST);
    }
}