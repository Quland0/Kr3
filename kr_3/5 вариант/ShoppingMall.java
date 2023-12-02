import javax.swing.*;

public class ShoppingMall {
    private String title;
    private String address;
    private int floors;
    private static boolean isCinema = true;

    public ShoppingMall(String title, String address, int floors, boolean isCinema) {
        this.title = title;
        this.address = address;
        this.floors = floors;
        ShoppingMall.isCinema = isCinema;
    }

    public static boolean isIsCinema() {
        return isCinema;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void display() {

    }

    @Override
    public String toString() {
        return "title: " + title + "\nAddress: " + address + "\nfloors: " + floors
                + "\nhave cinema: " + isCinema;
    }
    public void inputShoppingMallData() {
        JTextField titleField = new JTextField();
        JTextField addressField = new JTextField();
        JTextField floorsField = new JTextField();
        JTextField isCinemaField = new JTextField();

        Object[] fields = {
                "Название торгового центра:", titleField,
                "Адрес:", addressField,
                "Этажи:", floorsField,
                "Наличие кинотеатра (true/false):", isCinemaField
        };

        int result = JOptionPane.showConfirmDialog(null, fields, "Введите данные о торговом центре", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            this.title = titleField.getText();
            this.address = addressField.getText();
            this.floors = Integer.parseInt(floorsField.getText());
            this.isCinema = Boolean.parseBoolean(isCinemaField.getText());
        }
    }
}


