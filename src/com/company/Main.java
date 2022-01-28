package com.company;

public class Main {

    public static void main(String[] args) {

    int[][] field = new int[3][3];
    field[0][0] = 0;
    field[0][1] = 0;
    field[0][2] = 0;
    field[1][0] = 0;
    field[1][1] = 0;
    field[1][2] = 0;
    field[2][0] = 0;
    field[2][1] = 0;
    field[2][2] = 0;
    boolean cond;
    cond = check(field);
    System.out.println(cond);

    }

    //method checks the victory condition
    public static boolean check(int[][] fieldCheck) {
        if((fieldCheck[0][0] == fieldCheck[0][1] && fieldCheck[0][1] == fieldCheck[0][2]) && fieldCheck[0][0] != 0) {
            return true;
        } else if((fieldCheck[1][0] == fieldCheck[1][1] && fieldCheck[1][1] == fieldCheck[1][2]) && fieldCheck[1][0] != 0) {
            return true;
        } else if((fieldCheck[2][0] == fieldCheck[2][1] && fieldCheck[2][1] == fieldCheck[2][2]) && fieldCheck[2][0] != 0) {
            return true;
        } else {
            return false;
        }

    }

}
