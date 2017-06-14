package Program;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Luka on 14.06.2017.
 */
public class Highscore {
    private int score;
    private String name;
    private JButton okBtn;
    private JTextField NameField;
    private JLabel ScoreLabel;
    private JPanel panel;
    private ArrayList<Score> highscoreList = new ArrayList<>();

    public Highscore(int nScore) {
        score = nScore;
        JFrame ScoreDialog = new JFrame("Score");
        ScoreDialog.setSize(new Dimension(400, 300));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        ScoreDialog.setLocation(dim.width/2-ScoreDialog.getSize().width/2, dim.height/2-ScoreDialog.getSize().height/2);
        ScoreDialog.setContentPane(panel);
        ScoreLabel.setText("You achieved a score of " + score);
        ScoreDialog.setVisible(true);

        okBtn.addActionListener(e -> {
            try {
                ReadHighscore();
                WriteScore();
                sortList();
                deleteLastLine();
                WriteInHighscore();

                ScoreDialog.dispose();
            }
            catch (Exception ignored){}
        });
    }

    public Highscore(){}

    private void WriteInHighscore() throws IOException {
        PrintWriter writer = new PrintWriter("src//main//resources//Highscore.txt");
        writer.print("");
        writer.close();

        Writer output = new BufferedWriter(new FileWriter("src//main//resources//Highscore.txt", true));
        for (Score item : highscoreList){
            output.append(item.getName()).append(":").append(Integer.toString(item.getPoints())).append("\n");
        }
        output.close();
    }

    private void WriteScore(){
        name = NameField.getText();
        if(name.isEmpty()) return;

        highscoreList.add(new Score(name, score));
    }

    private void ReadHighscore(){
        try (BufferedReader in = new BufferedReader(new FileReader("src//main//resources//Highscore.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] value = line.split(":");
                highscoreList.add(new Score(value[0], Integer.parseInt(value[1])));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sortList(){
        highscoreList.sort((h1, h2) -> h2.getPoints() - h1.getPoints());
    }

    private void deleteLastLine(){
        int line = 0;
        for (Score item : highscoreList){
            if (line > 9){
                highscoreList.remove(item);
                return;
            }
            line++;
        }
    }

    public ArrayList<Score> getHighscoreList(){
        ReadHighscore();
        return highscoreList;
    }
}

