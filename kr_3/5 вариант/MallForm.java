import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class MallForm extends JFrame{
    private JButton employeesButton;
    private JFrame mainWindow;
    protected static ArrayList<ShoppingMall> combobox1;

    private ArrayList<Employess> employeesList;
    private JTextField textField1;
    private JTextField textField2;
    private JSpinner spinner1;
    private JRadioButton YesRadioButton;
    private JRadioButton NoRadioButton;
    private JButton SendButton;
    private JPanel MallWindow;

    public MallForm(){
        super("Торговый центр");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(MallWindow);
        MallWindow.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 800, height = 300;
        setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);

        combobox1 = new ArrayList<ShoppingMall>();
        this.SendButton.addActionListener(new Button1Listener());


    }


    private class Button1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String name = textField1.getText();
                String address = textField2.getText();
                int floors = (Integer) spinner1.getValue();

                ShoppingMall newMall = new ShoppingMall(name, address, floors, ShoppingMall.isIsCinema());
                combobox1.add(newMall);


                String message = "Торговый центр добавлен:\n" +
                        "Название: " + newMall.getTitle() +
                        "\nАдрес: " + newMall.getAddress() +
                        "\nЭтажи: " + newMall.getFloors() +
                        "\nКинотеатр: " + newMall.isIsCinema();

                JOptionPane.showMessageDialog(MallForm.this, message);

                MallForm.this.dispose();
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(MallForm.this, "Введите корректные числовые значения");
            }
        }
    }


        }




