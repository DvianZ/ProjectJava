import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        setTitle("Login");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        // Background Image
        JLabel background = new JLabel(new ImageIcon("src/image/login.jpg")); // simpan gambar login sebagai bg-login.jpg
        background.setBounds(0, 0, 1024, 728);
        setContentPane(background);

        // ===== Field Email =====
        JTextField fieldEmail = new JTextField();
        fieldEmail.setBounds(365, 267, 230, 25); // posisikan tepat pada field 'Email'
        fieldEmail.setBorder(null);
        add(fieldEmail);

        // ===== Field Password =====
        JPasswordField fieldPassword = new JPasswordField();
        fieldPassword.setBounds(365, 342, 230, 25); // posisikan tepat pada field 'Password'
        fieldPassword.setBorder(null);
        add(fieldPassword);

        // ===== Tombol Sign In (transparan) =====
        JButton btnSignIn = new JButton();
        btnSignIn.setBounds(400, 385, 230, 40); // posisikan tepat di tombol hitam 'Sign In'
        makeTransparent(btnSignIn);
        btnSignIn.addActionListener(e -> {
            String email = fieldEmail.getText();
            String pass = new String(fieldPassword.getPassword());

            if (email.equals("admin@capdit.com") && pass.equals("admin123")) {
                new Lobby(); // buka halaman utama
                dispose(); // tutup login
            } else {
                JOptionPane.showMessageDialog(this, "Email atau Password salah", "Login Gagal", JOptionPane.ERROR_MESSAGE);
            }
        });
        add(btnSignIn);

        // ===== Tombol Register (teks: Register for new account) =====
        JButton btnRegister = new JButton();
        btnRegister.setBounds(510, 435, 135, 20); // sesuaikan posisi teks "Register for new account"
        makeTransparent(btnRegister);
        btnRegister.addActionListener(e -> {
            new Register(); // membuka form registrasi
            dispose(); // tutup halaman login
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}