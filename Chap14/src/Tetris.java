import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Tetris extends JFrame {

    private static final int BOARD_WIDTH = 10;
    private static final int BOARD_HEIGHT = 20;
    private static final int BLOCK_SIZE = 30;

    private Board board;
    private JLabel statusBar;

    public Tetris() {
        setTitle("Tetris");
        setSize(BOARD_WIDTH * BLOCK_SIZE, BOARD_HEIGHT * BLOCK_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        statusBar = new JLabel("Score: 0");
        add(statusBar, BorderLayout.SOUTH);

        board = new Board(this);
        add(board);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                board.processKey(e.getKeyCode());
            }
        });

        board.setFocusable(true);
        board.requestFocusInWindow();

        setVisible(true);
        board.setFocusable(true);
        board.requestFocus();
    }

    public JLabel getStatusBar() {
        return statusBar;
    }

    public static void main(String[] args) {
        new Tetris();
    }
}

class Board extends JPanel implements ActionListener {

    private static final int BOARD_WIDTH = 10;
    private static final int BOARD_HEIGHT = 20;
    private static final int BLOCK_SIZE = 30;
    private static final int TIMER_DELAY = 300;

    private Timer timer;
    private boolean[][] board;
    private Shape currentShape;
    private int score;
    private Tetris parent;

    public Board(Tetris parent) {
        this.parent = parent;
        setBackground(Color.BLACK);
        setFocusable(true);

        timer = new Timer(TIMER_DELAY, this);
        timer.start();

        board = new boolean[BOARD_HEIGHT][BOARD_WIDTH];
        score = 0;

        spawnNewShape();
    }

    private void spawnNewShape() {
        currentShape = Shape.randomShape();
        if (!canMove(currentShape, 0, 0)) {
            timer.stop();
            parent.getStatusBar().setText("Game Over! Score: " + score);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        drawShape(g);
    }

    private void drawBoard(Graphics g) {
        g.setColor(Color.GRAY);
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                if (board[i][j]) {
                    g.fillRect(j * BLOCK_SIZE, i * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
                }
            }
        }
    }

    private void drawShape(Graphics g) {
        g.setColor(currentShape.getColor());
        for (Point p : currentShape.getPoints()) {
            g.fillRect(p.x * BLOCK_SIZE, p.y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        }
    }

    private boolean canMove(Shape shape, int dx, int dy) {
        for (Point p : shape.getPoints()) {
            int newX = p.x + dx;
            int newY = p.y + dy;
            if (newX < 0 || newX >= BOARD_WIDTH || newY < 0 || newY >= BOARD_HEIGHT || board[newY][newX]) {
                return false;
            }
        }
        return true;
    }

    public void processKey(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                moveShape(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
                moveShape(1, 0);
                break;
            case KeyEvent.VK_DOWN:
                moveShape(0, 1);
                break;
            case KeyEvent.VK_UP:
                rotateShape();
                break;
        }
        repaint();
    }

    private void moveShape(int dx, int dy) {
        if (canMove(currentShape, dx, dy)) {
            currentShape.move(dx, dy);
        } else if (dy == 1) {
            fixShape();
        }
    }

    private void rotateShape() {
        Shape rotatedShape = currentShape.getRotatedShape();
        if (canMove(rotatedShape, 0, 0)) {
            currentShape = rotatedShape;
        }
    }

    private void fixShape() {
        for (Point p : currentShape.getPoints()) {
            board[p.y][p.x] = true;
        }
        removeFullLines();
        spawnNewShape();
    }

    private void removeFullLines() {
        int linesRemoved = 0;
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            boolean fullLine = true;
            for (int j = 0; j < BOARD_WIDTH; j++) {
                if (!board[i][j]) {
                    fullLine = false;
                    break;
                }
            }
            if (fullLine) {
                linesRemoved++;
                for (int k = i; k > 0; k--) {
                    System.arraycopy(board[k - 1], 0, board[k], 0, BOARD_WIDTH);
                }
                for (int j = 0; j < BOARD_WIDTH; j++) {
                    board[0][j] = false;
                }
            }
        }
        if (linesRemoved > 0) {
            score += linesRemoved * 100;
            parent.getStatusBar().setText("Score: " + score);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveShape(0, 1);
        repaint();
    }
}

class Shape {

    private Point[] points;
    private Color color;

    public Shape(Point[] points, Color color) {
        this.points = points;
        this.color = color;
    }

    public static Shape randomShape() {
        Random random = new Random();
        int shapeType = random.nextInt(7);
        switch (shapeType) {
            case 0: // Square shape
                return new Shape(new Point[]{new Point(4, 0), new Point(5, 0), new Point(4, 1), new Point(5, 1)}, Color.YELLOW);
            case 1: // Line shape
                return new Shape(new Point[]{new Point(3, 0), new Point(4, 0), new Point(5, 0), new Point(6, 0)}, Color.CYAN);
            case 2: // T shape
                return new Shape(new Point[]{new Point(4, 0), new Point(3, 1), new Point(4, 1), new Point(5, 1)}, Color.MAGENTA);
            case 3: // L shape
                return new Shape(new Point[]{new Point(3, 0), new Point(3, 1), new Point(4, 1), new Point(5, 1)}, Color.ORANGE);
            case 4: // J shape
                return new Shape(new Point[]{new Point(5, 0), new Point(3, 1), new Point(4, 1), new Point(5, 1)}, Color.BLUE);
            case 5: // S shape
                return new Shape(new Point[]{new Point(4, 0), new Point(5, 0), new Point(3, 1), new Point(4, 1)}, Color.GREEN);
            case 6: // Z shape
                return new Shape(new Point[]{new Point(3, 0), new Point(4, 0), new Point(4, 1), new Point(5, 1)}, Color.RED);
            default:
                return null;
        }
    }

    public Point[] getPoints() {
        return points;
    }

    public Color getColor() {
        return color;
    }

    public void move(int dx, int dy) {
        for (Point p : points) {
            p.x += dx;
            p.y += dy;
        }
    }

    public Shape getRotatedShape() {
        Point[] rotatedPoints = new Point[points.length];
        Point center = points[0];
        for (int i = 0; i < points.length; i++) {
            int x = points[i].x - center.x;
            int y = points[i].y - center.y;
            rotatedPoints[i] = new Point(center.x - y, center.y + x);
        }
        return new Shape(rotatedPoints, color);
    }
}