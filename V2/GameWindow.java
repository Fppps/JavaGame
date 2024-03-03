import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow() {
        setTitle("Game " + Version);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton levelsButton = new JButton("Levels");
        levelsButton.setBounds(50, 50, 100, 30);
        panel.add(levelsButton);
        levelsButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Sorry..."));

        JButton optionsButton = new JButton("Options");
        optionsButton.setBounds(200, 50, 100, 30);
        panel.add(optionsButton);
        optionsButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Sorry..."));

        JButton creditsButton = new JButton("Credits");
        creditsButton.setBounds(50, 150, 100, 30);
        panel.add(creditsButton);
        creditsButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Sorry..."));

        JButton storyModeButton = new JButton("Story Mode");
        storyModeButton.setBounds(200, 150, 100, 30);
        panel.add(storyModeButton);
        storyModeButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Sorry..."));

        setVisible(true);
    }

    public static final String Version = "V0.1";

    public static void main(String[] args) {
        new GameWindow();
    }
}
