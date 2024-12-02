// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

public class Match {
    private Division division;
    private Team teamA;
    private Team teamB;
    private boolean isHome;
    private int boards;

    // default constructor
    public Match() {

    }

    public Match(Division division, Team teamA, Team teamB, boolean isHome) {
        this.division = division;
        this.teamA = teamA;
        this.teamB = teamB;
        this.isHome = isHome;
        this.boards = NumberOfBoards(division);
    }


    // divisions 1&2 have 8 boards, 3&4 have 6, 5&6 have 5.
    public int NumberOfBoards(Division division) {
        int boards = 0;

        if (division == Division.values()[0] || division == Division.values()[1]) {
            boards = 8;
        }
        else if (division == Division.values()[2] || division == Division.values()[3]) {
            boards = 6;
        }
        if (division == Division.values()[4] || division == Division.values()[6]) {
            boards = 5;
        }

        return boards;
    }

    // used to enter results of a match
    public void EnterResults() {

    }
}
