import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IdolJournalApp extends JFrame {
    private List<JournalEntry> journalEntries;
    private DefaultListModel<JournalEntry> journalListModel;
    private JList<JournalEntry> journalList;

    public IdolJournalApp() {
        setTitle("Idol Journal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        journalEntries = new ArrayList<>();

        // Load journal entries from file
        loadJournalEntries();

        journalListModel = new DefaultListModel<>();
        journalList = new JList<>(journalListModel);
        updateJournalList();

        add(new JScrollPane(journalList), BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("Add Journal Entry");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addJournalEntry();
            }
        });
        controlPanel.add(addButton);

        JButton deleteButton = new JButton("Delete Journal Entry");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteJournalEntry();
            }
        });
        controlPanel.add(deleteButton);

        add(controlPanel, BorderLayout.SOUTH);
    }

    private void addJournalEntry() {
        JTextField dateField = new JTextField(20);
        JTextArea contentArea = new JTextArea(5, 20);
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Date (YYYY-MM-DD):"));
        panel.add(dateField);
        panel.add(new JLabel("Journal Entry:"));
        panel.add(new JScrollPane(contentArea));

        int result = JOptionPane.showConfirmDialog(null, panel, "Add New Journal Entry", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String date = dateField.getText();
            String content = contentArea.getText();
            if (!date.isEmpty() && !content.isEmpty()) {
                JournalEntry newEntry = new JournalEntry(date, content);
                journalEntries.add(newEntry);
                saveJournalEntries();
                updateJournalList();
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void deleteJournalEntry() {
        int selectedIndex = journalList.getSelectedIndex();
        if (selectedIndex != -1) {
            journalEntries.remove(selectedIndex);
            saveJournalEntries();
            updateJournalList();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a journal entry to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateJournalList() {
        journalListModel.clear();
        for (JournalEntry entry : journalEntries) {
            journalListModel.addElement(entry);
        }
    }

    private void loadJournalEntries() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("journalEntries.dat"))) {
            journalEntries = (List<JournalEntry>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            journalEntries = new ArrayList<>();
        }
    }

    private void saveJournalEntries() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("journalEntries.dat"))) {
            oos.writeObject(journalEntries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                IdolJournalApp app = new IdolJournalApp();
                app.setVisible(true);
            }
        });
    }
}

class JournalEntry implements Serializable {
    private String date;
    private String content;

    public JournalEntry(String date, String content) {
        this.date = date;
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return date + ": " + content;
    }
}