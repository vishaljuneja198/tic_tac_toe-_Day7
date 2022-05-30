package com.bridgelabz;


import jdk.swing.interop.SwingInterOpUtils;
import java.util.Random;

import java.util.Scanner;

public class tic_tac_toe {

    static Scanner sc = new Scanner(System.in);
    static char winnerName, turn;
    static boolean flag = true;
    static char ch[];
    static int loop = 0;

    void uc1(char[] ch) {
        for (int i = 1; i < 10; i++) {
            ch[i] = ' ';
        }
    }

    char uc2() {

        Random r = new Random();
        int x = r.nextInt(2);

        if (x == 1) {
            System.out.println("User will start first");
            turn = 'U';
        } else {
            System.out.println("Computer will start first");
            turn = 'C';
        }

        System.out.print("Enter X or O : ");

        return sc.next().charAt(0);
    }

    void Winner() {
        for (int a = 0; a < 8; a++) {
            String line = "";

            switch (a) {
                case 0:
                    line = "" + ch[1] + ch[2] + ch[3];
                    break;
                case 1:
                    line = "" + ch[4] + ch[5] + ch[6];
                    break;
                case 2:
                    line = "" + ch[7] + ch[8] + ch[9];
                    break;
                case 3:
                    line = "" + ch[1] + ch[5] + ch[9];
                    break;
                case 4:
                    line = "" + ch[7] + ch[5] + ch[3];
                    break;
                case 5:
                    line = "" + ch[1] + ch[4] + ch[7];
                    break;
                case 6:
                    line = "" + ch[2] + ch[5] + ch[8];
                    break;
                case 7:
                    line = "" + ch[3] + ch[6] + ch[9];
                    break;
            }

            if (line.equals("XXX")) {
                flag = false;
                winnerName = 'X';
                break;
            } else if (line.equals("OOO")) {
                flag = false;
                winnerName = 'O';
                break;
            }
        }
        loop++;
        if (loop == 9) {
            if (flag != false)
                winnerName = 'd';
            flag = false;
        }
    }

    void showBoard(char choice) {

        int position;
        while (flag) {

            System.out.print("Enter desired position in the board: ");
            position = sc.nextInt();

            if (ch[position] != ' ') {
                System.out.print("input choice is already occupied, ");
                continue;
            } else {
                ch[position] = choice;
                System.out.print("\n " + ch[1] + " | " + ch[2] + " | " + ch[3] + " \n-----------\n " + ch[4] + " | " + ch[5] + " | " + ch[6] + " \n-----------\n " + ch[7] + " | " + ch[8] + " | " + ch[9] + " ");
            }
            Winner();

            if (flag) {
                if (choice == 'X')
                    choice = 'O';
                else
                    choice = 'X';

                if (turn == 'U') {
                    System.out.print("\nIt's Computer's turn now, ");
                    turn = 'C';
                } else {
                    System.out.print("\nIt's User's turn now, ");
                    turn = 'U';
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe program");

        ch = new char[10];

        tic_tac_toe t1 = new tic_tac_toe();
        t1.uc1(ch);

        char choice = t1.uc2();

        t1.showBoard(choice);

        if (winnerName != 'd')
            System.out.println("\nThe Winner is " + winnerName);
        else
            System.out.println("\nThe game is drawn");

    }
}