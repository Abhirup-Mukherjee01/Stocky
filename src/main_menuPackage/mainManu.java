package main_menuPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainManu {
    private JButton dailyStockUpdateButton;
    private JButton newStockUpdateButton;
    private JButton inventoryButton;
    private JButton customerDetailsButton;
    private JButton adminSLoginButton;


    public mainManu() {
        customerDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customerDetails cd = new customerDetails();

            }
        });
    }
}
