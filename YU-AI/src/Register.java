import javax.swing.*;
import java.awt.*;

public class Register extends JFrame {
    public Register() {
        setTitle("Register");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Background Image
        JLabel background = new JLabel(new ImageIcon("src/image/register.jpg")); // simpan gambar sebagai bg-register.jpg
        background.setBounds(0, 0, 1024, 728);
        setContentPane(background);

        // Full Name
        JTextField fieldFullName = new JTextField();
        fieldFullName.setBounds(280, 225, 230, 25);
        fieldFullName.setBorder(null);
        add(fieldFullName);

        // Surname
        JTextField fieldSurname = new JTextField();
        fieldSurname.setBounds(280, 300, 230, 25);
        fieldSurname.setBorder(null);
        add(fieldSurname);

        // Email
        JTextField fieldEmail = new JTextField();
        fieldEmail.setBounds(280, 386, 230, 25);
        fieldEmail.setBorder(null);
        add(fieldEmail);

        // Password
        JPasswordField fieldPassword = new JPasswordField();
        fieldPassword.setBounds(280, 471, 230, 25);
        fieldPassword.setBorder(null);
        add(fieldPassword);

        // Register Button
        JButton btnRegister = new JButton();
        btnRegister.setBounds(365, 520, 280, 40); // tombol "Register" transparan
        makeTransparent(btnRegister);
        btnRegister.addActionListener(e -> {
            String fullName = fieldFullName.getText();
            String surname = fieldSurname.getText();
            String email = fieldEmail.getText();
            String password = new String(fieldPassword.getPassword());

            if (fullName.isEmpty() || surname.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lengkapi semua data", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                // Simpan ke database nanti di sini
                JOptionPane.showMessageDialog(this, "Akun berhasil didaftarkan!");
                new Login();
                dispose();
            }
        });
        add(btnRegister);

        setVisible(true);
    }

    private void makeTransparent(JButton btn) {
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
    }
}