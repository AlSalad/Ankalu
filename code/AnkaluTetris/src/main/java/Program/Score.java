package Program;

/**
 * Created by Luka on 14.06.2017.
 */

public class Score {
    private String name;
    private int points;

    public Score(String nName, String nPoints ){
        name = nName;
        points = Integer.parseInt(nPoints);
    }

    int getPoints(){
        return points;
    }

    String getName(){
        return name;
    }
}