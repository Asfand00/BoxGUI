import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * This class uses the Box class for integration, creates a GUI for inputting
 * length, width, and height to create a Box Object. Contains buttons to process
 * certain information
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class BoxGUI extends JFrame {
    private final Box box; // Object Box as instance variable box

    /**
     * This is the Constructor for the BoxGUI class
     * Creates new JFrame f with new Box.
     */
    public BoxGUI() {
        JFrame f = new JFrame("Box"); // create frame f
        box = new Box(0.0,0.0,0.0); // initialize box with default values

        // add label Length to frame f
        JLabel lengthL = new JLabel("Length:");
        lengthL.setBounds(10,10,100,30);
        f.add(lengthL);

        // add text field for length to frame f
        JTextField lengthTF = new JTextField("0.0");
        lengthTF.setBounds(10,40,100,30);
        lengthTF.setEditable(true);
        f.add(lengthTF);

        // add label width to frame f
        JLabel widthL = new JLabel("Width:");
        widthL.setBounds(10,70,100,30);
        f.add(widthL);

        // add text field for width to frame f
        JTextField widthTF = new JTextField("0.0");
        widthTF.setBounds(10,100,100,30);
        widthTF.setEditable(true);
        f.add(widthTF);

        // add label height to frame f
        JLabel heightL = new JLabel("Height:");
        heightL.setBounds(10,130,100,30);
        f.add(heightL);

        // add text field for height to frame f
        JTextField heightTF = new JTextField("0.0");
        heightTF.setBounds(10,160,100,30);
        heightTF.setEditable(true);
        f.add(heightTF);

        // add button "Create Box" to frame f
        JButton createBox = new JButton("Create Box");
        createBox.setBounds(10,200,100,25);
        f.add(createBox);

        // when button "Create Box" is clicked set new data from text fields to box
        createBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // catch exception when input data is empty and display error message to user
                try {
                    String test_data1 = lengthTF.getText();
                    String test_data2 = widthTF.getText();
                    String test_data3 = heightTF.getText();
                    if (test_data1.isEmpty() || test_data2.isEmpty() || test_data3.isEmpty()) {
                        throw new Exception("Input is empty");
                    }

                    double length_data = Double.parseDouble(lengthTF.getText());
                    double width_data = Double.parseDouble(widthTF.getText());
                    double height_data = Double.parseDouble(heightTF.getText());
                    box.setLength(length_data);
                    box.setWidth(width_data);
                    box.setHeight(height_data);
                    lengthTF.setText("0.0");
                    widthTF.setText("0.0");
                    heightTF.setText("0.0");
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(f,"Error: " + ex.getMessage()); // display error message to user
                }
            }
        });

        // add button "Calculate Volume" to frame f
        JButton volume = new JButton("Calculate Volume");
        volume.setBounds(150, 40, 200, 30);
        f.add(volume);

        // when "Calculate Volume" is clicked, display volume to user in message
        volume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double length = box.getLength();
                double width = box.getWidth();
                double height = box.getHeight();
                double total = length * width * height;
                DecimalFormat d = new DecimalFormat("0.00");

                JOptionPane.showMessageDialog(f, "Volume: " + d.format(total));
            }
        });

        // add button "Calculate Surface Area" to frame f
        JButton surfaceArea = new JButton("Calculate Surface Area");
        surfaceArea.setBounds(150,90,200,30);
        f.add(surfaceArea);

        // when "Calculate Surface Area" is clicked, display surface area to user in message
        surfaceArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = 2 * box.getLength() * box.getWidth();
                double b = 2 * box.getLength() * box.getHeight();
                double c = 2 * box.getHeight() * box.getWidth();
                double SA = a + b + c;
                DecimalFormat d = new DecimalFormat("0.00");

                JOptionPane.showMessageDialog(f, "Surface Area: " + d.format(SA));
            }
        });

        // add button "Display Box Details" to frame f
        JButton displayBox = new JButton("Display Box Details");
        displayBox.setBounds(150,140,200,30);
        f.add(displayBox);

        // when "Display Box Details" is clicked, display length, width, and height to user in message
        displayBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Length: " + box.getLength() + "\n" +
                        "Width: " + box.getWidth() + "\n" + "Height: " + box.getHeight());
            }
        });

        // set frame f to certain size, layout is null, app is centered on screen and visible
        // exit application when frame is closed
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }

    /**
     * This is the main method to start the BoxGUI
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // asynchronous run method
        SwingUtilities.invokeLater(() -> {
            // create and call BoxGui to start app
            BoxGUI gui = new BoxGUI();
        });
    }
}