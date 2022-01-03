package com.bridgelabz;

public class TicTacToeMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Tic-Tac-Toe");
        //Create a 3x3 array that represents our tic tac toe board
        char[][] board = new char[3][3];

        //Initialize our board with dashes (empty positions)
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
}


