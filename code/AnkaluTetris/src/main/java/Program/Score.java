package Program;

/**
 * Created by Luka on 14.06.2017.
 */

public class Score {
    private String name;
    private int points;

    public Score(String nName, int nPoints ){
        name = nName;
        points = nPoints;
    }

    public int getPoints(){
        return points;
    }

    public String getName(){
        return name;
    }
}