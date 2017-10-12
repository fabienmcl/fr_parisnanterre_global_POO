package model;

import jdk.internal.cmm.SystemResourcePressureImpl;
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
    public  void testWinPlay(String p1, String p2) {
        assertEquals(rock.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)), Result.LOST);

    }

    @DataProvider(name = "winData")
    public Object[][] createDataWin() {
        return new Object[][] {
                { RPSEnum.SCISSORS,RPSEnum.PAPER },
                { RPSEnum.PAPER, RPSEnum.ROCK},
                { RPSEnum.ROCK, RPSEnum.SCISSORS},
        };
    }

    @Test(dataProvider = "winData")
    public void verifyDataWIN(RPSEnum n1, RPSEnum n2) {
        System.out.println(n1+" : "+n2);
        assertEquals(rock.play(n1,n2), Result.LOST);
    }
}