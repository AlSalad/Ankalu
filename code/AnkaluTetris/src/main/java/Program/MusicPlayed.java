package program;

import javax.sound.sampled.*;
import java.io.File;

public class MusicPlayed {

    private static String musicPath;
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

    public void setMusic(String musicPath){
        this.musicPath = musicPath;
    }

    public String getMusic(){
        return musicPath;
    }

    public void playSound(){clip.start();}

    public void stopSound(){
        clip.close();
    }
}
