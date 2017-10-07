import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class MainInterface implements ActionListener {
    private final KitchenScreen kitchenScreen = new KitchenScreen();
    private final CashierScreen cashierScreen = new CashierScreen();
        
    private int orderId = 1;
    private Order order = new Order(orderId);
    
    private JPanel waiterPanel = new JPanel();
    private JTextArea receiptArea = new JTextArea("Order #1", 10, 15);
    private JLabel receiptTotalLabel = new JLabel("Total: 0.00 €");
    private JButton placeOrderButton = new JButton("Place Order");
    
    public static void main(String[] args) {
        new MainInterface();        
    }
    
    public MainInterface() {
        addMenuButtons("Hamburger 3.99", "Cheeseburger 4.99", "Milk Shake 5.00", "Soda 2.00", "Fries 2.50");
        placeOrderButton.addActionListener(this);
        waiterPanel.add(placeOrderButton);
        JFrame frame = new JFrame("Waiter Touchscreen");
        frame.setSize(200, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(waiterPanel);
        frame.setVisible(true);
        
        JPanel receiptPanel = new JPanel();
        receiptPanel.add(receiptArea);
        receiptPanel.add(receiptTotalLabel);
        JFrame receipt = new JFrame("Receipt");
        receipt.setSize(200, 250);
        receipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        receipt.add(receiptPanel);
        receipt.setLocation(frame.getWidth(), 0);
        receipt.setVisible(true);
        
        order.addObserver(cashierScreen);
        order.addObserver(kitchenScreen);
    }
    
    private void addMenuButtons(String... items) {
        for (String b : items) {
            JButton button = new JButton(b);
            button.addActionListener(this);
            waiterPanel.add(button);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == placeOrderButton) {
            order.notifyObservers();
            order = new Order(++orderId);
            order.addObserver(cashierScreen);
            order.addObserver(kitchenScreen);
            receiptArea.setText("Order #" + orderId);
            receiptTotalLabel.setText("Total: 0.00 €");
            return;
        }
        
        String entry = e.getActionCommand();
        String name = entry.substring(0, entry.lastIndexOf(" "));
        float price = Float.valueOf(entry.substring(entry.lastIndexOf(" ") + 1));
        order.addFood(name, price);
        
        receiptTotalLabel.setText(String.format("Total: %.2f €", order.getTotal()));
        receiptArea.setText(receiptArea.getText() + "\n" + entry);
    }
}
