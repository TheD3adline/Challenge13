package com.company;

public class Main {

    public static void main(String[] args) {

    int[][] field = {{1, 2, 2},
                     {3, 2, 2},
                     {1, 1, 1}};

    boolean cond;
    cond = winCheck(field);
    System.out.println("Is there three times the same number in one of the lines on the field? " + cond);

    }

    //method that checks the victory condition
    public static boolean winCheck(int[][] fieldCheck) {
        int temp = 0;
        for(int i = 0; i < fieldCheck.length; i++) {
            if(fieldCheck[i][0] == fieldCheck[i][1] && fieldCheck[i][0] == fieldCheck[i][2]) {
                temp++;
            }
        }
        if(temp > 0) {
            return true;
        } else {
            return false;
        }
    }
}
