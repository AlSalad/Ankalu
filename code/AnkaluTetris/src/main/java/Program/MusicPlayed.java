package Program;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayed {

    private String musicPath;
    private Clip clip;

    public MusicPlayed(){
        try {
            File musicFile = new File(musicPath);
            AudioInputStream stream = AudioSystem.getAudioInputStream(musicFile);
            AudioFormat format = stream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
        }
        catch (Exception ignored) {
        }
    }

    public void SetMusic(String musicPath){
        this.musicPath = musicPath;
    }

    public String GetMusic(){
        return musicPath;
    }

    void playSound(){clip.start();}

    void stopSound(){
        clip.close();
    }
}
