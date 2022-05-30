package com.bridgelabz;

import java.util.Scanner;

public class tic_tac_toe {

    static Scanner sc = new Scanner(System.in);

    void uc1(char[] ch) {
        for (int i = 1; i < 10; i++) {
            ch[i] = ' ';
        }
    }

    char uc2() {
        System.out.print("Enter X or O : ");
        return sc.next().charAt(0);
    }

    void showBoard(char choice, char ch[]) {
        System.out.print("Enter desired position in the board : ");
        int position = sc.nextInt();

        ch[position] = choice;
        System.out.print(" " + ch[1] + " | " + ch[2] + " | " + ch[3] + " \n-----------\n " + ch[4] + " | " + ch[5] + " | " + ch[6] + " \n-----------\n " + ch[7] + " | " + ch[8] + " | " + ch[9] + " ");

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe program");

        char[] ch = new char[10];
        tic_tac_toe t1 = new tic_tac_toe();
        t1.uc1(ch);

        char choice = t1.uc2();
        char choice1, choice2;

        if (choice == 'X') {
            System.out.println("Player chooses X and computer O");
            choice1 = choice;
            choice2 = 'O';
        } else {
            System.out.println("Player chooses O and computer chooses X");
            choice1 = choice;
            choice2 = 'X';
        }

        t1.showBoard(choice, ch);


    }
}