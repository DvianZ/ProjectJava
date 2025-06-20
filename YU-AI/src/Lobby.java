import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lobby extends JFrame {

    public Lobby() {
        setTitle("CapDit!");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // ===== Gambar background =====
        JLabel background = new JLabel(new ImageIcon("src/image/lobby.jpg")); // simpan gambar di folder 'assets'
        background.setBounds(0, 0, 1024, 728);
        setContentPane(background);

        // ===== Tombol NEW (transparan) =====
        JButton btnNew = new JButton();
        btnNew.setBounds(350, 260, 80, 80); // atur posisi & ukuran sesuai tombol "NEW" di gambar
        makeTransparent(btnNew);
        btnNew.addActionListener(e -> JOptionPane.showMessageDialog(this, "NEW Project clicked!"));
        add(btnNew);

        // ===== Tombol LOAD (transparan) =====
        JButton btnLoad = new JButton();
        btnLoad.setBounds(520, 260, 80, 80); // atur posisi & ukuran sesuai tombol "LOAD" di gambar
        makeTransparent(btnLoad);
        btnLoad.addActionListener(e -> JOptionPane.showMessageDialog(this, "LOAD Project clicked!"));
        add(btnLoad);

        // Tombol PRO
        JButton btnPro = new JButton();
        btnPro.setBounds(780, 25, 80, 40); // tombol "PRO"
        makeTransparent(btnPro);
        btnPro.addActionListener(e -> {
        new Membership();
        dispose();
        });
        add(btnPro);

        // Tombol Pesan / Chat
        JButton btnChat = new JButton();
        btnChat.setBounds(120, 15, 40, 40); // tombol ikon chat
        makeTransparent(btnChat);
        btnChat.addActionListener(e -> JOptionPane.showMessageDialog(this, "Chat Button clicked!"));
        add(btnChat);

        setVisible(true);
    }

    private void makeTransparent(JButton btn) {
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
    }
}