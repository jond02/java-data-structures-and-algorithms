package com.nwjon.jdsabook.chapter3;

/**
 * Created by jondann on 7/23/16.
 */
public class Chapter3Main {

    public static void main(String[] args) {

        Scoreboard scoreboard= new Scoreboard(10);

        scoreboard.add(new GameEntry("rog", 100));
        scoreboard.add(new GameEntry("doug", 300));
        scoreboard.add(new GameEntry("edgar", 350));
        scoreboard.add(new GameEntry("bill", 600));
        scoreboard.add(new GameEntry("jim", 601));
        scoreboard.add(new GameEntry("neil", 675));
        scoreboard.add(new GameEntry("ben", 250));
        scoreboard.add(new GameEntry("grant", 450));
        scoreboard.add(new GameEntry("jimmy", 50));
        scoreboard.add(new GameEntry("leBron", 150));
        scoreboard.add(new GameEntry("carl", 260));

        GameEntry cheater = scoreboard.remove(9);

        System.out.println(cheater.getName());
        System.out.println(scoreboard.toString());
    }
}
