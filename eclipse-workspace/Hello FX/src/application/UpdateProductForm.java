import javax.swing.*;
import java.awt.*;

public class UpdateProductForm extends JFrame {
    public UpdateProductForm() {
        setTitle("Update Product Details");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JLabel titleLabel = new JLabel("Update Product Details", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titleLabel, gbc);

        // Reset gridwidth
        gbc.gridwidth = 1;

        // Product ID
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Product Id"), gbc);

        gbc.gridx = 1;
        JLabel productIdLabel = new JLabel("<dynamic>");
        panel.add(productIdLabel, gbc);

        // Product Name
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Product Name"), gbc);

        gbc.gridx = 1;
        JTextField productNameField = new JTextField("Smartphone");
        panel.add(productNameField, gbc);

        // Quantity
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Quantity"), gbc);

        gbc.gridx = 1;
        JSpinner quantitySpinner = new JSpinner(new SpinnerNumberModel(50, 0, 1000, 1));
        panel.add(quantitySpinner, gbc);

        // Sales Price
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Sales Price"), gbc);

        gbc.gridx = 1;
        JSpinner priceSpinner = new JSpinner(new SpinnerNumberModel(700.00, 0, 10000, 1));
        panel.add(priceSpinner, gbc);

        // Minimum Quantity
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Minimum Quantity"), gbc);

        gbc.gridx = 1;
        JSpinner minQtySpinner = new JSpinner(new SpinnerNumberModel(5, 0, 100, 1));
        panel.add(minQtySpinner, gbc);

        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        JButton updateButton = new JButton("Update Product");
        JButton cancelButton = new JButton("Cancel");
        buttonPanel.add(updateButton);
        buttonPanel.add(cancelButton);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        // Back Button
        gbc.gridy = 7;
        JButton backButton = new JButton("BACK");
        panel.add(backButton, gbc);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdateProductForm();
    }
}
