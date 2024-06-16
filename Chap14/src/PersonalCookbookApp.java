import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonalCookbookApp extends JFrame {
    private List<Recipe> recipes;
    private DefaultListModel<Recipe> recipeListModel;
    private JList<Recipe> recipeList;

    public PersonalCookbookApp() {
        setTitle("Personal Cookbook");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        recipes = new ArrayList<>();

        // Load recipes from file
        loadRecipes();

        recipeListModel = new DefaultListModel<>();
        recipeList = new JList<>(recipeListModel);
        updateRecipeList();

        add(new JScrollPane(recipeList), BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        JButton addButton = new JButton("Add Recipe");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRecipe();
            }
        });
        controlPanel.add(addButton);

        JButton deleteButton = new JButton("Delete Recipe");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteRecipe();
            }
        });
        controlPanel.add(deleteButton);

        add(controlPanel, BorderLayout.SOUTH);
    }

    private void addRecipe() {
        JTextField nameField = new JTextField(20);
        JTextArea ingredientsField = new JTextArea(5, 20);
        JTextArea instructionsField = new JTextArea(5, 20);
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Recipe Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Ingredients:"));
        panel.add(new JScrollPane(ingredientsField));
        panel.add(new JLabel("Instructions:"));
        panel.add(new JScrollPane(instructionsField));

        int result = JOptionPane.showConfirmDialog(null, panel, "Add New Recipe", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String ingredients = ingredientsField.getText();
            String instructions = instructionsField.getText();
            if (!name.isEmpty() && !ingredients.isEmpty() && !instructions.isEmpty()) {
                Recipe newRecipe = new Recipe(name, ingredients, instructions);
                recipes.add(newRecipe);
                saveRecipes();
                updateRecipeList();
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void deleteRecipe() {
        int selectedIndex = recipeList.getSelectedIndex();
        if (selectedIndex != -1) {
            recipes.remove(selectedIndex);
            saveRecipes();
            updateRecipeList();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a recipe to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateRecipeList() {
        recipeListModel.clear();
        for (Recipe recipe : recipes) {
            recipeListModel.addElement(recipe);
        }
    }

    private void loadRecipes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("recipes.dat"))) {
            recipes = (List<Recipe>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            recipes = new ArrayList<>();
        }
    }

    private void saveRecipes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("recipes.dat"))) {
            oos.writeObject(recipes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PersonalCookbookApp app = new PersonalCookbookApp();
                app.setVisible(true);
            }
        });
    }
}

class Recipe implements Serializable {
    private String name;
    private String ingredients;
    private String instructions;

    public Recipe(String name, String ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    @Override
    public String toString() {
        return name;
    }
}