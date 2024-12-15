import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxApp extends JFrame implements ActionListener {
    private JTextField vtf;
    private JComboBox<String> cb;
    private JButton addb;

    public ComboBox() {
        super("Add to ComboBox");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel valp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel val = new JLabel("Enter a value: ");
        vtf = new JTextField(20);

        valp.add(val);
        valp.add(vtf);

        JPanel addp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cb = new JComboBox<>();
        addb = new JButton("Add to ComboBox");
        addb.addActionListener(this);

        addp.add(addb);
        addp.add(cb);

        setLayout(new BorderLayout());
        add(valp, BorderLayout.NORTH);
        add(addp, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = vtf.getText().trim();

        if (value.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in details", "Error", 

JOptionPane.ERROR_MESSAGE);
        } else {
            cb.addItem(value);
            vtf.setText("");
        }
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
