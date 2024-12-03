// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

import java.util.ArrayList;

public class Match {
    private Division division;
    private Team teamA;
    private Team teamB;
    private int boards;

    // default constructor
    public Match() {

    }

    // When a match is created, e.g fixtures are released at the start of the season
    // it does not contain any player info or results
    // this is only added when the match is played and results are entered
    // some other info such as date and round no. could be added but is not
    // needed for this demo version
    public Match(Division division, Team teamA, Team teamB) {
        this.division = division;
        this.teamA = teamA;
        this.teamB = teamB;
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
        if (division == Division.values()[4] || division == Division.values()[5]) {
            boards = 5;
        }

        return boards;
    }

    // used to declare team in advance of match, and make calls to league rules to check
    // if team is valid
    public void DeclareTeam(ArrayList<Player> thePlayers) {
        // TODO try gateway expression players=boards

        Player declaredPlayers[] = new Player[this.boards];
        for (int i = 0; i < this.boards; i++) {
            declaredPlayers[i] = thePlayers.get(i);
        }

        // TODO call rules checks
    }

    // team A is home, team B is away. Home team black on odd colour boards
    public void EnterResults(ArrayList<Player> playersTeamA, ArrayList<Player> playersTeamB, ArrayList<Integer> results, ArrayList<Boolean> subBoards) {
        boolean isBlack = true;

        for (int i = 0; i < playersTeamA.size(); i++) {
            // generate results for home team
            Results homeResult = new Results(results.get(i), isBlack, subBoards.get(i), playersTeamA.get(i));
            playersTeamA.get(i).resultsList.add(homeResult);

            // toggle board colour
            if (isBlack) {
                isBlack = false;
            }
            else {
                isBlack = true;
            }

            // result for one team on given board will always be reverse of
            // other team's result on that board
            int reverseResult = results.get(i);
            if (results.get(i) == 0) {
                reverseResult = 1;
            }
            else if (results.get(i) == 1) {
                reverseResult = 0;
            }

            // generate results for away team
            Results awayResult = new Results(reverseResult, isBlack, subBoards.get(i), playersTeamB.get(i));
            playersTeamB.get(i).resultsList.add(awayResult);
        }


    }

    public String ToString() {
return this.division + "\n" + this.teamA + " vs " + this.teamB + "\n";
    }



}
