// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

import java.util.List;

public class Player {
    private String name;
    private int rating;
    private Team team;
    public double totalPoints = 0;
    public List<Results> resultsList;

    // default constructor
    public Player() {

    }

    public Player(String name, int rating, Team team) {
        this.name = name;
        this.rating = rating;
        this.team = team;
    }

    public void updatePointTotal(int resultIndex) {
        if (resultIndex == 1) {
            this.totalPoints += 1;
        }
        else if (resultIndex == 2) {
            this.totalPoints += 0.5;
        }
    }
}
