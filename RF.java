import javax.swing.*;
import java.awt.*;

public class RF {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Registration Form");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel fn = new JLabel("First Name");
        JTextField fntf = new JTextField();
        JLabel ln = new JLabel("Last Name");
        JTextField lntf = new JTextField();
        JButton sb = new JButton("Submit");
        JButton cb = new JButton("Clear");

        sb.addActionListener(e -> {
            String f = fntf.getText().trim();
            String l = lntf.getText().trim();

            if (!f.isEmpty() && !l.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Welcome to my app, " + f + " " + l + "!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Please fill in details", "Error", JOptionPane.ERROR_MESSAGE);
		fntf.setText("");
		lntf.setText("");
            }
        });

        cb.addActionListener(e -> {
            fntf.setText("");
            lntf.setText("");
        });

        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.add(fn);
        frame.add(fntf);
        frame.add(ln);
        frame.add(lntf);
        frame.add(sb);
        frame.add(cb);

        frame.setVisible(true);
    }
}
