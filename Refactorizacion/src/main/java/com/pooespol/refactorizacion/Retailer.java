/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooespol.refactorizacion;

/**
 *
 * @author diego
 */
public class Retailer {
    
    public static void printDetail(Player p1, Player p2){
        System.out.println("******** ROUND: "+ RPMGame.roundsPlayed+ "********** \n");
        System.out.println("Number of draw: "+RPMGame.draw+ "\n");
        System.out.println("Player 1: "+ p1.getChoice()+ "\t Player 1 Total Wins: "+p1.getWins());
        System.out.println("Player 2: "+p2.getChoice() + "\t Player 2 Total Wins: "+ p2.getWins());
        
    }
    public static void player1Wins(Player p1){
        System.out.println("Player 1 Wins");
        p1.setWins();
    }
    public static void player2Wins(Player p2){
        System.out.println("Player 2 Wins");
        p2.setWins();
    }
    public static void draw(){
        RPMGame.updateDraw();
        System.out.println("\n\t\t\t DRAW");
    }
    public static void endGame(Player p1, Player p2){
        final boolean p1Win= p1.getWins()>= RPMGame.minWin;
        final boolean p2Win = p2.getWins()>= RPMGame.minWin;
        if(p1Win || p2Win ){
            RPMGame.updateFlag();
            System.out.println("GAME WON");
        }
        System.out.println();
    }
}
 