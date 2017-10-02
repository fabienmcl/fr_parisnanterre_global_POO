package model;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {
    RockPaperScissors rock;

    //initialisation RockPaperScissors
    @BeforeClass
    public void setUp(){
        rock = new RockPaperScissors();
    }
    @AfterClass
    public void tearDown(){
        rock = null;
    }

    @Test
    public void testPlay() throws Exception {
        assertEquals(rock.play(RPSEnum.PAPER,RPSEnum.SCISSORS),Result.LOST);
    }

    @Parameters({"paper","rock"})
    @Test
    public  void testWinPlay(String p1, String p2){
        assertEquals(rock.play(Result.valueOf(p1),Result.valueOf(p2)),Result.WIN;
    }
}