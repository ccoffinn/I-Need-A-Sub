// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

import java.util.ArrayList;

public class Team {
    private TeamName name;
    private Division division;
    public ArrayList<Player> players;
    public ArrayList<Match> matches;

    // default constructor
    public Team() {
        players = new ArrayList<>();
        matches = new ArrayList<>();

    }

    public Team(TeamName name, Division division) {
        this();
        this.name = name;
        this.division = division;
    }

    public String toString() {
        String message1 = "Team: " + this.name + ", in Division: " + this.division + "\n";
        String message2 = "";
        String message3 = "";

        // loop for all players in team
        for (int i = 0; i < players.size(); i++) {
            message2 += this.players.get(i).toString() + "\n";
        }

        // loop for all matches team played
        for (int i = 0; i < matches.size(); i++) {
            message3 += this.matches.get(i).toString() + "\n";
        }

        return message1 + message2 + message3;
    }
}
