/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import bowling.Game;
import junit.framework.TestCase;

/**
 *
 * @author AXF3009
 */
public class BowlingTest extends TestCase{
    public Game testGame = new Game();
    
    private void bowlIt(int pins, int attempts) {
        for(int i = 0; i<attempts; i++){
            testGame.bowl(pins);
        }
    }
    
    public void testGutterGame() throws Exception{
        bowlIt(0, 20);
        assertEquals(0, testGame.score());
    }
    
    public void testAllOnesGame() throws Exception{
        bowlIt(1, 20);
        assertEquals(20, testGame.score());
    }
    
    public void testSpare() throws Exception{
        bowlIt(5, 3);
        bowlIt(0, 17);
        assertEquals(20, testGame.score());
    }
    
    public void testAllSparesGame() throws Exception{
        bowlIt(5, 21);
        assertEquals(150, testGame.score());
    }
    
    public void testStrike() throws Exception{
        bowlIt(10, 1);
        bowlIt(4, 2);
        bowlIt(0, 16);
        assertEquals(26, testGame.score());
    }
    
    public void testPerfectGame() throws Exception{
        bowlIt(10, 12);
        assertEquals(300, testGame.score());
    }
}
