package com.nwjon.jdsabook.chapter3;

import java.util.Arrays;

/**
 * Created by jondann on 7/23/16.
 */
public class Scoreboard {

    private int numEntries = 0;
    private GameEntry[] board;

    public Scoreboard(int capacity){
        board = new GameEntry[capacity];
    }

    public void add(GameEntry gameEntry){

        //get the score
        int newScore = gameEntry.getScore();

        //check if number of entries has been reached or new score is greater then
        //the lowest score
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()){

            //increase entry list if board length hasn't been reached
            if (numEntries < board.length){
                numEntries++;
            }

            //get the index of the last entry
            int j = numEntries - 1;

            //while index is not 0, check if next entry is less then new score
            while (j > 0 && board[j - 1].getScore() < newScore){
                //shift back lower scores
                board[j] = board[j - 1];
                j--;
            }
            //add new score
            board[j] = gameEntry;
        }
    }

    public GameEntry remove(int index) throws IndexOutOfBoundsException {

        //check that index is not lower or higher than the array limits
        if (index < 0 || index >= numEntries){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        //save for return
        GameEntry temp = board[index];

        //starting at the index, move scores forward until reach second to last index of array
        for (int j = index; j < numEntries - 1; j++){
            board[j] = board[j + 1];
        }

        //set the last entry to null and subtract one from entries
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }

    @Override
    public String toString() {
        return "Scoreboard{" +
                "numEntries=" + numEntries +
                ", board=" + Arrays.toString(board) +
                '}';
    }
}
