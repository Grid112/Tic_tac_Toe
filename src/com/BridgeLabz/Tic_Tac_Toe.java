package com.BridgeLabz;

import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Welcome to the tic tac toe");
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        printGameBoard(gameBoard);
        int pos = SC.nextInt();
        char letter = SC.next().charAt(0);
    }
}
