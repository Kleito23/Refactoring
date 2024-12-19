/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pooespol.refactorizacion;

/**
 *
 * @author diego
 */
import java.util.Random;
public class Player {
    private int wins;
    private int winTotal;
    private Choice choice;
    
    public void playerChoice(Choice c){
        Random rd = new Random();
        int randomNumber = rd.nextInt(RPMGame.choices.size());
        Choice choiceRandom = RPMGame.choices.get(randomNumber);
        setChoice(choiceRandom);
        
    }
    
    public void setWins(){
        winTotal+=wins;
    }
    public int getWins(){
        return wins;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }
    
    
}
