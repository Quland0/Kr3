import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class first extends JFrame{
    private JButton MallButton;
    private JButton ToiletButton;
    private JButton ShopButton;
    private JButton EventButton;
    private JButton ParkingButton;
    private JButton EmployessButton;

    private JPanel MainWindow;
    private ArrayList<Employess> employeesList;
    private ArrayList<Shop> shopsList;
    private ArrayList<Toilet> toiletsList;
    private ArrayList<Event> eventsList;




    public first(){
        super("Торговый центр");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(MainWindow);
        employeesList = new ArrayList<>();
        shopsList = new ArrayList<>();
        toiletsList = new ArrayList<>();
        eventsList = new ArrayList<>();

        this.MallButton.addActionListener(new MallButtonListener());

        EmployessButton.addActionListener(new EmployeesButtonListener());
        ShopButton.addActionListener(new ShopButtonListener());
        ParkingButton.addActionListener(new ParkingButtonListener());
        ToiletButton.addActionListener(new ToiletButtonListener());
        EventButton.addActionListener(new EventButtonListener());
    }

    private class MallButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MallForm mall = new MallForm();
            mall.setVisible(true);


        }
    }

    private class EmployeesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                int numberOfEmployees = Integer.parseInt(JOptionPane.showInputDialog("Введите количество сотрудников:"));



                for (int i = 0; i < numberOfEmployees; i++) {

                    JTextField nameField = new JTextField();
                    JTextField ageField = new JTextField();
                    JTextField genderField = new JTextField();
                    JTextField shopField = new JTextField();

                    Object[] fields = {
                            "Имя:", nameField,
                            "Возраст:", ageField,
                            "Пол (М/Ж):", genderField,
                            "Магазин:", shopField
                    };

                    int result = JOptionPane.showConfirmDialog(null, fields, "Введите данные о сотруднике", JOptionPane.OK_CANCEL_OPTION);


                    if (result == JOptionPane.OK_OPTION) {
                        int age = Integer.parseInt(ageField.getText());
                        boolean isMan = genderField.getText().equalsIgnoreCase("М");
                        String shop = shopField.getText();

                        Employess newEmployee = new Employess(i + 1, nameField.getText(), age, isMan, shop);

                        employeesList.add(newEmployee);

                    }
                }
                StringBuilder employeesInfo = new StringBuilder("Информация о сотрудниках:\n");

                for (Employess employee : employeesList) {
                    employeesInfo.append(employee.toString()).append("\n\n");
                }

                JOptionPane.showMessageDialog(first.this, employeesInfo.toString());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(first.this, "Введите корректные значения");
            }
        }
    }
    private class ShopButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                int numberOfShops = Integer.parseInt(JOptionPane.showInputDialog("Введите количество магазинов:"));


                for (int i = 0; i < numberOfShops; i++) {
                    JTextField titleField = new JTextField();
                    JTextField descriptionField = new JTextField();
                    JTextField numOfEmployeesField = new JTextField();

                    Object[] fields = {
                            "Название магазина:", titleField,
                            "Описание:", descriptionField,
                            "Количество сотрудников:", numOfEmployeesField
                    };

                    int result = JOptionPane.showConfirmDialog(null, fields, "Введите данные о магазине", JOptionPane.OK_CANCEL_OPTION);


                    if (result == JOptionPane.OK_OPTION) {
                        String title = titleField.getText();
                        String description = descriptionField.getText();
                        int numOfEmployees = Integer.parseInt(numOfEmployeesField.getText());

                        Shop newShop = new Shop(i + 1, title, description, numOfEmployees);

                        shopsList.add(newShop);
                    }
                }


                StringBuilder shopsInfo = new StringBuilder("Информация о магазинах:\n");

                for (Shop shop : shopsList) {
                    shopsInfo.append(shop.toString()).append("\n\n");
                }

                JOptionPane.showMessageDialog(first.this, shopsInfo.toString());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(first.this, "Введите корректные значения");
            }
        }
    }
    private class ParkingButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                JTextField titleField = new JTextField();
                JTextField addressField = new JTextField();
                JTextField floorsField = new JTextField();
                JTextField isCinemaField = new JTextField();
                JTextField numoftotalSpacesField = new JTextField();
                JTextField emptyspaceField = new JTextField();
                JTextField emptyspasesField = new JTextField();

                Object[] fields = {
                        "Название торгового центра:", titleField,
                        "Адрес:", addressField,
                        "Этажи:", floorsField,
                        "Наличие кинотеатра (true/false):", isCinemaField,
                        "Общее количество парковочных мест:", numoftotalSpacesField,
                        "Наличие свободных мест (true/false):", emptyspaceField,
                        "Количество свободных мест:", emptyspasesField
                };

                int result = JOptionPane.showConfirmDialog(null, fields, "Введите данные о парковке", JOptionPane.OK_CANCEL_OPTION);


                if (result == JOptionPane.OK_OPTION) {
                    String title = titleField.getText();
                    String address = addressField.getText();
                    int floors = Integer.parseInt(floorsField.getText());
                    boolean isCinema = Boolean.parseBoolean(isCinemaField.getText());
                    int numoftotalSpaces = Integer.parseInt(numoftotalSpacesField.getText());
                    boolean emptyspace = Boolean.parseBoolean(emptyspaceField.getText());
                    int emptyspases = Integer.parseInt(emptyspasesField.getText());

                    Parking newParking = new Parking(title, address, floors, isCinema, numoftotalSpaces, emptyspace, emptyspases);

                    // parksList.add(newParking);


                    JOptionPane.showMessageDialog(first.this, newParking.toString());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(first.this, "Введите корректные значения");
            }
        }
    }
    private class ToiletButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                JTextField titleField = new JTextField();
                JTextField addressField = new JTextField();
                JTextField floorsField = new JTextField();
                JTextField isCinemaField = new JTextField();
                JTextField panField = new JTextField();
                JTextField urinalField = new JTextField();
                JTextField numberUrinalField = new JTextField();
                JTextField manWoomanField = new JTextField();

                Object[] fields = {
                        "Название торгового центра:", titleField,
                        "Адрес:", addressField,
                        "Этажи:", floorsField,
                        "Наличие кинотеатра (true/false):", isCinemaField,
                        "Количество унитазов:", panField,
                        "Наличие писуаров (true/false):", urinalField,
                        "Количество писуаров:", numberUrinalField,
                        "Разделение на мужские и женские кабинки (true/false):", manWoomanField
                };

                int result = JOptionPane.showConfirmDialog(null, fields, "Введите данные о туалете", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {
                    String title = titleField.getText();
                    String address = addressField.getText();
                    int floors = Integer.parseInt(floorsField.getText());
                    boolean isCinema = Boolean.parseBoolean(isCinemaField.getText());
                    int pan = Integer.parseInt(panField.getText());
                    boolean urinal = Boolean.parseBoolean(urinalField.getText());
                    int numberUrinal = Integer.parseInt(numberUrinalField.getText());
                    boolean manWooman = Boolean.parseBoolean(manWoomanField.getText());

                    Toilet newToilet = new Toilet(title, address, floors, isCinema, pan, urinal, numberUrinal, manWooman);
                    toiletsList.add(newToilet);


                    JOptionPane.showMessageDialog(first.this, newToilet.toString());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(first.this, "Введите корректные значения");
            }
        }
    }
    private class EventButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                JTextField titleField = new JTextField();
                JTextField addressField = new JTextField();
                JTextField floorsField = new JTextField();
                JTextField isCinemaField = new JTextField();
                JTextField eventNameField = new JTextField();
                JTextField descriptionField = new JTextField();
                JTextField dateAndTimeField = new JTextField();

                Object[] fields = {
                        "Название торгового центра:", titleField,
                        "Адрес:", addressField,
                        "Этажи:", floorsField,
                        "Наличие кинотеатра (true/false):", isCinemaField,
                        "Название события:", eventNameField,
                        "Описание:", descriptionField,
                        "Дата и время проведения:", dateAndTimeField
                };

                int result = JOptionPane.showConfirmDialog(null, fields, "Введите данные о событии", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {
                    String title = titleField.getText();
                    String address = addressField.getText();
                    int floors = Integer.parseInt(floorsField.getText());
                    boolean isCinema = Boolean.parseBoolean(isCinemaField.getText());
                    String eventName = eventNameField.getText();
                    String description = descriptionField.getText();
                    String dateAndTime = dateAndTimeField.getText();

                    Event newEvent = new Event(title, address, floors, isCinema, eventName, description, dateAndTime);
                    eventsList.add(newEvent);


                    JOptionPane.showMessageDialog(first.this, newEvent.toString());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(first.this, "Введите корректные значения");
            }
        }
    }

}