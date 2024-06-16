import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlantCareAssistant extends JFrame {
    private List<Plant> plants;
    private JPanel plantPanel;

    public PlantCareAssistant() {
        setTitle("Plant Care Assistant");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        plants = new ArrayList<>();

        // Load plants from file
        loadPlants();

        plantPanel = new JPanel();
        plantPanel.setLayout(new GridLayout(5, 5, 10, 10));
        add(new JScrollPane(plantPanel), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Plant");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPlant(new Plant("New Plant", "Water every 3 days"));
            }
        });
        add(addButton, BorderLayout.SOUTH);

        updatePlantPanel();
    }

    private void addPlant(Plant plant) {
        plants.add(plant);
        savePlants();
        updatePlantPanel();
    }

    private void updatePlantPanel() {
        plantPanel.removeAll();
        for (Plant plant : plants) {
            JButton plantButton = new JButton("<html>" + plant.getName() + "<br>" + plant.getWateringInfo() + "</html>");
            plantPanel.add(plantButton);
        }
        plantPanel.revalidate();
        plantPanel.repaint();
    }

    private void loadPlants() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("plants.dat"))) {
            plants = (List<Plant>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            plants = new ArrayList<>();
        }
    }

    private void savePlants() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("plants.dat"))) {
            oos.writeObject(plants);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PlantCareAssistant app = new PlantCareAssistant();
                app.setVisible(true);
            }
        });
    }
}

class Plant implements Serializable {
    private String name;
    private String wateringInfo;

    public Plant(String name, String wateringInfo) {
        this.name = name;
        this.wateringInfo = wateringInfo;
    }

    public String getName() {
        return name;
    }

    public String getWateringInfo() {
        return wateringInfo;
    }
}