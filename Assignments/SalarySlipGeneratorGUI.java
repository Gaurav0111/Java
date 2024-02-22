package Assignments;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalarySlipGeneratorGUI {
    private JFrame frame;
    private JPanel panel;

    private JTextField nameField;
    private JTextField addressField;
    private JTextField phoneField;
    private JTextField emailField;
    private JTextField salaryField;
    private JTextField overtimeDaysField;
    private JCheckBox advanceCheckBox;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new SalarySlipGeneratorGUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public SalarySlipGeneratorGUI() {
        frame = new JFrame("Salary Slip Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        createForm();

        JButton generateButton = new JButton("Generate Salary Slip");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateSalarySlip();
            }
        });

        panel.add(generateButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private void createForm() {
        nameField = createTextField("Name:");
        addressField = createTextField("Address:");
        phoneField = createTextField("Phone No.:");
        emailField = createTextField("Email ID:");
        salaryField = createTextField("Basic Salary:");
        overtimeDaysField = createTextField("Overtime Days:");
        advanceCheckBox = new JCheckBox("Salary Advance");

        panel.add(nameField);
        panel.add(addressField);
        panel.add(phoneField);
        panel.add(emailField);
        panel.add(salaryField);
        panel.add(overtimeDaysField);
        panel.add(advanceCheckBox);
    }

    private JTextField createTextField(String labelText) {
        JPanel fieldPanel = new JPanel();
        JLabel label = new JLabel(labelText);
        JTextField textField = new JTextField(20);

        fieldPanel.add(label);
        fieldPanel.add(textField);
        panel.add(fieldPanel);

        return textField;
    }

    private void generateSalarySlip() {
        // Fetch data from the text fields and checkboxes
        String name = nameField.getText();
        String address = addressField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();
        double basicSalary = Double.parseDouble(salaryField.getText());
        byte overtimeDays = Byte.parseByte(overtimeDaysField.getText());
        boolean hasAdvance = advanceCheckBox.isSelected();

        // Check for coordinates in the address (assuming latitude and longitude)
        String coordinates = extractCoordinates(address);

        // Display the details in a GUI dialog
        displayDetailsDialog(name, address, phone, email, basicSalary, overtimeDays, hasAdvance, coordinates);
    }

    private String extractCoordinates(String address) {
        // Simple check for coordinates (latitude and longitude)
        if (address.contains("Lat:") && address.contains("Long:")) {
            int latStart = address.indexOf("Lat:") + 4;
            int latEnd = address.indexOf(",", latStart);
            int longStart = address.indexOf("Long:") + 5;

            if (latEnd != -1) {
                String latitude = address.substring(latStart, latEnd).trim();
                String longitude = address.substring(longStart).trim();
                return "Coordinates: " + latitude + ", " + longitude;
            }
        }
        return "Coordinates not found";
    }

    private void displayDetailsDialog(String name, String address, String phone, String email,
                                      double basicSalary, byte overtimeDays, boolean hasAdvance, String coordinates) {
        // Display details in a GUI dialog based on the provided code
        String details = "\n\n\t\t\t\t Salary Slip\n" +
                "\t\t\t\t Company Information\n" +
                "Company Name : XYZ Pvt. Ltd\n" +
                "Company Address : Mussorie Road Dehradun, Uttarakhand \n" +
                "Company Phone No : 9568265862\n" +
                "Company Email Address : adminsupport@xyz.com\n" +
                "\n\n\t\t\t\tEmployee Information\n" +
                "Employee Name : " + name + "\n" +
                "Employee Address : " + address + "\n" +
                "Employee Phone no : " + phone + "\n" +
                "Employee Email ID : " + email;

        int hraSalary = (int) (basicSalary * 0.5);
        int daSalary = (int) (basicSalary * 0.2);
        int taSalary = (int) (basicSalary * 0.3);
        int maSalary = (int) (basicSalary * 0.25);
        int specialAllowancesEarning = hraSalary + daSalary + taSalary + maSalary;
        int grossSalary = (int) (basicSalary + specialAllowancesEarning);

        int pF = (int) (grossSalary * 0.05);
        int annualSalary = grossSalary * 12;
        int governmentTax = 0;
        if (annualSalary > 700000) {
            governmentTax = 10;
        } else if (annualSalary > 900000) {
            governmentTax = 20;
        } else if (annualSalary > 1000000) {
            governmentTax = 30;
        }
        governmentTax = ((annualSalary * governmentTax) / 100) / 12;

        details += "\nEarning \t\t Amount" + "\t\t" + "Deduction \t\t Amount\n" +
                "Basic \t\t\t " + "0" + "\t\t" + "Provident Fund  \t " + pF + "\n" +
                "HRA \t\t\t " + hraSalary + "\t\t" + "ESI \t\t\t " + "0" + "\n" +
                "Special Allowance \t " + specialAllowancesEarning + "\t\t" + "Professional tax \t " + governmentTax + "\n" +
                "Gross Salary \t\t " + grossSalary + "\t\t" + "Salary Advance \t\t " + "0" + "\n" +
                "Other Earning \t\t " + "0" + "\t\t" + "TDS \t\t\t " + "0" + "\n" +
                "Incentive \t\t " + "0" + "\t\t" + "Other Deductiont \t " + "0" + "\n" +
                "Bonus \t\t\t " + "0";

        int perDayOverTimeSalary = (int) (basicSalary / 30);
        details += "\nOver Time Pay \t\t " + perDayOverTimeSalary * overtimeDays;

        int totalEarnings = grossSalary + 0 + 0 + 0 + 0;
        int totalDeduction = pF + 0 + governmentTax + 0 + 0 + 0;
        details += "\nTotal Earning \t\t " + totalEarnings + "\t\t" + "Total Deduction \t" + totalDeduction + "\n\n" +
                "Net Pay : \t\t" + (totalEarnings - totalDeduction) + "\n\n";

        details += coordinates;

        JOptionPane.showMessageDialog(frame, details, "Salary Slip", JOptionPane.INFORMATION_MESSAGE);
    }
}
