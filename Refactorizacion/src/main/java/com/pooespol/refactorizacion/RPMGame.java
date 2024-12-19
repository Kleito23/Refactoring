/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooespol.refactorizacion;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class RPMGame {
    public static ArrayList<Choice> choices;
    private Player p1;
    private Player p2;
    public static int roundsPlayed = 0;
    public static int draw = 0;
    public static boolean gameWon = false;
    public static final int minWin = 3; 
    
    public void start(){
        do{
        Retailer.printDetail(p1, p2);
        gameLogic();
        roundsPlayed++;
        Retailer.endGame(p1, p2);
        }while(!gameWon);
    }
    
    private void gameLogic(){
        final boolean choiceRockP1 = p1.getChoice() instanceof Rock;
        final boolean choicePaperP1 = p1.getChoice() instanceof Paper;
        final boolean choiceScissorP1 = p1.getChoice() instanceof Scissor;
        final boolean choiceRockP2 = p2.getChoice() instanceof Rock;
        final boolean choicePaperP2 = p2.getChoice() instanceof Paper;
        final boolean choiceScissorP2 = p2.getChoice() instanceof Scissor;
        if(choiceRockP1 && choicePaperP2) Retailer.player1Wins(p1);
        else if(choicePaperP1 && choiceRockP2) Retailer.player1Wins(p1);
        else if(choiceRockP1 && choiceScissorP2) Retailer.player1Wins(p1);
        else if(choiceScissorP1 && choiceRockP2) Retailer.player2Wins(p2);
        else if(choiceScissorP1 && choicePaperP2) Retailer.player1Wins(p1);
        else if(choicePaperP1 && choiceScissorP2) Retailer.player2Wins(p2);
        else Retailer.draw();
    }
    
    public static void updateDraw(){
        draw++;
    }
   public static void updateFlag(){
       gameWon = true;
   }
    public static void main(String[] args) {
        RPMGame game = new RPMGame();
        game.start();
    }
}
