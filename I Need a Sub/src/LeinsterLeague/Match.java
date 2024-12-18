// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

import java.util.ArrayList;
import LeagueSubs.*;

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
    public void DeclareTeam(ArrayList<Player> thePlayers) throws Exception {
        // check correct number of players declared
        if (thePlayers.size() > this.boards) {
            throw new Exception("Violation: You have declared too many players! Please declare " + this.boards + " or less players instead.");
        }
        // validate team
        LeagueRules.checkRatingRules(thePlayers);
        LeagueRules.checkSubGames(thePlayers);
    }

    // team A is home, team B is away. Home team black on odd colour boards
    public void EnterResults(ArrayList<Player> playersTeamA, ArrayList<Player> playersTeamB, ArrayList<Integer> results, ArrayList<Boolean> subBoards) throws Exception {
        boolean isWhite = false;

        for (int i = 0; i < results.size(); i++) {
            // generate results for home team who always have Black on board one.
            Results homeResult = new Results(results.get(i), isWhite, subBoards.get(i), playersTeamA.get(i));
            playersTeamA.get(i).resultsList.add(homeResult);

            // toggle board colour, as the next result will always be the opposite board colour
            if (isWhite) {
                isWhite = false;
            }
            else {
                isWhite = true;
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
            Results awayResult = new Results(reverseResult, isWhite, subBoards.get(i), playersTeamB.get(i));
            playersTeamB.get(i).resultsList.add(awayResult);
        }
    }

    public String ToString() {
        return this.division + "\n" + this.teamA + " vs " + this.teamB + "\n";
    }

    public Division getDivision() {
        return division;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public int getBoards() {
        return boards;
    }
}
