/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bowling;

/**
 *
 * @author AXF3009
 */
public class Game {
    public int currentTurn = 0;
    public int [] bowls = new int[21];

    public void bowl(int pins) {
        bowls[currentTurn++] = pins;
    }
    
    public int score(){
        int score = 0;
        int i = 0;
        for (int frame = 0; frame<10; frame++){
            if(bowls[i] == 10){
                score += 10 + bowls[i+1] + bowls[i+2];
                i++;
            }
            else if((bowls[i] + bowls[i+1]) == 10){
                score += 10 + bowls[i+2];
                i+=2;
            }
            else{
                score += bowls[i] + bowls[i+1];
                i+=2;
            }
        }
        return score;
    }
}
