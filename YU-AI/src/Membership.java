import javax.swing.*;
import java.awt.*;

public class Membership extends JFrame {

    public Membership() {
        setTitle("Membership");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        // Gambar background
        JLabel background = new JLabel(new ImageIcon("src/image/membership.jpg")); // simpan gambar di folder assets
        background.setBounds(0, 0, 1024, 728);
        setContentPane(background);

        // Tombol Continue - Weekly
        JButton btnWeekly = new JButton();
        btnWeekly.setBounds(160, 520, 165, 35); // posisi tombol continue pertama
        makeTransparent(btnWeekly);
        btnWeekly.addActionListener(e -> JOptionPane.showMessageDialog(this, "Weekly Plan Selected"));
        add(btnWeekly);

        // Tombol Continue - Monthly
        JButton btnMonthly = new JButton();
        btnMonthly.setBounds(420, 520, 165, 35); // posisi tombol continue kedua
        makeTransparent(btnMonthly);
        btnMonthly.addActionListener(e -> JOptionPane.showMessageDialog(this, "Monthly Plan Selected"));
        add(btnMonthly);

        // Tombol Continue - Yearly
        JButton btnYearly = new JButton();
        btnYearly.setBounds(680, 520, 165, 35); // posisi tombol continue ketiga
        makeTransparent(btnYearly);
        btnYearly.addActionListener(e -> JOptionPane.showMessageDialog(this, "Yearly Plan Selected"));
        add(btnYearly);

        // Tombol Back (kiri atas)
        JButton btnBack = new JButton();
        btnBack.setBounds(30, 30, 50, 50); // posisi panah back
        makeTransparent(btnBack);
        btnBack.addActionListener(e -> {
            new Lobby(); // kembali ke halaman awal
            dispose();
        });
        add(btnBack);

        setVisible(true);
    }

    private void makeTransparent(JButton btn) {
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
    }
}