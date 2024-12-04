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
                    throw new Exception("Violation: 150 point rule violation identified between player:\n" + playerA.get(i)
                    + "\nand:\n" + playerA.get(j));
                }
            }
        }
    }

    // a player is only allowed to substitute for another team 3 times per season
    public static void checkSubGames(ArrayList<Player> playerA) throws Exception {
        for (int i = 0; i < playerA.size(); i++) {
            // track number of times player subbed
            int playerSubCount = 0;

            // check their results and throw exception
            for (int j = 0; j < playerA.get(i).resultsList.size(); j++) {
                if (playerA.get(i).resultsList.get(j).isSub) {
                    playerSubCount++;
                }

                if (playerSubCount >= maxGamesAsSub) {
                    throw new Exception("Violation: " + playerA.get(i).toString() + " \n Has already played " + playerSubCount + " games as a sub. The Maximum is 3." );
                }
            }
        }
    }

    public static int getMaxGamesAsSub() {
        return maxGamesAsSub;
    }

    public static int getMaxRatingGap() {
        return maxRatingGap;
    }
}
