import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VirtualTravelPlanner extends JFrame {
    private List<Trip> trips;
    private DefaultListModel<Trip> tripListModel;
    private JList<Trip> tripList;

    public VirtualTravelPlanner() {
        setTitle("Virtual Travel Planner");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        trips = new ArrayList<>();

        // Load trips from file
        loadTrips();

        tripListModel = new DefaultListModel<>();
        tripList = new JList<>(tripListModel);
        updateTripList();

        add(new JScrollPane(tripList), BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("Add Trip");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTrip();
            }
        });
        controlPanel.add(addButton);

        JButton deleteButton = new JButton("Delete Trip");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTrip();
            }
        });
        controlPanel.add(deleteButton);

        add(controlPanel, BorderLayout.SOUTH);
    }

    private void addTrip() {
        JTextField nameField = new JTextField(20);
        JTextField infoField = new JTextField(50);
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Trip Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Trip Information:"));
        panel.add(infoField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Add New Trip", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String info = infoField.getText();
            if (!name.isEmpty() && !info.isEmpty()) {
                Trip newTrip = new Trip(name, info);
                trips.add(newTrip);
                saveTrips();
                updateTripList();
            } else {
                JOptionPane.showMessageDialog(this, "Please enter both name and information.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void deleteTrip() {
        int selectedIndex = tripList.getSelectedIndex();
        if (selectedIndex != -1) {
            trips.remove(selectedIndex);
            saveTrips();
            updateTripList();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a trip to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateTripList() {
        tripListModel.clear();
        for (Trip trip : trips) {
            tripListModel.addElement(trip);
        }
    }

    private void loadTrips() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("trips.dat"))) {
            trips = (List<Trip>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            trips = new ArrayList<>();
        }
    }

    private void saveTrips() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("trips.dat"))) {
            oos.writeObject(trips);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VirtualTravelPlanner app = new VirtualTravelPlanner();
                app.setVisible(true);
            }
        });
    }
}

class Trip implements Serializable {
    private String name;
    private String info;

    public Trip(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return name + ": " + info;
    }
}