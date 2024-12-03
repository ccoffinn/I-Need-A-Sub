// Student Name/ID: Sarah Scott B00165892
package LeinsterLeague;

public class Results {
    private String[] resultType = {"loss", "win", "draw"};
    private String result;
    private boolean color;
    private boolean isSub;

    // default constructor
    public Results() {

    }

    public Results(int resultIndex, boolean color, boolean isSub, Player player) {
        this.result = resultType[resultIndex];
        player.updatePointTotal(resultIndex);
        this.color = color;
        this.isSub = isSub;
    }

    public String toString() {
        // convert color bool to string
        String colorString = "";
        if (this.color) {
            colorString = "White";
        }
        else {
            colorString = "Black";
        }

        // convert isSub bool to string
        String isSubString = "";
        if (this.isSub) {
            isSubString = " Sub";
        }
        return colorString + " " + this.result + isSubString;
    }
}
