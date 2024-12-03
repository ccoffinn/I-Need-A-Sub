// Student Name/ID: Sarah Scott B00165892
package LeagueSubs;
import LeinsterLeague.*;

import java.util.ArrayList;

public class LeagueRules {
    private static int maxRatingGap = 150;
    private static int maxGamesAsSub = 3;

    // a player cannot be on a higher board than another player if there
    // is a gap greater than 150 points between their ratings.
    public static void checkRatingRules(ArrayList<Player> playerA) throws Exception {
        for (int i = playerA.size() - 1; i > 0; i--) {
            for (int j = playerA.size() - 1; i > 0; i--) {
                if (playerA.get(j).rating - playerA.get(i).rating > maxRatingGap) {
                    throw new Exception("150 point rule violation identified between player " + playerA.get(i)
                    + " and " + playerA.get(j));
                }
            }
        }
    }

    // a player is only allowed to substitute for another team 3 times per season
    public static void checkSubGames(ArrayList<Player> playerA) throws Exception {
        // check how many times they have subbed
        int playerSubCount = 0;
        for (int i = 0; i < playerA.size(); i++) {
            if (playerA.get(i).resultsList.get(i).isSub) {
                playerSubCount += playerSubCount;
            }
        }

        if (playerSubCount >= maxGamesAsSub) {
            throw new Exception("This player has already played " + playerSubCount + "games as a sub. The Maximum is 3." );
        }
    }

    // check that a player is subbing to a team in a higher division, and they are from the same club
    public static void compareTeams(ArrayList<Player> playerA) throws Exception {
        
    }
}
