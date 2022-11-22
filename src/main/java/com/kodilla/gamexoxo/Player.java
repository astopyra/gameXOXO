package com.kodilla.gamexoxo;

import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
    //private char symbol;
    private String name;
    private boolean isWon = false;
    private char symbol = 'X';

    //public Player(char symbol){this.symbol = symbol;}

    public void setIsWon(boolean won) {
        isWon = won;
    }

    public void setName(){
        System.out.print("Jak masz na imie: ");
        name = scanner.nextLine();
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public boolean getIsWon() {
        return isWon;
    }

    /*public void setSymbol(char symbol) {
        this.symbol = symbol;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setWon(boolean won) {
        isWon = won;
    }
}
