// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

import java.util.List;

public class Team {
    private TeamName name;
    private Division division;
    public List<Player> players;
    public List<Match> matches;

    // default constructor
    public Team() {

    }

    public Team(TeamName name, Division division) {
        this.name = name;
        this.division = division;
    }
}
