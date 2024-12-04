// Student Name/ID: Sarah Scott B00165892
package LeagueSubs;
import LeinsterLeague.*;
import java.util.ArrayList;

public class BestSub {

    public static String FindBestSub(Team teamA, boolean color) {
        // weights for my sub score
        int gameWon = 3;
        int gameDrawn = 1;
        int sameColor = 1;
        int wasSub = 1;

        // used to display final list to screen
        int subsDisplayed = 3;
        ArrayList<Integer> subScore;
        ArrayList<Integer> subIndex;
        String displayBestSubs = "";
        subScore = new ArrayList<>();
        subIndex = new ArrayList<>();

        // loop through all players on team
        for (int i = 0; i < teamA.players.size(); i++ ) {
            // store their sub score for each player
            int playerSubScore = 0;

            // check player [i] results
            for (int j = 0; j < teamA.players.get(i).resultsList.size(); j++ ) {
                // add points if they won
                if (teamA.players.get(i).resultsList.get(j).result == "win") {
                    playerSubScore += gameWon;
                    // bonus points if they played as sub or with same color
                    if (teamA.players.get(i).resultsList.get(j).isSub) {
                        playerSubScore += wasSub;
                    }
                    if (teamA.players.get(i).resultsList.get(j).color == color) {
                        playerSubScore += sameColor;
                    }
                }
                // add points if they drew
                else if (teamA.players.get(i).resultsList.get(j).result == "draw") {
                    playerSubScore += gameDrawn;
                    // bonus points if they played as sub or with same color
                    if (teamA.players.get(i).resultsList.get(j).isSub) {
                        playerSubScore += wasSub;
                    }
                    if (teamA.players.get(i).resultsList.get(j).color == color) {
                        playerSubScore += sameColor;
                    }
                }
            }

            subScore.add(playerSubScore);

        }

        // store the index of the three best subs
        int prevMaxValue = 9999;
        for (int i = 0; i < subsDisplayed; i++) {
            int maxValue = 0;
            int maxIndex = -1; // for non valid index
            for (int j = 0; j < subScore.size(); j++) {
                // update maxValue to remove highest value from next loop
                if (subScore.get(j) < prevMaxValue) {
                    if (subScore.get(j) > maxValue) {
                        maxValue = subScore.get(j);
                        maxIndex = j;
                    }
                }
            }
            // store index of the value and update previous max value
            subIndex.add(maxIndex);
            prevMaxValue = maxValue;
        }

        // get player info of three best subs
        for (int i = 0; i < teamA.players.size(); i++) {
            for (int j = 0; j < subIndex.size(); j++) {
                if (i == subIndex.get(j)) {
                    // update string
                    displayBestSubs += teamA.players.get(i).toString() + " Subscore: "
                            + subScore.get(i) + "\n";
                }
            }
        }
        return displayBestSubs;
    }
}
