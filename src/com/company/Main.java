package com.company;

public class Main {

    public static void main(String[] args) {

    int[][] field = {{1, 2, 3},
                     {3, 2, 1},
                     {1, 1, 1}};

    boolean cond;
    cond = winCheck(field);
    System.out.println("Is there three times the same number in one of the lines on the field? " + cond);

    }

    //method that checks the victory condition
    public static boolean winCheck(int[][] fieldCheck) {
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
