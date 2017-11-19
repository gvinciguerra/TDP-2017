import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameOfLifeUI extends JPanel {
    private GameOfLife game;

    public GameOfLifeUI(GameOfLife game) {
        this.game = game;
        game.attach(this);

        addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    int side = getSide();
                    int row = e.getY() / side;
                    int col = e.getX() / side;
                    game.getGrid()[row][col].toggle();
                    repaint();
                    revalidate();
                }
            });
    }

    public void notifyGridChanged() {
        repaint();
        revalidate();
    }

    private int getSide() {
        int sideA = (int) Math.ceil((float) getWidth() / game.getCols());
        int sideB = (int) Math.ceil((float) getHeight() / game.getRows());
        return Math.min(sideA, sideB);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);       
        g.setColor(Color.BLACK);
        g.clearRect(0, 0, getWidth(), getHeight());
        int side = getSide();
        for (int i = 0; i < game.getRows(); i++)
            for (int j = 0; j < game.getCols(); j++)
                if (game.getGrid()[i][j].isAlive())
                    g.fillRect(j * side, i * side, side, side);
    }

    public void startGame() {
        new Timer(400, new ActionListener() {
                private LifeVisitor lifeVisitor = new LifeVisitor();
                @Override
                public void actionPerformed(ActionEvent evt) {
                    game.advance(lifeVisitor);
                }
            }).start();
    }

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife(150, 150);
        GameOfLifeUI ui = new GameOfLifeUI(game);

        JButton button = new JButton("Start");
        button.setSize(400, 10);
        button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setEnabled(false);
                    ui.startGame();
                }
            });

        JFrame frame = new JFrame("Game of Life");
        frame.add(ui);
        frame.setSize(700, 700);
        frame.add(button, BorderLayout.PAGE_END);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
