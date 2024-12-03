// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

import java.util.ArrayList;

public class Player {
    private String name;
    public int rating;
    public double totalPoints = 0;
    public ArrayList<Results> resultsList;
    public int gamesPlayed;

    // default constructor
    public Player() {
        resultsList = new ArrayList<Results>();
    }

    public Player(String name, int rating) {
        this();
        this.name = name;
        this.rating = rating;
    }

    public void updatePointTotal(int resultIndex) {
        if (resultIndex == 1) {
            this.totalPoints += 1;
        }
        else if (resultIndex == 2) {
            this.totalPoints += 0.5;
        }
    }

    public String toString() {
        gamesPlayed = resultsList.size();
        String message1 = this.name + " " + this.rating + ", " + this.totalPoints + "/" + this.gamesPlayed + "\n";
        String message2 = "";

        // loop for all players results
        for (int i = 0; i < resultsList.size(); i++) {
            message2 += this.resultsList.get(i).toString() + "\n";
        }
        return message1 + message2;
    }
}
