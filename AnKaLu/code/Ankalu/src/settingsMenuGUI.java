import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class settingsMenuGUI extends JFrame{
    private JPanel panelSettings;
    private JButton musicBtn;
    private JButton aboutBtn;
    private JButton howToBtn;
    private JButton backToMain;

    public settingsMenuGUI(){
        JFrame frame = new JFrame("settingsMenuGUI");
        frame.setContentPane(panelSettings);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        musicBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    musicGUI sm = new musicGUI();
                    frame.dispose();
                }
                catch (Exception ex){

                }
            }
        });
        backToMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    MainMenu mM = new MainMenu();
                    frame.dispose();
                }
                catch (Exception ex){

                }
            }
        });
    }

}
