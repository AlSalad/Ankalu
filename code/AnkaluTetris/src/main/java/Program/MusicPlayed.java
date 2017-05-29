package Program;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayed {

    private static String musicPlayed;
    private static Clip clip;

    MusicPlayed(){
        try {
            File musicFile = new File(musicPlayed);
            AudioInputStream stream = AudioSystem.getAudioInputStream(musicFile);
            AudioFormat format = stream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
        }
        catch (Exception ignored) {
        }
    }

    public static void SetMusic(String music){
        musicPlayed = music;
    }

    public static String GetMusic(){
        return musicPlayed;
    }

    void playSound(){clip.start();}

    void stopSound(){
        clip.close();
    }
}
