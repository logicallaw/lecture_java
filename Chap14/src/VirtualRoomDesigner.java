import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class VirtualRoomDesigner extends JFrame {

    private JPanel roomPanel;

    public VirtualRoomDesigner() {
        setTitle("Virtual Interior Designer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 기본 방 패널 설정
        roomPanel = new JPanel();
        roomPanel.setBackground(Color.WHITE);
        roomPanel.setLayout(null);  // Absolute layout for drag and drop

        add(createToolbar(), BorderLayout.NORTH);
        add(createSidebar(), BorderLayout.EAST);
        add(new JScrollPane(roomPanel), BorderLayout.CENTER);

        // 예제 가구 추가
        addFurniture("Sofa", 50, 50);
    }

    private JToolBar createToolbar() {
        JToolBar toolbar = new JToolBar();
        toolbar.add(new JButton("Room Settings"));
        toolbar.add(new JButton("Furniture Selection"));
        toolbar.add(new JButton("Decorations"));
        return toolbar;
    }

    private JPanel createSidebar() {
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.add(new JLabel("Premium Features"));
        sidebar.add(new JButton("Additional Furniture Sets"));
        sidebar.add(new JButton("Design Tips"));
        sidebar.add(new JButton("Personalized Design Service"));
        return sidebar;
    }

    private void addFurniture(String name, int x, int y) {
        JLabel furniture = new JLabel(name);
        furniture.setOpaque(true);
        furniture.setBackground(Color.LIGHT_GRAY);
        furniture.setBounds(x, y, 100, 50);

        MouseAdapter ma = new MouseAdapter() {
            private Point initialClick;
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int thisX = furniture.getLocation().x;
                int thisY = furniture.getLocation().y;

                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                furniture.setLocation(X, Y);
            }
        };

        furniture.addMouseListener(ma);
        furniture.addMouseMotionListener(ma);

        roomPanel.add(furniture);
        roomPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VirtualRoomDesigner designer = new VirtualRoomDesigner();
            designer.setVisible(true);
        });
    }
}