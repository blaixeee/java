import javax.swing.*; // Import Java Swing library for GUI components
import java.awt.*; // Import Java AWT library for layout and other utilities
import java.awt.event.*; // Import AWT event library for handling user actions
import java.util.Random; // Import Random class to generate random numbers

public class RNA2 extends JFrame implements ActionListener { 
    private JButton genBut; // Button to generate random numbers
    private JTextArea rnta; // Text area to display random numbers
    private JScrollPane rsa; // Scroll pane to make the text area scrollable
    private Random rand; // Random object to generate random numbers
    private JButton clearBut; // Button to clear the text area

    public RNA2() { // Constructor to set up the GUI
        super("Random Number Adder"); // Set the title of the window
        setSize(600, 400); // Set the size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed

        genBut = new JButton("Generate 5 Random Numbers"); // Create a button for generating numbers
        genBut.addActionListener(this); // Add an action listener to the button to handle clicks

        rnta = new JTextArea(10, 30); // Create a text area with 10 rows and 30 columns
        rnta.setEditable(false); // Make the text area read-only to prevent user edits
        rsa = new JScrollPane(rnta); // Wrap the text area in a scroll pane for scrolling functionality

        clearBut = new JButton("Clear Numbers"); // Create a button for clearing the text area
        clearBut.addActionListener(this); // Add an action listener to the button to handle clicks

        setLayout(new BorderLayout()); // Set the layout of the window to BorderLayout
        add(genBut, BorderLayout.NORTH); // Add the "Generate" button to the top of the window
        add(rsa, BorderLayout.CENTER); // Add the scrollable text area to the center of the window
        add(clearBut, BorderLayout.SOUTH); // Add the "Clear" button to the bottom of the window

        rand = new Random(); // Initialize the Random object for generating numbers

        setVisible(true); // Make the window visible
    }

    @Override
    public void actionPerformed(ActionEvent e) { // Handle button click events
        if (e.getSource() == genBut) { // Check if the "Generate" button was clicked
            for (int i = 0; i < 5; i++) { // Loop 5 times to generate 5 numbers
                int rn = rand.nextInt(100); // Generate a random number between 0 and 99
                rnta.append(rn + "\n"); // Append the random number to the text area with a newline
            }
        } else if (e.getSource() == clearBut) { // Check if the "Clear" button was clicked
            rnta.setText(""); // Clear all text in the text area
        }
    }

    public static void main(String[] args) { // Main method to run the application
        new RNA2(); // Create an instance of the RNA class to display the GUI
    }
}
