package Program;

public class GameMode {

    private static int value;

    public static void setGameMode(int newValue){
        value = newValue;
    }

    static int getGameMode(){
        return value;
    }
}
