package model;

import jdk.internal.cmm.SystemResourcePressureImpl;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    /*
    DataProvinder -> String
                    "wara"
    Param confing ( ou fichier de config XML)
            "wara" "PAPER"
    @test
    m(String p)
    o.play(RPSEnum.valueOf(p)

    Enum RPSEnum{
        PAPIER("PAPER")
        }
       ---- version RPSEnum
     DateProvider -> RPSEnum
     |
     |
     |
     @test
     m(RPSEnum p) {
        o.play(p);
     }
     */
    RockPaperScissors rock;
    Player playerUNO;
    Player playerDUO;

    //initialisation RockPaperScissors
    @BeforeClass
    public void setUp(){
        rock = new RockPaperScissors();
        playerUNO = new Player("uno");
        playerDUO = new  Player("duo");
    }
    @AfterClass
    public void tearDown(){
        rock = null;
        playerUNO = playerDUO = null;
    }

    @BeforeTest
    public void setUpClass(){

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
    //Win
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


    //lost
    @DataProvider(name = "winLost")
    public Object[][] createDataLost() {
        return new Object[][] {
                { RPSEnum.SCISSORS,RPSEnum.PAPER },
                { RPSEnum.PAPER, RPSEnum.ROCK},
                { RPSEnum.ROCK, RPSEnum.SCISSORS},
        };
    }

    @Test(dataProvider = "winLost")
    public void verifyDataLOST(RPSEnum n1, RPSEnum n2) {
        System.out.println(n1+" : "+n2);
        assertEquals(rock.play(n1,n2), Result.LOST);
    }
    //tie
    @DataProvider(name = "winTie")
    public Object[][] createDataTie() {
        return new Object[][] {
                { RPSEnum.SCISSORS,RPSEnum.PAPER },
                { RPSEnum.PAPER, RPSEnum.ROCK},
                { RPSEnum.ROCK, RPSEnum.SCISSORS},
        };
    }

    @Test(dataProvider = "winTie")
    public void verifyDataTIE(RPSEnum n1, RPSEnum n2) {
        System.out.println(n1+" : "+n2);
        assertEquals(rock.play(n1,n2), Result.LOST);
    }

    //suite
}